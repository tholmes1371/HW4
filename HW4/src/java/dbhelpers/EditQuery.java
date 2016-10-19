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
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Games;

/**
 *
 * @author tholm_000
 */
public class EditQuery {
    
    private Connection conn;
    
    public EditQuery()
    {
       Properties props = new Properties();
          InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(EditQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(EditQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          String driver = props.getProperty("driver.name");
          String url = props.getProperty("server.name");
          String username = props.getProperty("user.name");
          String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url,username,passwd);
        } catch (SQLException ex) {
            Logger.getLogger(EditQuery.class.getName()).log(Level.SEVERE, null, ex);
        } 
   
    }
           
    
    public void doEdit(int gameID, String gameName, int releaseYear, String console)
    {
        try {
            //set up a string to hold query
            String query = "UPDATE games SET gameName = ?, releaseYear = ?, console = ? WHERE gameID = ?";
            
            //create a prepared statement using the query string
            PreparedStatement ps = conn.prepareStatement(query);
            
            //fill in the preparedStatement
            ps.setString(1, gameName);
            ps.setInt(2, releaseYear);
            ps.setString(3, console);
            ps.setInt(4, gameID);
            
            //execute the query
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EditQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
}
