/*
 * Binita Shah | Kirandeep | Amandeep Kaur | Rahul Pillai
 * Student ID: 991549124 | 991471005 | 991551199 | 991567718
 * Description: Deliverable 1 - v1
 */
package deliverable1cardgame;

 /**
 * SYST 17796 Project Winter 2020 Base code.
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author Codebrewers
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();
    
}



