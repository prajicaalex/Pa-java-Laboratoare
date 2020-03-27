/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.geom.Ellipse2D;

/**
 *
 * @author calan
 */
public class NodeShape  extends Ellipse2D.Double{
    public NodeShape(int x0, int y0, int radius) {
        super(x0 - radius / 2, y0 - radius / 2, radius, radius);
    }
  
}