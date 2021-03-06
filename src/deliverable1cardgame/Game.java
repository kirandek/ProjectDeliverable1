/*
 * Binita Shah | Kirandeep | Amandeep Kaur | Rahul Pillai
 * Student ID: 991549124 | 991471005 | 991551199 | 991567718
 * Description: Deliverable 1 - v1
 */
package deliverable1cardgame;
import java.util.ArrayList;

/**
 * SYST 17796 Project Winter 2020 Base code.
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author Codebrewers
 */
public abstract class Game 
{
    private final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

   
    
}//end class

    

