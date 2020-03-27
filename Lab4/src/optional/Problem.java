/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optional;

import java.util.Set;
import java.util.TreeSet;
import lab4.Hospital;
import lab4.Resident;

/**
 *
 * @author calan
 */
public class Problem {
    Set<Hospital> hospitalSet=new TreeSet<>();
    Set<Resident> resitentSet=new TreeSet<>();

    public Problem() {
    }
    
    public Set<Hospital> getHospitalSet() {
        return hospitalSet;
    }

    public void setHospitalSet(Set<Hospital> hospitalSet) {
        this.hospitalSet = hospitalSet;
    }

    public Set<Resident> getResitentSet() {
        return resitentSet;
    }

    public void setResitentSet(Set<Resident> resitentSet) {
        this.resitentSet = resitentSet;
    }
    
}
