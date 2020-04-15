/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.repo;

import java.util.List;
import javax.persistence.Query;
import lab9.entity.Album;
import lab9.entity.Artist;
import lab9.util.PersistenceUtil;

/**
 *
 * @author calan
 */
public class AlbumRepository {
     private final PersistenceUtil util;

    public AlbumRepository(PersistenceUtil util) {
        this.util=util;
    }
    
    public void create(Album album){
        if(album.getId()==null)
            util.getEntityManagerFactory().persist(album);
        else{
            album=util.getEntityManagerFactory().merge(album);
        }
    }
    
    public Album findById(Integer id){
        return util.getEntityManagerFactory().find(Album.class, id);
    }
    
    public List<Album> findByName(String name){
        Query q=util.getEntityManagerFactory().createNamedQuery("Album.findByName");
        q.setParameter(1, name);
        return q.getResultList();
    }
    
    /*public List<Album> findByArtist(Artist artist){
        
    }*/
}
