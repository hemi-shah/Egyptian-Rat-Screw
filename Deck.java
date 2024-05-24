/**
 * The Deck class stores information about a single deck of cards
 * @author Hemi Shah
 * @version 1.0
 * @see Dealer and TestCards
 */
import java.util.LinkedList; // imports the LinkedList class
import java.util.Random; // imports the Random class

public class Deck { // Deck class declaration
    /** 
     * m_cards is a member variable to store a LinkedList of Card data types
    */
    private LinkedList<Card> m_cards; // creates a LinkedList type member variable that holds Card data type called m_cards

    /**
     * A default constructor for the Deck class that initializes 52 cards to the deck
     */
    public Deck(){
        m_cards = new LinkedList<Card>(); // initializes m_cards to a new LinkedList that holds Card data type

       Card aceOfDiamonds = new Card(Card.ACE, Card.DIAMONDS); // creates a Card object called aceOfDiamonds with rank ACE and suit DIAMONDS
       m_cards.add(aceOfDiamonds); // adds aceOfDiamons to m_cards
       Card twoOfDiamonds = new Card(2, Card.DIAMONDS); // creates a Card object called twoOfDiamonds with rank 2 and suit DIAMONDS
       m_cards.add(twoOfDiamonds); // adds twoOfDiamonds to m_cards
       Card threeOfDiamonds = new Card(3, Card.DIAMONDS); // creates a Card object called threeOfDiamonds with rank 3 and suit DIAMONDS
       m_cards.add(threeOfDiamonds); // adds threeOfDiamonds to m_cards
       Card fourOfDiamonds = new Card(4, Card.DIAMONDS); // creates a Card object called fourOfDiamonds with rank 4 and suit DIAMONDS
       m_cards.add(fourOfDiamonds); // adds fourOfDiamonds to m_cards
       Card fiveOfDiamonds = new Card(5, Card.DIAMONDS); // creates a Card object called fiveOfDiamonds with rank 5 and suit DIAMONDS
       m_cards.add(fiveOfDiamonds); // adds fiveOfDiamonds to m_cards
       Card sixOfDiamonds = new Card(6, Card.DIAMONDS); // creates a Card object called sixOfDiamonds with rank 6 and suit DIAMONDS
       m_cards.add(sixOfDiamonds); // adds sixOfDiamonds to m_cards
       Card sevenOfDiamonds = new Card(7, Card.DIAMONDS); // creates a Card object called sevenOfDiamonds with rank 7 and suit DIAMONDS
       m_cards.add(sevenOfDiamonds); // adds sevenOfDiamonds to m_cards
       Card eightOfDiamonds = new Card(8, Card.DIAMONDS); // creates a Card object called eightOfDiamonds with rank 8 and suit DIAMONDS
       m_cards.add(eightOfDiamonds); // adds eightOfDiamonds to m_cards
       Card nineOfDiamonds = new Card(9, Card.DIAMONDS); // creates a Card object called nineOfDiamonds with rank 9 and suit DIAMONDS
       m_cards.add(nineOfDiamonds); // adds nineOfDiamonds to m_cards
       Card tenOfDiamonds = new Card(10, Card.DIAMONDS); // creates a Card object called tenOfDiamonds with rank 10 and suit DIAMONDS
       m_cards.add(tenOfDiamonds); // adds tenOfDiamonds to m_cards
       Card jackOfDiamonds = new Card(Card.JACK, Card.DIAMONDS); // creates a Card object called jackOfDiamonds with rank JACK and suit DIAMONDS
       m_cards.add(jackOfDiamonds); // adds jackOfDiamonds to m_cards
       Card queenOfDiamonds = new Card(Card.QUEEN, Card.DIAMONDS); // creates a Card object called queenOfDiamonds with rank QUEEN and suit DIAMONDS
       m_cards.add(queenOfDiamonds); // adds queenOfDiamonds to m_cards
       Card kingOfDiamonds = new Card(Card.KING, Card.DIAMONDS); // creates a Card object called kingOfDiamonds with rank KING and suit DIAMONDS
       m_cards.add(kingOfDiamonds); // adds kingOfDiamonds to m_cards

       Card aceOfClubs = new Card(Card.ACE, Card.CLUBS); // creates a Card object called aceOfClubs with rank ACE and suit CLUBS
       m_cards.add(aceOfClubs); // adds aceOfClubs to m_cards
       Card twoOfClubs = new Card(2, Card.CLUBS); // creates a Card object called twoOfClubs with rank 2 and suit CLUBS
       m_cards.add(twoOfClubs); // adds twoOfClubs to m_cards
       Card threeOfClubs = new Card(3, Card.CLUBS); // creates a Card object called threeOfClubs with rank 3 and suit CLUBS
       m_cards.add(threeOfClubs); // adds threeOfClubs to m_cards
       Card fourOfClubs = new Card(4, Card.CLUBS); // creates a Card object called fourOfClubs with rank 4 and suit CLUBS
       m_cards.add(fourOfClubs); // adds fourOfClubs to m_cards
       Card fiveOfClubs = new Card(5, Card.CLUBS); // creates a Card object called fiveOfClubs with rank 5 and suit CLUBS
       m_cards.add(fiveOfClubs); // adds fiveOfClubs to m_cards
       Card sixOfClubs = new Card(6, Card.CLUBS); // creates a Card object called sixOfClubs with rank 6 and suit CLUBS
       m_cards.add(sixOfClubs); // adds sixOfClubs to m_cards
       Card sevenOfClubs = new Card(7, Card.CLUBS); // creates a Card object called sevenOfClubs with rank 7 and suit CLUBS
       m_cards.add(sevenOfClubs); // adds sevenOfClubs to m_cards
       Card eightOfClubs = new Card(8, Card.CLUBS); // creates a Card object called eightOfClubs with rank 8 and suit CLUBS
       m_cards.add(eightOfClubs); // adds eightOfClubs to m_cards
       Card nineOfClubs = new Card(9, Card.CLUBS); // creates a Card object called nineOfClubs with rank 9 and suit CLUBS
       m_cards.add(nineOfClubs); // adds nineOfClubs to m_cards
       Card tenOfClubs = new Card(10, Card.CLUBS); // creates a Card object called tenOfClubs with rank 10 and suit CLUBS
       m_cards.add(tenOfClubs); // adds tenOfClubs to m_cards
       Card jackOfClubs = new Card(Card.JACK, Card.CLUBS); // creates a Card object called jackOfClubs with rank JACK and suit CLUBS
       m_cards.add(jackOfClubs); // adds jackOfClubs to m_cards
       Card queenOfClubs = new Card(Card.QUEEN, Card.CLUBS); // creates a Card object called queenOfClubs with rank QUEEN and suit CLUBS
       m_cards.add(queenOfClubs); // adds queenOfClubs to m_cards
       Card kingOfClubs = new Card(Card.KING, Card.CLUBS); // creates a Card object called kingOfClubs with rank KING and suit CLUBS
       m_cards.add(kingOfClubs); // adds kingOfClubs to m_cards

       Card aceOfHearts = new Card(Card.ACE, Card.HEARTS); // creates a Card object called aceOfHearts with rank ACE and suit HEARTS
       m_cards.add(aceOfHearts); // adds aceOfHearts to m_cards
       Card twoOfHearts = new Card(2, Card.HEARTS); // creates a Card object called twoOfHearts with rank 2 and suit HEARTS
       m_cards.add(twoOfHearts); // adds twoOfHearts to m_cards
       Card threeOfHearts = new Card(3, Card.HEARTS); // creates a Card object called threeOfHearts with rank 3 and suit HEARTS
       m_cards.add(threeOfHearts); // adds threeOfHearts to m_cards
       Card fourOfHearts = new Card(4, Card.HEARTS); // creates a Card object called fourOfHearts with rank 4 and suit HEARTS
       m_cards.add(fourOfHearts); // adds fourOfHearts to m_cards
       Card fiveOfHearts = new Card(5, Card.HEARTS); // creates a Card object called fiveOfHearts with rank 5 and suit HEARTS
       m_cards.add(fiveOfHearts); // adds fiveOfHearts to m_cards
       Card sixOfHearts = new Card(6, Card.HEARTS); // creates a Card object called sixOfHearts with rank 6 and suit HEARTS
       m_cards.add(sixOfHearts); // adds sixOfHearts to m_cards
       Card sevenOfHearts = new Card(7, Card.HEARTS); // creates a Card object called sevenOfHearts with rank 7 and suit HEARTS
       m_cards.add(sevenOfHearts); // adds sevenOfHearts to m_cards
       Card eightOfHearts = new Card(8, Card.HEARTS); // creates a Card object called eightOfHearts with rank 8 and suit HEARTS
       m_cards.add(eightOfHearts); // adds eightOfHearts to m_cards
       Card nineOfHearts = new Card(9, Card.HEARTS); // creates a Card object called nineOfHearts with rank 9 and suit HEARTS
       m_cards.add(nineOfHearts); // adds nineOfHearts to m_cards
       Card tenOfHearts = new Card(10, Card.HEARTS); // creates a Card object called tenOfHearts with rank 10 and suit HEARTS
       m_cards.add(tenOfHearts); // adds tenOfHearts to m_cards
       Card jackOfHearts = new Card(Card.JACK, Card.HEARTS); // creates a Card object called jackOfHearts with rank JACK and suit HEARTS
       m_cards.add(jackOfHearts); // adds jackOfHearts to m_cards
       Card queenOfHearts = new Card(Card.QUEEN, Card.HEARTS); // creates a Card object called queenOfHearts with rank QUEEN and suit HEARTS
       m_cards.add(queenOfHearts); // adds queenOfHearts to m_cards
       Card kingOfHearts = new Card(Card.KING, Card.HEARTS); // creates a Card object called kingOfHearts with rank KING and suit HEARTS
       m_cards.add(kingOfHearts); // adds kingOfHearts to m_cards

       Card aceOfSpades = new Card(Card.ACE, Card.SPADES); // creates a Card object called aceOfSpades with rank ACE and suit SPADES
       m_cards.add(aceOfSpades); // adds aceOfSpades to m_cards
       Card twoOfSpades = new Card(2, Card.SPADES); // creates a Card object called twoOfSpades with rank 2 and suit SPADES
       m_cards.add(twoOfSpades); // adds twoOfSpades to m_cards
       Card threeOfSpades = new Card(3, Card.SPADES); // creates a Card object called threeOfSpades with rank 3 and suit SPADES
       m_cards.add(threeOfSpades); // adds threeOfSpades to m_cards
       Card fourOfSpades = new Card(4, Card.SPADES); // creates a Card object called fourOfSpades with rank 4 and suit SPADES
       m_cards.add(fourOfSpades); // adds fourOfSpades to m_cards
       Card fiveOfSpades = new Card(5, Card.SPADES); // creates a Card object called fiveOfSpades with rank 5 and suit SPADES
       m_cards.add(fiveOfSpades); // adds fiveOfSpades to m_cards
       Card sixOfSpades = new Card(6, Card.SPADES); // creates a Card object called sixOfSpades with rank 6 and suit SPADES
       m_cards.add(sixOfSpades); // adds sixOfSpades to m_cards
       Card sevenOfSpades = new Card(7, Card.SPADES); // creates a Card object called sevenOfSpades with rank 7 and suit SPADES
       m_cards.add(sevenOfSpades); // adds sevenOfSpades to m_cards
       Card eightOfSpades = new Card(8, Card.SPADES); // creates a Card object called eightOfSpades with rank 8 and suit SPADES
       m_cards.add(eightOfSpades); // adds eightOfSpades to m_cards
       Card nineOfSpades = new Card(9, Card.SPADES); // creates a Card object called nineOfSpades with rank 9 and suit SPADES
       m_cards.add(nineOfSpades); // adds nineOfSpades to m_cards
       Card tenOfSpades = new Card(10, Card.SPADES); // creates a Card object called tenOfSpades with rank 10 and suit SPADES
       m_cards.add(tenOfSpades); // adds tenOfSpades to m_cards
       Card jackOfSpades = new Card(Card.JACK, Card.SPADES); // creates a Card object called jackOfSpades with rank JACK and suit SPADES
       m_cards.add(jackOfSpades); // adds jackOfSpades to m_cards
       Card queenOfSpades = new Card(Card.QUEEN, Card.SPADES); // creates a Card object called queenOfSpades with rank QUEEN and suit SPADES
       m_cards.add(queenOfSpades); // adds queenOfSpades to m_cards
       Card kingOfSpades = new Card(Card.KING, Card.SPADES); // creates a Card object called kingOfSpades with rank KING and suit SPADES
       m_cards.add(kingOfSpades); // adds kingOfSpades to m_cards
    }

    /**
    * The Deck copy constructor
    * @param copyDeck The Deck to copy
    */
    public Deck(Deck copyDeck){
        this.m_cards = new LinkedList<Card>(copyDeck.m_cards); // new Deck m_cards will be a copy of the value of copyDeck m_cards
    }

     /**
    * Returns a String representation of the Deck instance
    * @return String s a pretty printed version of the object
    */
    public String toString(){
        String s = ""; // creates an empty String variable s
        s += m_cards.toString(); // calls the toString method on m_cards and adds it to s
        return s; // returns the value of s
    }

    /**
     * A method to find the value of the size of the deck or the number of cards in the deck
     * @return an int representing the size of the deck
     */
    public int size(){
        int size = m_cards.size(); // creates an int variable called size that is initialized to the value of the size of m_cards
        return size; // returns the value of size
    }

    /** A method that removes a random card from the list and returns it
     * @return a Card object representation of the removedCard
     */
    public Card deal(){
        Random rand = new Random(); // creates a Random object called rand
        int removeIndex = rand.nextInt(m_cards.size()); // creates an int variable called removeIndex and initializes it to an int chosen at random within the range of the size of m_cards
        Card removeCard = m_cards.remove(removeIndex); // creates a Card object called removeCard and initializes it to the removed Card from m_cards 
        return removeCard; // returns the value of removeCard
    }

}
