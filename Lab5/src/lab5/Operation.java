/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author calan
 */
public class Operation {
    Catalog catalog;
    String path;

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Operation(String path) {
        this.path = path;
    }
    
    public void load(){
        Document e=null;
        List<Document> list=new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(this.path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            for(int i=0;i<catalog.getDocuments().size();i++){
               e = (Document) in.readObject();
               list.add(e);
            }
            in.close();
            fileIn.close();
          } catch (IOException i) {
              i.printStackTrace();
          } catch (ClassNotFoundException c) {
                System.out.println("Document class not found");
                c.printStackTrace();
          }
        System.out.println(list);
        
    }
    
   public void save(){
         List<Document> documents=catalog.getDocuments();
         try{
             FileOutputStream file = new FileOutputStream (this.path); 
             ObjectOutputStream out = new ObjectOutputStream(file); 
             for(Document document: documents){
             out.writeObject(document);
            } 
             out.close(); 
            file.close(); 
         }
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
    }
    public void view(String path) {
        try{
            Desktop desktop=Desktop.getDesktop();
            desktop.open(new File(path));
        }
        catch (IOException ex) { 
            System.out.println("IOException is caught"); 
        } 
    }
    
    public void savePlainText() {
        List<Document> documents=catalog.getDocuments();
        try {
            FileWriter writer = new FileWriter(this.path, true);
            for(Document document: documents){
                writer.write(document.ID+"\n");
                writer.write(document.name+"\n");
                writer.write(document.tags.toString()+"\n");
            }
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void loadPlainText(){
        Path path = Paths.get(this.path);
        try (Stream<String> lines = Files.lines(path)) {
        lines.forEachOrdered(line->System.out.println(line));
        } catch (IOException e) {
         System.err.println(e);
        }

          } 
        
        
    
}
