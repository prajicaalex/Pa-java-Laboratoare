/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.sql.SQLException;
import lab8.albums.AlbumController;
import lab8.artists.ArtistController;
import lab8.charts.ChartController;

/**
 *
 * @author calan
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
       ArtistController artist1=new ArtistController();
       artist1.create("Smiley", "Romania");
       artist1.create("Eminem", "America");
       artist1.create("Rihanna", "America");
       
       AlbumController album1=new AlbumController();
       
       album1.create("Acasa", 1, 2016);
       album1.create("Revival",2, 2017);
       album1.create("Loud", 3, 2010);
       System.out.println(artist1.findByName("Smiley"));
       
       
       
       ChartController chart=new ChartController();
       chart.create(1,4);
       chart.create(2,3);
       chart.create(3,2);
       
       
       System.out.println(chart.getAllArtists());
       
    }
    
}
