/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.albums;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lab8.Database;

/**
 *
 * @author calan
 */
public class AlbumController implements AlbumDAO{

    @Override
    public boolean create(String name, int artistId, int releaseYear) {
        Database database=new Database();
        try(Connection conn=database.getConnection();
            PreparedStatement ps=conn.prepareStatement("INSERT INTO albums(name,artist_id,release_year) VALUES(?,?,?)")){
            ps.setString(1,name);
            ps.setInt(2, artistId);
            ps.setInt(3, releaseYear);
            int i=ps.executeUpdate();
            if(i==1){
                System.out.println("Album adaugat cu succes");
                return true;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Album findByArtist(int artistId) {
        Database database=new Database();
        try(Connection conn=database.getConnection();
            PreparedStatement ps=conn.prepareStatement("SELECT * from albums where artist_id=?")){
            ps.setInt(1,artistId);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                Album album=new Album();
                album.setId(rs.getInt("id"));
                album.setName(rs.getString("name"));
                album.setArtistId(rs.getInt("artist_id"));
                album.setReleaseYear(rs.getInt("release_year"));
                
                return album;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
  
}
