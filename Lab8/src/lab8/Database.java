/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author calan
 */
public class Database { 
    public static final String URL = "jdbc:derby://localhost:1527/MusicAlbums";
    public static final String USER = "dba";
    public static final String PASS = "sql";

    public Connection getConnection() throws SQLException{
        Connection con = null;
        try {
         con = DriverManager.getConnection(URL, USER, PASS);
         return con;
        } 
        catch(SQLException e) {
         System.err.println("Cannot connect to DB: " + e);
        } 
        
        
    return con;
    }
}
