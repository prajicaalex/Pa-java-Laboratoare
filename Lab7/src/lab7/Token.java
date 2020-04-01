/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author calan
 */
public class Token implements Comparable<Token> {
    int n;

    public Token(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public int compareTo(Token t) {
        if(n==t.getN())
            return 0;
        else if(n>t.getN())
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return "[" + n + ']';
    }
    
    
}
