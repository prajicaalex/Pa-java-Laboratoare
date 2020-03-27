/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import optional.Matching;
import optional.Problem;

/**
 *
 * @author calan
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creez rezidentii
        Resident r0=new Resident("R0");
        Resident r1=new Resident("R1");
        Resident r2=new Resident("R2");
        Resident r3=new Resident("R3");
        
        //creez Hospitals
        Hospital h0=new Hospital("H0",1);
        Hospital h1=new Hospital("H1",2);
        Hospital h2=new Hospital("H2",2);
        
        //lista de rezidenti
        List<Resident> residentList=new ArrayList<>();
        residentList.add(r0);
        residentList.add(r1);
        residentList.add(r2);
        residentList.add(r3);
        
        Collections.sort(residentList,new Comparator<Resident>(){//sortez lista cu ajutorul unui Comparator
            public int compare(Resident r1,Resident r2){
                return r1.getName().compareTo(r2.getName());//sortez alfabetic
            }
        });
        
        //set de Hospitals
        Set hospitalSet= new TreeSet<>();
        hospitalSet.add(h0);
        hospitalSet.add(h1);
        hospitalSet.add(h2);
        
       
      
        //Setez preferintele fiecarui rezident dupa modelul descris
        List<Hospital> preferences1=new ArrayList<>();
        preferences1.add(h0);
        preferences1.add(h1);
        preferences1.add(h2);
        
        List<Hospital> preferences2=new ArrayList<>();
        preferences2.add(h0);
        preferences2.add(h1);
        
        List<Hospital> preferences3=new ArrayList<>();
        preferences3.add(h0);
        preferences3.add(h2);
        
        r0.setPreferences(preferences1);
        r1.setPreferences(preferences1);
        r2.setPreferences(preferences2);
        r3.setPreferences(preferences3);
        
       //map pentru preferintele rezidentilor  
        Map<Resident,List<Hospital>> map=new LinkedHashMap<>();
        map.put(r0,r0.getPreferences());    
        map.put(r1,r1.getPreferences());
        map.put(r2,r2.getPreferences());
        map.put(r3,r3.getPreferences());
        
        //Afisez rezidentii cu toate preferintele
        System.out.print("Residents preferences:\n");
        Set< Map.Entry<Resident,List<Hospital>>> st= map.entrySet();
        for(Map.Entry<Resident,List<Hospital>> me:st)
        { 
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } 
        
  
    //Adaug rezidentii la spitale
    List<Resident> list1=new ArrayList<>();
    list1.add(r3);
    list1.add(r0);
    list1.add(r1);
    list1.add(r2);
    h0.setResidentsList(list1);
    
    List<Resident> list2=new ArrayList<>();
    list2.add(r0);
    list2.add(r2);
    list2.add(r1);
    h1.setResidentsList(list2);
    
    List<Resident> list3=new ArrayList<>();
    list3.add(r0);
    list3.add(r1);
    list3.add(r3);
    h2.setResidentsList(list3);
     //Creez map cu hospital preferences
    Map<Hospital,List<Resident>> map2=new HashMap<>();
        map2.put(h0,h0.getResidentsList());    
        map2.put(h1,h1.getResidentsList());
        map2.put(h2,h2.getResidentsList());
        
        
        //Afisez rezidentii cu toate preferintele
        System.out.print("\nHotels preferences:\n");
        Set< Map.Entry<Hospital,List<Resident>>>st1= map2.entrySet();
        for(Map.Entry<Hospital,List<Resident>> me:st1)
        { 
           System.out.print(me.getKey()+":"); 
           System.out.println(me.getValue()); 
       } 
        
        
        
        Set residentSet=new TreeSet<>();
        residentSet.add(r0);
        residentSet.add(r1);
        residentSet.add(r2);
        residentSet.add(r3);
        
        
        Problem problem=new Problem();
        problem.setHospitalSet(hospitalSet);
        problem.setResitentSet(residentSet);
        Matching matching=new Matching();
        matching.setProblem(problem);
        matching.createMatching();
        System.out.println(matching);
        System.out.println("Matching is stable?  -> "+matching.matchingIsStable());
       
    
}
}
