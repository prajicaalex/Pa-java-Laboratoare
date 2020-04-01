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
public class Player implements Runnable{
    String name;
    Progression progression=new Progression();
    Game game=new Game();

    

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Progression getProgression() {
        return progression;
    }

    public void setProgression(Progression progression) {
        this.progression = progression;
    }
    
    public Game getGame() {
        return game;
}

    public void setGame(Game game) {
	this.game = game;
        this.progression=new Progression();
}
    boolean play() throws InterruptedException{
        int ok=0;//pentru a testa daca am extras macar doi Tokeni
        //pentru ca cea mai scurta progresie e din doua numere
        Board board=game.getBoard();
        if(board.isEmpty()){
            game.noMoves(this);
            return false;
        }
        if(ok<2){
            Token tokenExtracted=board.extract();
            progression.addInProgression(tokenExtracted);
            System.out.println(this.name+": "+progression);
            Thread.sleep(100);
        }
        else
        {   Token tokenExtracted=board.extract();
            progression.addInProgression(tokenExtracted);
            System.out.println(this.name+": "+progression);
            Thread.sleep(100);
            if(progression.isArithmeticProgression()){
                game.setWinner(this);
                return false;
        }
                    }
        return true;
    }

    @Override
    public void run() {
        try{
            while(this.play()){
                
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    
    static int lenghtOfLongestAP(Progression progression){
        int n=progression.getTokens().size();
        if(n<=2)
            return n;
        int L[][]=new int[n][n];
        int result=2;//initializez rezultatul
        
        for( int i=0 ;i< n;i++)
            L[i][n-1]=2;
        
        for(int j=n-2;j>=1;j--)
        {
            int i=j-1, k=j+1;
            while(i>=0 && k<=n-1)
            {
                if(progression.getTokens().get(i).getN()
                        +progression.getTokens().get(k).getN()
                        <2*progression.getTokens().get(j).getN())
                {
                   k=k+1;
                }
                else if(progression.getTokens().get(i).getN()
                        +progression.getTokens().get(k).getN()
                        >2*progression.getTokens().get(j).getN())
                    {
                    L[i][j]=2;
                    i=i-1;
                    }
                else
                {
                    L[i][j]=L[j][k]+1;
                    result=Math.max(result, L[i][j]);
                    i--;
                    k++;
                    
                }
            }
            while(i>=0)
            {
                L[i][j]=2;
                i--;
            }
        }
        return result;
    }
    
    
    
}
