/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author calan
 */
public class Resident implements Comparable<Resident>  {
    String name;
    List<Hospital> preferences=new ArrayList<>();

    public List<Hospital> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<Hospital> preferences) {
        this.preferences = preferences;
    }
    public Resident(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int compareTo(Resident r){
        if(name==r.name)
            return 0;
        else
            return -1;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Resident other = (Resident) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name ;
    }
    
}
