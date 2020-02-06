/*
 * Binita Shah | Kirandeep | Amandeep Kaur | Rahul Pillai
 * Student ID: 991549124 | 991471005 | 991551199 | 991567718
 * Description: Deliverable 1 - v1
 */
package deliverable1cardgame;
import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {
 /**
 * SYST 17796 Project Winter 2020 Base code.
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Codebrewers
 */
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class

    

