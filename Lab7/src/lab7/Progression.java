/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author calan
 */
public class Progression {
    List<Token> tokens=new ArrayList<>();

    public Progression() {
    }
    public void addInProgression(Token token){
        tokens.add(token);
        Collections.sort(tokens);
}

    public boolean isArithmeticProgression(){
        int d=tokens.get(1).getN()-tokens.get(0).getN();
        for(int i=2;i<tokens.size();i++)
            if(tokens.get(i).getN()-tokens.get(i-1).getN()!=d)
                return false;
        return true;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
    

    @Override
    public String toString() {
        return "{" + tokens + '}';
    }
    
}
