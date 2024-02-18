/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;


/**
 * @author anmol 18 Feb 2024
 * @author jaskaran 18 Feb 2024
 * @author kanwar 18 Feb 2024
 * @author balkaran 18 Feb 2024
 * A class that models each Player in the War game.
 */
public class Player {

    private final String name;
    private GroupOfCards hand;

    public Player(String name) {
        this.name = name;
        hand = new GroupOfCards();
    }

    public String getName() {
        return name;
    }

    public GroupOfCards getHand() {
        return hand;
    }

    public void setHand(GroupOfCards hand) {
        this.hand = hand;
    }

    public Card playCard() {
        return hand.removeTopCard();
    }
}
