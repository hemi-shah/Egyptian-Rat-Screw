/**
 * The TestCards class serves as a driver class to the Card, Deck, and Dealer classes
 * @author Hemi Shah
 * @version 1.0
 * @see Card, Deck, and Dealer
 */
public class TestCards { // TestCards class declaration
    public static void main (String[] args){ // main method signature
        // TESTING CARD CLASS
        Card faceCard = new Card(Card.ACE, Card.SPADES); // creates a new Card object called faceCard with a rank ACE and a suit SPADES
        Card numberedCard = new Card(8, Card.HEARTS); // createsa new Card object called numberedCard with a rank 8 and a suit HEARTS
        System.out.println(faceCard); // pretty prints faceCard 
        System.out.println(numberedCard); // pretty prints numberedCard

        // TESTING DECK CLASS
        Deck defaultDeck = new Deck(); // creates an instance of a Deck called defaultDeck
        System.out.println(defaultDeck); // pretty prints defaultDeck

        Deck newDeck = new Deck(defaultDeck); // creates an instance of a Deck called newDeck that is a deep copy of defaultDeck
        System.out.println(newDeck); // pretty prints newDeck

        // TESTING DEALER CLASS
        Dealer newDealer = new Dealer(); // creates a Dealer object called newDealer
        System.out.println(newDealer); // pretty prints newDealer
        System.out.println(newDealer.deals(5) + "\n"); // pretty prints the output when the deals method with a parameter of 5 is called to newDealer (prints 5 dealt cards) + a new line
        System.out.println(newDealer); // pretty prints newDealer
    }
}
