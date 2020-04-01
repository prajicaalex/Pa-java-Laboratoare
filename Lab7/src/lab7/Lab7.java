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
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game=new Game();
        Board board=new Board(15);
        
        game.setBoard(board);
        Player player1=new Player("player1");
        Player player2=new Player("player2");
        Player player3=new Player("player3");
        
        game.addPlayer( player1);
        game.addPlayer( player2);
        game.addPlayer( player3);
        game.start();

    }
    
}
