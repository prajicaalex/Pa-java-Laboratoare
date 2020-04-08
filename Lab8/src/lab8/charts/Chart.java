/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.charts;

/**
 *
 * @author calan
 */
public class Chart {
    private Integer album_id;
    private Integer top;

    public Chart(Integer album_id, Integer top) {
        this.album_id = album_id;
        this.top = top;
    }

    public Chart() {
    }

    public Integer getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(Integer album_id) {
        this.album_id = album_id;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return "Chart{" + "album_id=" + album_id + ", top=" + top + '}';
    }
    
    
}
