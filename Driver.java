/**
 * The Driver class serves as a driver class to the Game and Player classes
 * @author Hemi Shah
 * @version 1.0
 * @see Player & Game
 */
public class Driver { // Driver class declaration
    public static void main (String[] args){ // main method signature
        // PLAYING GAME
        Game game = new Game(4); // initializes a new game object with 4 players
        System.out.println(game); // pretty prints game
        System.out.println(game.play()); // calls the play() method in game
        System.out.println(game); // pretty prints game again
    }
}
