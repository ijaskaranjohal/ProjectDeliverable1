package ca.sheridancollege.project;
/**
 * A class that contains the main method to run the War game.
 */
public class WarMain {

    public static void main(String[] args) {
        int roundLimit = 10; // Set the round limit
        WarGame warGame = new WarGame(roundLimit);
        warGame.play();
        warGame.declareWinner();
    }
}

