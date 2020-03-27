/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author calan
 */
public class Catalog {
    List<Document> documents=new ArrayList<>();

    public Catalog() {
    }
    
    public void addDocument(Document document){
        this.documents.add(document);
    }
    public List<Document> getDocuments(){
        return documents;
    }
}
