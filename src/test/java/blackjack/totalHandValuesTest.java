package blackjack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class totalHandValuesTest {



    @Test
    public void getHandValueRegularCardsTest(){

        //Given there is a game on and the player has a hand with two cards, "The Two Of Hearts" and "The Six Of Spades"

        IDeck deck =new Deck();
        IHand dealer = new Hand("Dealer");
        IHand player= new Hand("Roberto");
        ITotalHandValues gameLogic = new TotalHandValues(deck,dealer,player);
        ICard one = new Card("Two","Hearts");
        ICard two = new Card("Six","Spades");
        player.addCard(one);
        player.addCard(two);


        //When I check the value of the players hand

        gameLogic.totalhandvalues(player);
        int value = player.getValue();

        //Then I see the value of 8

        assertEquals(8,value);
    }


    @Test
    public void getHandValueAcesCardsTest(){

        //Given there is a game on and the player has a hand with two cards of Aces, "The Ace Of Hearts" and "The Ace Of Spades"

        IDeck deck =new Deck();
        IHand dealer = new Hand("Dealer");
        IHand player= new Hand("Roberto");
        ITotalHandValues gameLogic = new TotalHandValues(deck,dealer,player);
        ICard one = new Card("Ace","Hearts");
        ICard two = new Card("Ace","Spades");
        player.addCard(one);
        player.addCard(two);


        //When I check the value of the players hand

        gameLogic.totalhandvalues(player);
        int value = player.getValue();

        //Then I see the value of 12

        assertEquals(12,value);
    }

}