/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import lab5.Catalog;
import lab5.Document;

/**
 *
 * @author calan
 */
public class ReportHtmlCommand {
    public static void execute(Catalog catalog)
	{
		FileOutputStream fos;
		try {
		fos = new FileOutputStream(new File("C:\\Users\\calan\\OneDrive\\Documente\\NetBeansProjects\\Lab5\\src\\lab5\\files\\graphCatalog.html"));
		PrintWriter out=new PrintWriter(fos);
		out.print("<!DOCTYPE>\n <html>" + 
				"<head></head>\n" + 
				"<body>\n" + 
				"<h1>Catalog</h1>\n"+"<ul>\n");
		for(Document i: catalog.getDocuments())
		{
			out.print("<li> "+i.getID()+ "."+ i.getName()
			+ i.getTags()+ "</li>\n");
		}
		out.print("</ul>\n" + 
				"</body>\n"+ "</html>");
		out.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Raportul html a fost creat");
	}

}

