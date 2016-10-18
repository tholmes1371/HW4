
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

public class ReadQuery
{
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery()
        {
          Properties props = new Properties();
          InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          String driver = props.getProperty("driver.name");
          String url = props.getProperty("server.name");
          String username = props.getProperty("user.name");
          String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url,username,passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
                
    }
    public void doRead()
    {
        try {
            String query = "Select * from games";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public String getHTMLtable()
    {
        String table = "";
        table += "<table>";
        
        try {
            while(this.results.next()){
                
                Games game = new Games();
                game.setGameID(this.results.getInt("gameID"));
                game.setGameName(this.results.getString("gameName"));
                game.setReleaseYear(this.results.getInt("releaseYear"));
                game.setConsole(this.results.getString("console"));
                
                table += "<tr>";
                
                table += "<td>";
                table += game.getGameID();
                table += "</td>";
                
                table += "<td>";
                table += game.getGameName();
                table += "</td>";
                
                table += "<td>";
                table += game.getReleaseYear();
                table += "</td>";
                
                table += "<td>";
                table += game.getConsole();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=delete?gameID=" + game.getGameID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table>";
        
            return table;
    }

    
    
}
