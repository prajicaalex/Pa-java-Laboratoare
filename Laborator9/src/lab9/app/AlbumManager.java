/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.app;


import lab9.entity.Album;
import lab9.entity.Artist;
import lab9.repo.AlbumRepository;
import lab9.repo.ArtistRepository;
import lab9.util.PersistenceUtil;

/**
 *
 * @author calan
 */
public class AlbumManager {
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        PersistenceUtil pu=PersistenceUtil.getInstance();
        Artist artist1=new Artist();
        artist1.setId(50);
        artist1.setName("Alex");
        artist1.setCountry("Romania");
   
        Album album1= new Album();
        album1.setId(50);
        album1.setName("Album");
        album1.setReleaseYear(2016);
        
        ArtistRepository ar=new ArtistRepository(pu);
        AlbumRepository al=new AlbumRepository(pu);
        
        ar.create(artist1);
        al.create(album1);
        
        System.out.println(ar.findById(50));
        
    }
}
