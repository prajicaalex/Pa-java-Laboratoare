/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author calan
 */
public class Document implements Serializable {
    String path;
    String ID;
    String name;
    List<Pair<String,String>> tags=new ArrayList<>();

    public Document(String path) {
        this.path=path;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void AddTag(Pair<String,String> tag){
        this.tags.add(tag);
    }
    public List<Pair<String,String>> getTags(){
        return tags;
    }
    
    public void save(String path) throws IOException{
        Path filePath=Paths.get(path);
        List<String> fileLines=Files.readAllLines(filePath);
        this.ID=fileLines.get(0);
        this.name=fileLines.get(1);
        for(int i=2;i<fileLines.size();i++){
            String[] t=fileLines.get(i).split("-");
            Pair tag=new Pair(t[0],t[1]);
            tags.add(tag);
        }
        
    }

    @Override
    public String toString() {
        return "Document{" + "ID=" + ID + ", name=" + name + ", tags=" + tags + "}\n";
      }
}