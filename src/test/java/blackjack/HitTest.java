package blackjack;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class HitTest {

    @Test
    public void checkHandCardsWhenHit() {

        // Given: The user decided to hit after the initial dealing of the cards

        IDeck deck = new Deck();
        IHand playerHand = new Hand("User");
        IHit hitLogic = new Hit();

        // When: The card is dealt

        hitLogic.hit(playerHand, deck);

        // Then: The player's hand has 3 cards

        assertEquals(1, playerHand.getSize());
    }

    // @Test
    // public void checkHandValueWhenHit() {

    // // Given: The user is dealt a 2 and a 3

    // IDeck deck = new Deck();
    // IHand dealer = new Hand("Dealer");
    // IHand player = new Hand("Rajaab");
    // IFirstMove gameLogic = new FirstMove(deck, dealer, player);

    // // When: The user decides to hit
    // // And: 5 is dealt to them

    // gameLogic.hit();

    // // Then: The value's of the player's cards is 10

    // assertEquals(3, player.getValue());
    // }

}
