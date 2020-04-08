/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.charts;

import java.util.ArrayList;
import java.util.List;
import lab8.artists.Artist;

/**
 *
 * @author calan
 */
public interface ChartDAO {
    public boolean create(Integer albumId,Integer top);
    public List<Artist> getAllArtists();
}
