/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.charts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lab8.Database;
import lab8.artists.Artist;
import org.apache.derby.client.am.SqlException;

/**
 *
 * @author calan
 */
public class ChartController implements ChartDAO{

    @Override
    public boolean create(Integer albumId, Integer top) {
        Database database=new Database();
        try(Connection conn=database.getConnection();
            PreparedStatement ps=conn.prepareStatement("INSERT INTO charts VALUES(?,?)")){
            ps.setInt(1,albumId);
            ps.setInt(2, top);
            
            int i=ps.executeUpdate();
            if(i==1){
                System.out.println("Chart adaugat cu succes");
                return true;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Artist> getAllArtists() {
        List<Artist> artistList=new ArrayList<>();
        Database database=new Database();
        try(Connection conn=database.getConnection();
            PreparedStatement ps=conn.prepareStatement(
                    "Select * from artists"
                            
                    
            )){
            ResultSet rs = ps.executeQuery();
            while(rs.next()!=false){
                Integer id=rs.getInt("id");
                String name=rs.getString("name");
                String country=rs.getString("country");
                
                Artist artist=new Artist(id,name,country);
                artistList.add(artist);
                
            }
            return artistList;
        }catch(SQLException ex){
             ex.printStackTrace();
        }
        return null;
    }
    
}
