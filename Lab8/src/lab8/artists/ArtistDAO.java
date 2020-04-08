/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.artists;

/**
 *
 * @author calan
 */
public interface ArtistDAO {
   public boolean create(String name, String country);
   public Artist findByName(String name);
}
