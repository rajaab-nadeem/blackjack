package blackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StayTest {

    @Test
    public void stayTest(){
        IHand dealer = new Hand("Dealer");
        IHand player = new Hand("Shilpa");
        IDeck deck = new Deck();
        deck.shuffle();
        dealer.addCard(deck.deal());
        dealer.addCard(deck.deal());
        IStay stay = new Stay();
        stay.stay(dealer,deck);
        ITotalHandValues handValues = new TotalHandValues();

        assertEquals(true,handValues.totalhandvalues(dealer)>16);

    }
}
