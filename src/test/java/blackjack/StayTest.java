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
        player.addCard(deck.deal());
        player.addCard(deck.deal());
        ITotalHandValues handValues = new TotalHandValues();
        System.out.println(handValues.totalhandvalues(dealer));

        IStay stay = new Stay();
       IHand hand = stay.stay(dealer,deck);

      System.out.println(handValues.totalhandvalues(hand));
        assertEquals(true,handValues.totalhandvalues(dealer)>16);

    }
}
