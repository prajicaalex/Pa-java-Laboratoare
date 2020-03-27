/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author calan
 */
public class ControlPanel extends JPanel{
    private static final long serialVersionUID = 1L;
    Button saveButton = new Button("Save");
    Button loadButton = new Button("Load");
    Button resetButton = new Button("Reset");
    Button exitButton = new Button("Exit");
   
    
    public ControlPanel()
    {
        init();

    }

    private void init()
    {
      this.setBorder(new LineBorder((Color.BLACK),1));
        this.setLayout(new GridLayout(1,3));
        this.add(saveButton);
        this.add(loadButton);
        this.add(resetButton);
        this.add(exitButton);
     
    }


}
