package blackjack;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class FirstMoveTest {

    @Test
    public void checkingLenghOfDeckAfterFirstMove() {

        // Given I have a Deck with 52 cards, a player Hand and a Dealer Hand created

        IDeck deck = new Deck();
        IHand dealer = new Hand("Dealer");
        IHand player = new Hand("Roberto");
        IFirstMove gameLogic = new FirstMove(deck, dealer, player);

        // When the first move of the game occurs

        gameLogic.startingMove();

        // Then the deck of cards will have 48 cards

        assertEquals(48, deck.getSize());
    }

    // @Test
    // public void checkHandCardsWhenStay() {

    // // Given: The initial cards have been dealt

    // IDeck deck = new Deck();
    // IHand dealer = new Hand("Dealer");
    // IHand player = new Hand("Rajaab");
    // IFirstMove gameLogic = new FirstMove(deck, dealer, player);

    // // When: The user decides to stay

    // gameLogic.stand();

    // // Then: The player's hand has 2 cards

    // assertEquals(2, player.getSize());
    // }

    // @Test
    // public void checkHandValueWhenStay() {

    // // Given: The user is dealt a 2 and a 3

    // IDeck deck = new Deck();
    // IHand dealer = new Hand("Dealer");
    // IHand player = new Hand("Rajaab");
    // IFirstMove gameLogic = new FirstMove(deck, dealer, player);

    // // When: The user decides to stay

    // gameLogic.stand();

    // // Then: The value's of the player's cards is still 5

    // assertEquals(5, player.getValue());
    // }

}
