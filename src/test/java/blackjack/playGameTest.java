package blackjack;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class playGameTest {

    // Given The game has started
    // Dealer and player are dealt 2 cards

    @Test
    public void testGameFlow() {

        IDeck mDeck = mock(Deck.class);
        IHand mHandDealer = mock(Hand.class);
        IHand mHandPlayer = mock(Hand.class);
        IFirstMove mBlackJack = mock(FirstMove.class);

        IGameFlow game = new gameFlow(mDeck, mBlackJack, mHandDealer, mHandPlayer);

        game.playGame();
        // startingMove method is called once
        verify(mBlackJack, times(1)).startingMove();

    }
}
