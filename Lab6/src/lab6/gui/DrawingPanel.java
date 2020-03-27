/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JPanel;
import shapes.NodeShape;

/**
 *
 * @author calan
 */
public class DrawingPanel extends JPanel{
    private static final long serialVersionUID = 1L;
    String color;
    int radius;
    BufferedImage image; 
	public DrawingPanel(int radius, String color){
		setParametres(radius,color);
		init();
	}
	public void setParametres(int radius, String color)
	{
		this.radius=radius;
		this.color=color;
	}
	
	public void drawNode(int x, int y) {
	        Random rand = new Random();	
	        image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
	        Graphics2D graphics = image.createGraphics();
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if(color.equals("Random"))
			  graphics.setColor(new Color(rand.nextInt(0xFFFFFF))); 
		if(color.equals("Red"))
				  graphics.setColor(new Color(250,0,0)); 
		if(color.equals("Green"))
				  graphics.setColor(new Color(0,250,0)); 
		if(color.equals("Blue"))
				  graphics.setColor(Color.blue);
                if(color.equals("Yellow"))
				  graphics.setColor(Color.yellow);
	        graphics.fill(new NodeShape(x, y, radius));
	        this.getGraphics().drawImage(image,0,0,this);
	    }
	public void drawPoint(int x,int y) {
		
		image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
                Graphics2D graphics = image.createGraphics();
	        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        graphics.fill(new NodeShape(x, y, 1));
                this.getGraphics().drawImage(image,0,0,this);
	}
	
	
	private void init() {
	this.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) { 
	               drawNode(e.getX(), e.getY());
	              
	        }
	    });
	}
	
	      
}


