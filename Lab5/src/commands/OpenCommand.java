/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author calan
 */
public class OpenCommand {
    public static void execute(String path)
	{
		try {
                    File file=new File(path);
                    Desktop.getDesktop().open(file);
                    }
                catch (IOException e) {
		     e.printStackTrace();
		     }
		
	}
}
