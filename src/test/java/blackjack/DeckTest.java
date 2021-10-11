 package blackjack;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void deckSizeTest(){

        //Given I have a deck of 52 cards

        IDeck deck = new Deck();

        //When 1 card is dealt

        deck.deal();

        //Then the deck will have 51 cards
        int newSize= deck.getSize();
        assertEquals(51,newSize);
    }

    @Test
    public void deckTestafterShuffle(){

        IDeck deck = new Deck();

        deck.shuffle();

    }
}
