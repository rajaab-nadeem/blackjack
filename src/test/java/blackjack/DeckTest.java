package blackjack;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void checkDeckSize() {

        // Given: When there is a user
        IDeck deck2 = new Deck();

        // When: The game is started

        deck2.getSize();

        // Then: A deck of 52 cards is created
        int deckSize = deck2.getSize();
        assertEquals(52, deckSize);
    }

    @Test
    public void deckSizeTest() {

        // Given I have a deck of 52 cards

        IDeck deck = new Deck();

        // When 1 card is dealt

        deck.deal();

        // Then the deck will have 51 cards
        int newSize = deck.getSize();
        assertEquals(51, newSize);
    }

    @Test
    public void checkCardSuit() {
        // Given: There is a deck of cards

        IDeck deck3 = new Deck();

        // When: The game is started

        deck3.getDeckSuits("Hearts");

        // Then: The deck will have 4 of a kind per card

        int deckSize = deck3.getDeckSuits("Hearts");
        assertEquals(13, deckSize);
    }

    @Test
    public void checkCardRanks() {
        // Given: There is a deck of cards

        IDeck deck = new Deck();

        // When: The game is started

        deck.getDeckRanks("Two");

        // Then: The deck will have 4 of a kind per card

        int deckValues = deck.getDeckRanks("Two");
        assertEquals(4, deckValues);
    }

    @Test
    public void deckTestafterShuffle() {

        IDeck deck = new Deck();

        deck.shuffle();

    }
}
