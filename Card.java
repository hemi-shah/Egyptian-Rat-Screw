/**
 * The Card class stores information about a single Card
 * @author Hemi Shah
 * @version 1.0
 * @see TestCards
 */
public class Card { // Card class declaration
    /** 
     * m_rank is a member variable to store the Card's rank 
    */
    private int m_rank; // creates an int member variable m_rank
    
    /** 
     * m_suit is a member variable to store the Card's suit 
    */
    private int m_suit; // creates an int member variable m_suit

    /** 
     * represents the final int value of JACK
    */
    public static final int JACK = 11; // defines a public static final int JACK and initializes it to 11 (value cannot be changed and can be accessed from anywhere)
    
    /** 
     * represents the final int value of QUEEN
    */
    public static final int QUEEN = 12; // defines a public static final int QUEEN and initializes it to 12 (value cannot be changed and can be accessed from anywhere)
    
    /** 
     * represents the final int value of KING
    */
    public static final int KING = 13; // defines a public static final int KING and initializes it to 13 (value cannot be changed and can be accessed from anywhere)
    
    /** 
     * represents the final int value of ACE
    */
    public static final int ACE = 14; // defines a public static final int ACE and initializes it to 14 (value cannot be changed and can be accessed from anywhere)

    /** 
     * represents the final int value of HEARTS
    */
    public static final int HEARTS = 0; // defines a public static final int HEARTS and initializes it to 0 (value cannot be changed and can be accessed from anywhere)
    
    /** 
     * represents the final int value of SPADES
    */
    public static final int SPADES = 1; // defines a public static final int SPADES and initializes it to 1 (value cannot be changed and can be accessed from anywhere)
    
    /** 
     * represents the final int value of CLUBS
    */
    public static final int CLUBS = 2; // defines a public static final int CLUBS and initializes it to 2 (value cannot be changed and can be accessed from anywhere)
    
    /** 
     * represents the final int value of DIAMONDS
    */
    public static final int DIAMONDS = 3; // defines a public static final int DIAMONDS and initializes it to 3 (value cannot be changed and can be accessed from anywhere)

    /**
     * A default constructor for the Card class
     */
    public Card(){
        m_rank = ACE; // sets the default m_rank to ACE
        m_suit = SPADES; // sets the default m_suit to SPADES
    }

    /**
    * Create a Card instance with attributes specified
    * @param rank The Card's rank
    * @param suit The Card's uit
    */
    public Card(int rank, int suit){
        m_rank = rank; // sets m_rank to the rank parameter
        m_suit = suit; // sets m_suit to the suit parameter
    }

    /**
    * The Card copy constructor
    * @param c The Card to copy
    */
    public Card(Card c){
        this.m_rank = c.m_rank; // new Card  m_rank will be a copy of the value of c m_rank
        this.m_suit = c.m_suit; // new Card m_suit will be a copy of the value of c m_suit
    }

    /**
    * Returns a String representation of the Card instance
    * @return String s a pretty printed version of the object
    */
    public String toString(){
        /* BEGINNING OF CODE FROM CHAT GPT: PROMPT ASKED: How can I initialize rank and suit so they work within this method? */
        String rank = ""; // creates an empty String rank
        String suit = ""; // creates an empty String suit
        /* END OF CODE FROM CHAT GPT */
        String s = ""; // creates an empty String s
        if ((m_rank == 11) || (m_rank == JACK)){ // checks to see if m_rank equals 11 or JACK
            rank = "Jack"; // sets the String rank to "Jack"
        }
        else if ((m_rank == 12) || (m_rank == QUEEN)){ // checks to see if m_rank equals 12 or QUEEN
            rank = "Queen"; // sets the String rank to "Queen"
        }
        else if ((m_rank == 13) || (m_rank == KING)){ // checks to see if m_rank equals 13 or KING
            rank = "King"; // sets the String rank to "King"
        }
        else if ((m_rank == 14) || (m_rank == ACE)){ // checks to see if m_rank equals 14 or ACE
            rank = "Ace"; // sets the String rank to "Ace"
        }
        else {
            /* BEGIN CODE FROM SOURCE: https://www.javatpoint.com/java-int-to-string#:~:text=We%20can%20convert%20int%20to,method%2C%20string%20concatenation%20operator%20etc. */
            rank = String.valueOf(m_rank); // sets the String rank to the String value of m_rank (type casts int to String)
            /* END CODE FROM SOURCE: https://www.javatpoint.com/java-int-to-string#:~:text=We%20can%20convert%20int%20to,method%2C%20string%20concatenation%20operator%20etc. */
        }

        if ((m_suit == 0) || (m_suit == HEARTS)){ // checks to see if m_suit equals 0 or HEARTS
            suit = "Hearts"; // sets the String suit to "Hearts"
        }
        else if ((m_suit == 1) || (m_suit == SPADES)){ // checks to see if m_suit equals 1 or SPADES
            suit = "Spades"; // sets the String suit to "Spades"
        }
        else if ((m_suit == 2) || (m_suit == CLUBS)){ // checks  to see if m_suit equals 2 or CLUBS
            suit = "Clubs"; // sets the String suit to "Clubs"
        }
        else if ((m_suit == 3) || (m_suit == DIAMONDS)){ // checks to see if m_suit equals 2 or DIAMONDS
            suit = "Diamonds"; // sets the String suit to "Diamonds"
        }
        else {
            /* BEGIN CODE FROM SOURCE: https://www.javatpoint.com/java-int-to-string#:~:text=We%20can%20convert%20int%20to,method%2C%20string%20concatenation%20operator%20etc. */
            suit = String.valueOf(m_suit); // sets the String suit to the String value of m_suit (type casts int to String)
            /* END CODE FROM SOURCE: https://www.javatpoint.com/java-int-to-string#:~:text=We%20can%20convert%20int%20to,method%2C%20string%20concatenation%20operator%20etc. */
        }

        s += rank + " of " + suit + "\n"; // adds the value of String rank + of + the value of String suit + a new line to s
        return s; // returns the value of s
    }

    /**
    * To compare two Card objects for equality 
    * Two Card objects are said to be equal if their rank and suit are the same
    * @param obj Object 1 to be compared for equality
    * @return True if the objects are equal and false otherwise
    */
    public boolean equals(Object obj){
        if (obj == this){  // checks to see if obj is the same object as the one it is being compared to 
            return true; // returns true
        }
        if (!(obj instanceof Card)){  // checks to see if obj is not an instance of the Card class
            return false; // returns false
        }
        Card c = (Card) obj; // turns obj into a Card object by type casting
        return ((this.m_rank == (c.m_rank)) && // compares m_rank of an object with the m_rank of c
                (this.m_suit == (c.m_suit))); // compares m_suit of an object with the m_suit of c
    }

    /**
    * Mutator for rank and suit attributes
    * @param newRank The new rank for the Card
    * @param newSuit The new suit for the Card
    */
    public void setRank(int newRank, int newSuit){
        m_rank = newRank; // sets the value of m_rank to the parameter newRank
        m_suit = newSuit; // sets the value of m_suit to the parameter newSuit
    }

    /**
    * Accessor for rank attribute
    * @return a String m_rank representing the Card's rank
    */
    public int getRank(){
        return m_rank; // returns the value of m_rank
    }

    /**
    * Accessor for suit attribute
    * @return a String m_suit representing the Card's suit
    */
    public int getSuit(){
        return m_suit; // returns the value of m_suit
    }
}
