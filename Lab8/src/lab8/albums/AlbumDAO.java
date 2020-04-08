/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.albums;

/**
 *
 * @author calan
 */
public interface AlbumDAO {
    public boolean create(String name, int artistId,int releaseYear);
    public Album findByArtist(int artistId);
}
