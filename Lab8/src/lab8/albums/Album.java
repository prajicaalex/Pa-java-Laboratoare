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
public class Album {
    private Integer id;
    private String name;
    private Integer artistId;
    private Integer releaseYear;
    
    public Album(){
        
    }
    public Album(Integer id, String name, Integer artistId, Integer releaseYear) {
        this.id = id;
        this.name = name;
        this.artistId = artistId;
        this.releaseYear = releaseYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", name=" + name + ", artistId=" + artistId + ", releaseYear=" + releaseYear + '}';
    }
    
    
}
