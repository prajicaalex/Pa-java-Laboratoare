/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.repo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import lab9.entity.Artist;
import lab9.util.PersistenceUtil;

/**
 *
 * @author calan
 */
public class ArtistRepository {
    private final PersistenceUtil util;

    public ArtistRepository(PersistenceUtil util) {
        this.util=util;
    }
    
    
    public void create(Artist artist){
        util.getEntityManagerFactory().getTransaction().begin();
        util.getEntityManagerFactory().persist(artist);
        util.getEntityManagerFactory().getTransaction().commit();
    }
    
    public Artist findById(Integer id){
        return util.getEntityManagerFactory().find(Artist.class, id);
    }
    
    public List<Artist> findByName(String name){
        Query q=util.getEntityManagerFactory().createNamedQuery("Artist.findByName");
        q.setParameter(1, name);
        return q.getResultList();
    }
    
   

}
