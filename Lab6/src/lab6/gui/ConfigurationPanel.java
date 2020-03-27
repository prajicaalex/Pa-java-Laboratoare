/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

/**
 *
 * @author calan
 */
public class ConfigurationPanel extends JPanel{
    
   private static final long serialVersionUID = 1L;
   JPanel drawingPanel = new JPanel();
    final JLabel shapesSize = new JLabel("Size");
    final JLabel color = new JLabel("Color");
     final JLabel shape = new JLabel("Shape");
    final JComboBox<String> colors = new JComboBox<>();
    final JSpinner nodeSize;
    final Button nodeButton = new Button("Node");
   
    
	public ConfigurationPanel() {
		
        SpinnerModel sizeModel = new SpinnerNumberModel(40,40,100,1);
        nodeSize= new JSpinner(sizeModel);
  
        colors.addItem("Random");
        colors.addItem("Red");
        colors.addItem("Green");
        colors.addItem("Blue"); 
        colors.addItem("Yellow");
    
        
        drawingPanel.setBorder(new LineBorder((Color.BLACK),1));
        drawingPanel.setLayout(new GridLayout(3,1));
        drawingPanel.add(shape);
        drawingPanel.add(nodeButton);
        drawingPanel.add(shapesSize);
        drawingPanel.add(nodeSize);
        drawingPanel.add(color);
        drawingPanel.add(colors);
       
    //    drawingPanel.add(edgeButton);
	}

	public JPanel getDrowingPanel() {
		return drawingPanel;
	}

	public void setDrowingPanel(JPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
	}

	public JSpinner getNodeSize() {
		return nodeSize;
	}

	

	
	public JLabel getShapesSize() {
		return shapesSize;
	}

	public JLabel getColor() {
		return color;
	}

	
	public JComboBox<String> getColors() {
		return colors;
	}
}

