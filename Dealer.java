/**
 * The Dealer class stores information on dealing cards and a dealt deck of cards
 * @author Hemi Shah
 * @version 1.0
 * @see TestCards
 */
import java.util.LinkedList; // imports the LinkedList class

public class Dealer { // Dealer class declaration
    /** 
     * m_deck is a member variable to store a Deck of cards
    */
    private Deck m_deck; // creates a type Deck member variable m_deck

    /**
     * A default constructor for the Dealer class
     */
    public Dealer(){
        m_deck = new Deck(); // initializes m_deck as an instance of the Deck class
    }

    /**
     * A method to deal random cards
     * @return a LinkedList representing the dealt cards
     */
    public LinkedList<Card> deals(int n){
        LinkedList<Card> dealtDeck = new LinkedList<Card>(); // creates a new LinkedList called dealtDeck that holds objects of the Card data type
        if (m_deck.size() != 0){ // checks to see if m_deck is not empty (if the size is not 0)
            // remove n number of random cards from the deck
            for (int i = 0; i < n; ++i){ // creates a for loop where int i iterates through the loop as long as it is less than the value of the parameter n
                Card removedCard = m_deck.deal(); // creates a type Card variable called removedCard that uses the deal method from the Deck class on m_deck
                dealtDeck.add(removedCard); // adds the value of removedCard to the dealtDeck
            }
        }
        return dealtDeck; // returns the value of dealtDeck
    }

    /**
     * A method to find the value of the size of the deck or the number of cards in the deck
     * @return an int representing the size of the deck
     */
    public int deckSize(){
        int size = m_deck.size(); // creates an int variable called size that is initialized to the value of the size of m_deck
        return size; // returns the value of size
    }

    /**
    * Returns a String representation of the Dealer instance
    * @return String s a pretty printed version of the object
    */
    public String toString(){
        String s = ""; // creates an empty String variable s
        s += m_deck.toString(); // calls the toString method on m_deck and adds it to s
        return s; // returns the value of s
    }
    
}
