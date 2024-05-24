/**
 * The Game class stores information on a single game
 * @author Hemi Shah
 * @version 1.0
 * @see Driver
 */
import java.util.LinkedList; // imports the LinkedList class
import java.util.Random; // imports the Random class

public class Game { // Game class declaration
    /** 
     * m_currentPlayer is a member variable to the current player
    */
    private Player m_currentPlayer; // DR. EEL: creates a type Player member variable m_currentPlayer

    /** 
     * m_players is a member variable to a list of Players
    */
    private LinkedList<Player> m_players = new LinkedList<>(); // creates a type LinkedList that holds Player objects member variable m_players

    /** 
     * m_pile is a member variable to a list of the current pile of cards in the game
    */
    private LinkedList<Card> m_pile = new LinkedList<>(); // creates a type LinkedList that holds Card objects member variable m_pile

    /**
     * m_dealer is a member variable to the Game's deck of cards
     */
    private Deck m_dealer; // creates a type Deck member variable m_dealer

    /**
     * m_patterns is a member variable to the Player's pattern in the Game
     */
    private String[] m_patterns; // creates a type Array that holds Strings member variable m_patterns

    /**
     * Accessor for players attribute
     * @return a Linked List of Player objects m_players representing the list of Players in the Game
    */
    public LinkedList<Player> getPlayers(){
        return m_players; // returns the value of m_players
    }

    /**
     * Accessor for pile attribute
     * @return a Linked List of Card objects m_pile representing the current pile of cards in the game
     */
    public LinkedList<Card> getPile(){
        return m_pile; // returns the value of m_pile
    }

    /**
     * Accessor for dealer attribute
     * @return a Deck object m_dealer representing the Game's deck of cards
     */
    public Deck getDeck(){
        return m_dealer; // returns the value of m_dealer
    }

    /**
     * Accessor for patterns attribute
     * @return an Array that holds Strings m_patterns representing the Player's pattern in the Game
     */
    public String[] getPatterns(){
        return m_patterns; // returns the value of m_patterns
    }

    /**
     * A default constructor for the Game class that initializes a game of 2 Players
     */
    public Game(){
        m_players = new LinkedList<Player>(); // sets the default m_players to a new LinkedList that holds Player objects
        Dealer dealer = new Dealer(); // creates a new Dealer object called dealer
        Random rand = new Random(); // creates a new Random object called rand
        String pattern = ""; // creates a new empty String called pattern
        for(int i = 1; i < 3; ++i){ // creates a for loop where int i iterates twice
            int randNum = rand.nextInt(3) + 1; // creates an int called randNum that stores a random number between 1 and 3
            if (randNum == 1){ // checks if randNum equals 1
                pattern = "topBottom"; // sets pattern to topBottom
            }
            else if (randNum == 2){ // checks if randNum equals 2
                pattern = "doubles"; // sets pattern to doubles
            }
            else if (randNum == 3){ // checks if randNum equals 3
                pattern = "sandwich";  // sets pattern to sandwich
            }

            // creates a new Player object with a player number, 26 dealt cards, and a pattern and adds it to m_players
            m_players.add(new Player(i, dealer.deals(26), pattern)); 
        }
        m_currentPlayer = m_players.getFirst(); // DR. EEL: sets the default m_currentPlayer to the first player in m_players
    }

    /**
     * An overlaoded constructor that takes in the number of players
     * @param numPlayers
     */
    public Game(int numPlayers){
        m_players = new LinkedList<Player>();  // sets m_players to a new LinkedList that holds Player objects
        Random rand = new Random(); // creates a new Random object called rand
        Dealer dealer = new Dealer(); // creates a new Dealer object called dealer

        String pattern = ""; // creates an emtpy String called pattern

        for(int i = 1; i < numPlayers + 1; ++i){
            int randNum = rand.nextInt(3) + 1; // creates an int called randNum that stores a randum number between 1 and 3
            if (randNum == 1){ // checks if randNum equals 1
                pattern = "topBottom"; // sets pattern to topBottom
            }
            else if (randNum == 2){ // checks if randNum equals 2
                pattern = "doubles"; // sets pattern to doubles
            }
            else if (randNum == 3){ // checks if randNum equals 3
                pattern = "sandwich";  // sets pattern to sandwich
            }

             // creates a new Player object with a player number, dealt number of cards, and a pattern and adds it to m_players
            m_players.add(new Player(i, dealer.deals(52 / numPlayers), pattern));
        }
        m_currentPlayer = m_players.getFirst(); // DR. EEL: sets the default m_currentPlayer to the first player in m_players
    }

    /**
     * a method to carry out the rule sof the game until one Player is remaining
     * @return the Player number of the winner
     */
    public int play() {
    while (m_pile.size() < 52 && m_players.size() > 1) { // executes a loop as long as m_pile has less than 52 cards and there is more than 1 Player in m_players
        System.out.println("Current Player: " + m_currentPlayer); // prints Current Player: + m_currentPlayer

        if (m_currentPlayer.getHand().size() == 0) { // checks if m_currentPlayer's has no cards left in their m_hand
            // prints Player: + Player number of the current Player + is out of cards and is eliminated + a new line
            System.out.println("Player " + m_currentPlayer.getPlayerNum() + " is out of cards and is eliminated" + "\n"); 
            m_players.remove(m_currentPlayer); // removes m_currentPlayer from m_players
            m_currentPlayer = nextPlayer(); // sets m_currentPlayer to the nextPlayer()
            continue; // goes to the beginning of the loop
        }

        Card playerCard = m_currentPlayer.playCard(); // creates a new Card object called playerCard that is Card played by the current Player
        m_pile.add(playerCard); // adds playerCard to m_pile
        System.out.println("Player " + m_currentPlayer.getPlayerNum() + " plays " + playerCard); // prints Player + Player number of the current Player + plays + playerCard

        if (m_currentPlayer.getPattern().equals("topBottom")) { // checks to see if the current Player's pattern is topBottom
        if (topBottom(m_pile)) { // checks to see if topBottom is true
            System.out.println("Player " + m_currentPlayer.getPlayerNum() + " slaps for the top bottom pattern"); // prints Player + Player number of the current Player + slaps for the top bottom pattern   
            for (Card card : m_pile) { // iterates through each Card in m_pile
                System.out.println("Adding " + card + " to Player" + m_currentPlayer.getPlayerNum()); // prints Adding + card + to Player + Player number of the current Player
                m_currentPlayer.getHand().add(card); // adds card to the current Player's m_hand
            }
            
            m_pile.clear(); // clears m_pile
            System.out.println("Clearing pile"); // prints Clearing pile
            
            continue; // goes to the beginning of the loop
        }
    } else if (m_currentPlayer.getPattern().equals("doubles")) {
        if (doubles(m_pile)) { // checks to see if doubles is true
            System.out.println("Player " + m_currentPlayer.getPlayerNum() + " slaps for the doubles pattern"); // prints Player + Player number of the current Player + slaps for the doubles pattern        
            for (Card card : m_pile) { // iterates through each Card in m_pile
                System.out.println("Adding " + card + " to Player" + m_currentPlayer.getPlayerNum()); // prints Adding + card + to Player + Player number of the current Player
                m_currentPlayer.getHand().add(card); // adds card to the current Player's m_hand
            }
            m_pile.clear(); // clears m_pile
            System.out.println("Clearing pile"); // prints Clearing pile
            
            continue; // goes to the beginning of the loop
        }
    } else if (m_currentPlayer.getPattern().equals("sandwich")) {
        if (sandwich(m_pile)) { // checks to see if sandwich is true
            System.out.println("Player " + m_currentPlayer.getPlayerNum() + " slaps for the sandwich pattern"); // prints Player + Player number of the current Player + slaps for the sandwich pattern   
            for (Card card : m_pile) { // iterates through each Card in m_pile
                System.out.println("Adding " + card + " to Player" + m_currentPlayer.getPlayerNum()); // prints Adding + card + to Player + Player number of the current Player
                m_currentPlayer.getHand().add(card); // adds card to the current Player's m_hand
            }
            m_pile.clear(); // clears m_pile
            System.out.println("Clearing pile"); // prints Clearing pile
            
            continue; // goes to the beginning of the loop
        }
    }

        if (playerCard.getRank() >= 11 && playerCard.getRank() <= 14) { // checks to see if the rank of playerCard is between 11 and 14
            int chances = playerCard.getRank() - 10; // creates an int called chances that is the rank of playerCard - 10
            Player faceCardPlayer = m_currentPlayer; // creates a Player object called faceCardPlayer that is the current Player

            m_currentPlayer = nextPlayer(); // sets the current Player to the next Player

            while (chances > 0 && m_currentPlayer.getHand().size() > 0) { // executes a loop as long as chances is greater than 0 and the current Player has Cards in their m_hand
                if (m_currentPlayer.getHand().size() == 0){ // checks if the current Player has Cards in their m_hand
                    System.out.println("Removing " + m_currentPlayer); // prints Removing: + current Player
                    m_players.remove(m_currentPlayer); // removes the current Player from m_players
                    m_currentPlayer = nextPlayer(); // sets the current Player as the next Player
                    System.out.println("New Current Player: " + m_currentPlayer); // prings New Current Player: + currentPlayer
                    continue; // goes to the beginning of the loop
                }

                System.out.println("Chances: " + chances); // prints Chances: + chances
                playerCard = m_currentPlayer.playCard(); // sets playerCard to the played Card of the current Player
                m_pile.add(playerCard); // adds playerCard to the pile
                System.out.println("Player " + m_currentPlayer.getPlayerNum() + " adds " + playerCard + " to face-off"); // prints Player + Player number of the current Player + adds + playCard + to face-off

                if (playerCard.getRank() >= 11 && playerCard.getRank() <= 14) { // checks to see if the rank of playerCard is between 11 and 14
                    chances = playerCard.getRank() - 10; // sets chances to the rank of playerCard - 10
                    faceCardPlayer = m_currentPlayer;  // sets faceCardPlayer to the current Player
                    m_currentPlayer = nextPlayer(); // sets the current Player to the next Player
                    
                } else if (chances == 0){ // checks to see if chances equals 0
                    break; // breaks out of the loop
                } else {
                    chances--; // decrements chances
                }
                
            }

            if (chances == 0) { // checks to see if chances equals 0
                System.out.println("Returning the pile to Player " + faceCardPlayer.getPlayerNum() + "\n"); // prints Returning the pile to Player + Player number of the faceCardPlayer + a new line
                for (Card card : m_pile) { // iterates through each Card in m_pile
                        faceCardPlayer.getHand().add(card); // adds card to the faceCardPlayer's m_hand
                    }
                    m_pile.clear(); // clears m_pile
                    m_currentPlayer = nextPlayer(); // sets the current Player to the next Player
            }
            
        }

       m_currentPlayer = nextPlayer();  // sets the current Player to the next Player
    }

    if (m_players.size() == 1) { // checks to see if the size of m_players is 1
        System.out.println("Returning the pile to Player " + m_currentPlayer.getPlayerNum() + "\n"); // prints Returning the pile to Player + Player number of the current Player + a new line
        for (Card card : m_pile) { // iterates through each Card in m_pile
            m_currentPlayer.getHand().add(card); // adds card to the current Player's m_hand
        }
        m_pile.clear(); // clears m_pile
    }
    System.out.print("Winner: Player "); // prints Winner: Player
    return m_players.getFirst().getPlayerNum(); // returns the Player number of the remaining Player in m_players
}

    /**
     * a method to return the next Player in the circle
     * @return a Player object in m_players representing the next Player
     */
    private Player nextPlayer() {
        if (m_players.isEmpty()) { // checks if m_players is empty
            return null; // returns null
        }
        // START & END OF Chat GPT CODE: PROMPT: How can I properly get the index of the next player?
        int nextPlayerIndex = (m_players.indexOf(m_currentPlayer) + 1) % m_players.size(); // creates an int called nextPlayerIndex that is the index of the next player
       
        return m_players.get(nextPlayerIndex); // returns a Player object of the next player using a given index
    }

    /**
     * a static method to detect the topBottom pattern in the Game
     * @param pile a pile of Cards - a LinkedList that holds Cards objects
     * @return true or false depending on if topBottom pattern is detected or not
     */
    static boolean topBottom(LinkedList<Card> pile) {
    if (pile.isEmpty() || pile.size() < 2) { // checks if the pile is empty or if the pile's size is less than 2
        return false; // returns false
    }

    Card topCard = pile.getLast(); // creates a Card object called topCard that is the last Card in the pile
    Card bottomCard = pile.getFirst();  // creates a Card object called bottomCard that is the first Card in the pile

    if (topCard.getRank() == bottomCard.getRank()) { // checks to see if the rank of topCard is the same as the rank of bottomCard
        return true; // returns true
    } else {
        return false; // returns false
    }
}

    /**
     * a static method to detect the doubles pattern in the Game
     * @param pile a pile of Cards - a LinkedList that holds Cards objects
     * @return true or false depending on if doubles pattern is detected or not
     */
    static boolean doubles(LinkedList<Card> pile) {
    if (pile.size() < 2) { // checks to see if the size of the pile is less than 2
        return false; // returns false
    }

    Card currentCard = pile.get(pile.size() - 1); // creates a Card object called currentCard that is the current Card in the pile
    Card previousCard = pile.get(pile.size() - 2); // creates a Card object called previousCard that is the previous Card in the pile

    if (previousCard.getRank() == currentCard.getRank()){ // checks to see if the rank of previousCard is the same as the rank of currentCard
        return true; // returns true
    }
    else{
        return false; // returns false
    }
}

    /**
     * a static method to detect the sandwich pattern in the Game
     * @param pile a pile of Cards - a LinkedList that holds Cards objects
     * @return true or false depending on if sandwich pattern is detected or not
     */
    static boolean sandwich(LinkedList<Card> pile) {
    if (pile.size() != 3) { // checks to see if the size of the pile does not equal 3
        return false; // returns false
    }

    Card firstCard = pile.getFirst(); // creates a Card object called firstCard that is the first Card in the pile
    // START & END Chat GPT code: PROMPT: How can I check for a sandwich pattern in this method?
    Card middleCard = pile.get(1); // creates a Card object called middleCard that is the 2nd card in the pile
    Card lastCard = pile.getLast(); // creates a Card object called lastCard that is the last Card in the pile

    // START Chat GPT code: PROMPT: How can I check for a sandwich pattern in this method?
    // checks to see if the rank of the firstCard is the same as the rank of the lastCard and if the rank of the middleCard does not equal the rank of the firstCard
    if (firstCard.getRank() == lastCard.getRank() && middleCard.getRank() != firstCard.getRank()) { 
        return true;  // returns true
    }

    return false; // returns false
    // END CHAT GPT
}


    /**
    * Returns a String representation of the Game instance
    * @return String s a pretty printed version of the object
    */
    public String toString(){
        String s = ""; // creates an empty String variable s
        s += "Players:\n"; // adds Players: + a new line to s
        for (Player player : m_players) {  // iterates through each Player in m_players
        s += player.toString() + "\n"; // calls the toString method on player and adds it to s
    }

        s += "Pile:\n"; // adds Pile: + a new line to s
        for (Card card : m_pile) { // iterates through each Card in m_pile
        s += card.toString() + "\n"; // calls the toString method on card and adds it to s
    }
        return s; // returns the value of s
    }  

}