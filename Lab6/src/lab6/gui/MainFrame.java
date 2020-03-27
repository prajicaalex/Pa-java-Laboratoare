/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.gui;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


/**     
 *
 * @author calan
 */
public class MainFrame extends JFrame {
private static final long serialVersionUID = 1L;
	ConfigurationPanel toolbar = new ConfigurationPanel();
	ControlPanel control = new ControlPanel();
	DrawingPanel canvas = new DrawingPanel(toolbar.getNodeSize().getValue().hashCode(),toolbar.getColors().getSelectedItem().toString());
	public MainFrame() {
		super("Drawing aplication");
		Init();
	}
	
	private void Init() {
		Container c=this.getContentPane();
	        this.setSize(600,600);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
 
	        c.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	        c.add(toolbar.drawingPanel, BorderLayout.NORTH);
	        c.add(control, BorderLayout.SOUTH);
	        c.add(canvas, BorderLayout.CENTER);
	       
	          this.toolbar.nodeButton.addActionListener(new ActionListener() {
	     	   @Override
	     	   public void actionPerformed(ActionEvent e) {
	     	     canvas.setParametres(toolbar.getNodeSize().getValue().hashCode(),toolbar.getColors().getSelectedItem().toString());
	     	   }
	        });
	          
	          
	          this.control.resetButton.addActionListener(new ActionListener() {
				@Override
	        	  public void actionPerformed(ActionEvent e) {
	        		  repaint();
	        	  }
	          });
	          
                  this.control.exitButton.addActionListener(new ActionListener() {
				@Override
	        	  public void actionPerformed(ActionEvent e) {
	        		System.exit(0);
	        	  }
	          });
	          

}
}
