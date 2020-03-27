/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import lab5.Catalog;
import lab5.Document;

/**
 *
 * @author calan
 */
public class ListCommand {
    public static void execute(Catalog catalog)
	{  
		System.out.println("Catalogul contine: ");
		for(Document i:catalog.getDocuments())
                    System.out.print(i);
	}
}
