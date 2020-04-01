/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author calan
 */
public class Game {
    private Board board;
    private final List<Player> players = new ArrayList<>();

    public Game() {
    }
    
    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }
    
    public void start() {
    	List<Runnable> runnables=new ArrayList<Runnable>();
    	for (int i=0;i<players.size();i++) {
    		runnables.add(players.get(i));
    	}
    	for(int i=0;i<players.size();i++) {
    		new Thread(runnables.get(i)).start();
    		try {
		        Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
                        }
    	}
    }
    
    public void setWinner(Player player) {
    	System.out.println("The player "+ player.getName() + " win.");
    	System.exit(0);
    	
    }
    public void noMoves(Player player) {
    	System.out.println("The board is empty for "+player.getName());
        System.out.println(player.getName()+" has "+ player.lenghtOfLongestAP(player.getProgression())+" points.");

    }
    
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public List<Player> getPlayers() {
		return players;
	}
}


