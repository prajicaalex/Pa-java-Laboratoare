/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author calan
 */
public class PersistenceUtil {
    
 private static final PersistenceUtil singleton = new PersistenceUtil();
  
  protected EntityManagerFactory emf;
  
  public static PersistenceUtil getInstance() {
    
    return singleton;
  }
  
  private PersistenceUtil() {
  }
 
  public EntityManager getEntityManagerFactory() {
    this.emf = Persistence.createEntityManagerFactory("MusicAlbumsPU");
    EntityManager em=emf.createEntityManager();
    return em;
  }
  
  public void closeEntityManagerFactory() {
    
    if (emf != null) {
      emf.close();
      emf = null;
    }
  }
 
}   

