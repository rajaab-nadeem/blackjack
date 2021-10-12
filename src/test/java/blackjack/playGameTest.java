package blackjack;

import static org.mockito.Mockito.*;

public class playGameTest {

    //Given The game has started
    //Dealer and player are dealt 2 cards


    public void testGameFlow(){

        IDeck mDeck = mock(Deck.class);
        IHand mHandDealer = mock(Hand.class);
        IHand mHandPlayer = mock(Hand.class);
        IFirstMove mBlackJack = mock(FirstMove.class);

        IGameFlow game = new gameFlow(mDeck,mBlackJack,mHandPlayer);
        //IGameFlow game = new gameFlow(mDeck,mHandDealer,mHandPlayer,mBlackJack);

        game.playGame();
// startingMove method is called once
        verify(mBlackJack, times(1)).startingMove();


    }
}
