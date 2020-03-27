/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import commands.ListCommand;
import commands.LoadCommand;
import commands.OpenCommand;
import commands.ReportHtmlCommand;
import exceptions.InvalidCommand;
import exceptions.InvalidPath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author calan
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InvalidPath {
      String commandLine;
      
      BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
            // read what the user entered
            System.out.print("My shell>");
            commandLine = console.readLine(); 
                // if the user entered a return, just loop again
            if (commandLine.equals("")) {
                    continue;
                }
            else if (commandLine.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
            try {
                String[] lineSplit = commandLine.split(" ");    
                if(  (!lineSplit[0].equals("list")
                      && !lineSplit[0].equals("view")
                      && !lineSplit[0].equals("load")
                      && !lineSplit[0].equals("report"))
                )  throw new InvalidCommand(); 
                
                
                int ok=0;
                //take command parameters
                String commandName=lineSplit[0];
                String parameters="";
                int size = lineSplit.length;
                for (int i=1; i<size-1; i++) {
                    parameters=parameters+lineSplit[i]+ " " ;
                }
                parameters=parameters+lineSplit[lineSplit.length-1];
                
                String[] parametersList= parameters.split(", ");
                Document d1=new Document("C:\\Users\\calan\\OneDrive\\Documente\\NetBeansProjects\\Lab5\\src\\lab5\\files\\book.txt");
                Document d2=new Document("C:\\Users\\calan\\OneDrive\\Documente\\NetBeansProjects\\Lab5\\src\\lab5\\files\\article.txt");
                Document d3=new Document("C:\\Users\\calan\\OneDrive\\Documente\\NetBeansProjects\\Lab5\\src\\lab5\\files\\newspaper.txt");

                d1.save(d1.path);
                d2.save(d2.path);
                d3.save(d3.path);
                Catalog catalog=new Catalog();
                catalog.addDocument(d1);
                catalog.addDocument(d2);
                catalog.addDocument(d3);
                if(commandName.equals("list") )
                {
                	ListCommand.execute(catalog);
                	ok=1;
                }
                if(commandName.equals("load") && parametersList.length==1)
                {
                	LoadCommand.execute(parametersList[0]);
                	ok=1;
                }
                 
                if(commandName.equals("view") && parametersList.length==1)
                {
                	OpenCommand.execute(parametersList[0]);
                	ok=1;
                }
                
                if(commandName.equals("report"))
                {
                	ReportHtmlCommand.execute(catalog);
                	ok=1;
                }
                
            }catch(InvalidCommand e)
             {
                 System.out.println(e);
             }
    
}
    }
}
