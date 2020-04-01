/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author calan
 */
public class Board {
    int numberOfTokens;
    List<Token> tokens=new ArrayList<>();

    public Board(int numberOfTokens) {
        this.numberOfTokens = numberOfTokens;
        Token token;
        for(int i=1;i<=numberOfTokens;i++){
            token= new Token(i);
            tokens.add(token);
        }
        Collections.shuffle(tokens);
            
    }
    
    public boolean isEmpty() {
	if(tokens.isEmpty())
            return true;
    	else
            return false;
    }
    
    public synchronized Token extract(){
        Token token=tokens.get(0);
        tokens.remove(0);
        return token;
    }
    public int getNumberOfTokens() {
        return numberOfTokens;
    }

    public void setNumberOfTokens(int numberOfTokens) {
        this.numberOfTokens = numberOfTokens;
    }
    
}
