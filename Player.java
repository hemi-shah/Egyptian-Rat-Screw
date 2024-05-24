/**
 * The Player class stores information on a single player
 * @author Hemi Shah
 * @version 1.0
 * @see Game, Driver
 */
import java.util.LinkedList; // imports the LinkedList class

public class Player { // Player class declaration
    /** 
     * m_playerNum is a member variable to a player's number
    */
    private int m_playerNum; // creates a type int member variable m_playerNum

    /** 
     * m_hand is a member variable to a player's hand of cards
    */
    private LinkedList<Card> m_hand = new LinkedList<>(); // creates a type LinkedList that holds Card objects member variable m_hand

    /** 
     * m_pattern is a member variable to a player's pattern
    */
    private String m_pattern;  // creates a type String member variable m_pattern

    // An overloaded constructor that takes a player number, a LinkedList of Cards representing their entire hand, and the pattern they should recognize
    /**
     * Creates a Player instance with attributes specified
     * @param playerNum The Player's player number
     * @param hand The Player's hand of cards
     * @param pattern The Player's pattern
     */
    public Player(int playerNum, LinkedList<Card> hand, String pattern){
        m_playerNum = playerNum; // sets m_playerNum to the playerNum parameter
        m_hand = hand; // sets m_hand to the hand parameter
        m_pattern = pattern; // sets m_pattern to the pattern parameter
    }

    /**
     * A method to play a Card - removes a Card from the top of the player's hand and returns it
     * @return a Card object representing the played card
     */
    public Card playCard(){
        Card removedCard = m_hand.remove(0); // creates a Card object called removedCard that holds the removed Card from the player's hand at position 0
        return removedCard; // returns the value of removedCard
    }

    /**
     * A method to find if the pattern is in player, returns true to slap and false if not
     * @param pile a pile of Cards - a LinkedList that holds Cards objects
     * @return a boolean slap representing if the Player can slap or not
     */
    public boolean slaps(LinkedList<Card> pile){
        boolean slap = false;
        if ((m_pattern.equals("topBottom")) || (m_pattern.equals("Top Bottom")) || (m_pattern.equals("top bottom"))){
            Game.topBottom(pile);
            slap = true;
        }
        else if ((m_pattern.equals("doubles")) || (m_pattern.equals("Doubles"))){
            Game.doubles(pile);
            slap = true;
        }
        else if ((m_pattern.equals("sandwich")) || (m_pattern.equals("Sandwich"))){
            Game.sandwich(pile);
            slap = true;
        }
        return slap;
    }

    /**
    * Accessor for player number attribute
    * @return an int m_playerNum representing the Player's player number
    */
    public int getPlayerNum(){
        return m_playerNum; // returns the value of m_playerNum
    }

    /**
    * Accessor for hand attribute
    * @return a Linked List of Card objects m_hand representing the Player's hand of cards
    */
    public LinkedList<Card> getHand(){
        return m_hand; // returns the value of m_hand
    }

    /**
    * Accessor for pattern attribute
    * @return a String m_pattern representing the Player's pattern
    */
    public String getPattern(){
        return m_pattern; // returns the value of m_pattern
    }

    /**
    * Returns a String representation of the Player instance
    * @return String s a pretty printed version of the object
    */
    public String toString(){
        String s = ""; // creates an empty String variable s
        s += "Player Number: " + m_playerNum + "\n"; // adds Player Number: + the value of int m_playerNum + a new line to s
        s += "Hand: " + m_hand.toString() + "\n"; // adds Hand: +  calls the toString method on m_hand and adds it to s
        s += "Pattern: " + m_pattern + "\n"; // adds Pattern: + the value of int m_playerNum + a new line to s
        return s; // returns the value of s
    }
}
