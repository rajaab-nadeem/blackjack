package blackjack;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class BleckJackLogicTest {

    @Test
    public void checkingLenghOfDeckAfterFirstMove(){

        //Given I have a Deck with 52 cards, a player Hand and a Dealer Hand created

        IDeck deck =new Deck();
        IHand dealer = new Hand("Dealer");
        IHand player= new Hand("Roberto");
        IBlackJackLogic gameLogic = new BlackJackLogic(deck,dealer,player);


        //When the first move of the game occurs

        gameLogic.startingMove();

        //Then the deck of cards will have 48 cards

        assertEquals(48,deck.getSize());


    }

}
