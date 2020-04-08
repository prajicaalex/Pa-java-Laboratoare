/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.artists;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lab8.Database;
import lab8.albums.Album;

/**
 *
 * @author calan
 */
public class ArtistController implements ArtistDAO {

    @Override
    public boolean create(String name, String country) {
        Database database=new Database();
         
        try(Connection conn=database.getConnection();
            PreparedStatement ps=conn.prepareStatement("INSERT INTO artists(name,country) VALUES(?,?)")){
          
            ps.setString(1,name);
            ps.setString(2,country);
            int i=ps.executeUpdate();
            if(i==1){
                System.out.println("Artist adaugat cu succes!");
                return true;
                
            }
            conn.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Artist findByName(String name) {
        Database database=new Database();
        try(Connection conn=database.getConnection();
            PreparedStatement ps=conn.prepareStatement("SELECT * from artists where name=?")){
            ps.setString(1,name);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                Artist artist=new Artist();
                artist.setId(rs.getInt("id"));
                artist.setName(rs.getString("name"));
                artist.setCountry(rs.getString("country"));
                
                return artist;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
  
}
