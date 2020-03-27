/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javafx.util.Pair;
import lab4.Hospital;
import lab4.Resident;

/**
 *
 * @author calan
 */
public class Matching {
    Problem problem;
    Map<Resident,Hospital> elementsMatching=new TreeMap<>();

    public Matching() {
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }
    
    public void createMatching(){
        Random rand=new Random();
        for(Resident r:problem.resitentSet){
          
           elementsMatching.put(r,r.getPreferences().get(rand.nextInt(r.getPreferences().size())));
        }
    }
    
    public boolean matchingIsStable(){
       return true;
    }

    @Override
    public String toString() {
        return "Matching: " +  elementsMatching + '}';
    }
    
}
