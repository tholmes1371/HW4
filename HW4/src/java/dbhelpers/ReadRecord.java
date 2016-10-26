/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Games;

/**
 *
 * @author tholm_000
 */
public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Games game = new Games();
    private int gameID;
    
    
    public ReadRecord(int gameID){
    Properties props = new Properties();
          InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          String driver = props.getProperty("driver.name");
          String url = props.getProperty("server.name");
          String username = props.getProperty("user.name");
          String passwd = props.getProperty("user.password");
          
          this.gameID = gameID;
          
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url,username,passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
      
}
    
    public void doRead(){
        
        try {
            //setup string to hold query
            String query = "SELECT * FROM games WHERE gameID = ?";
            
            //create prepared statement
            PreparedStatement ps = conn.prepareStatement(query);
            
            //fill in preparedstatement
            ps.setInt(1, gameID);
            
            //execute query
            this.results = ps.executeQuery();
            
            this.results.next();
            
            game.setGameID(this.results.getInt("gameID"));
            game.setGameName(this.results.getString("gameName"));
            game.setReleaseYear(this.results.getInt("releaseYear"));
            game.setConsole(this.results.getString("console"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Games getGame(){
        
        return this.game;
    }


}
