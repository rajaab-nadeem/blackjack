package blackjack;

import org.junit.Test;
import static org.junit.Assert.*;

public class HandTest {

    @Test
    public void handLenghtTest(){

        //Given the game is on and the player Roberto's hand is created
          IHand roberto = new Hand("Roberto");

        //When I check to see how many cards the hand has
         int size=roberto.getSize();

        //Then I see the value of 0
       assertEquals(0,size);


    }

    @Test
    public void handLenghtAfterDealTest(){
        IDeck deck = new Deck();

        //Given the game is on and the player Roberto's hand is created
        IHand roberto = new Hand("Roberto");

        //When the fisrt card is dealt to Roberto's hand and I check to see how many cards Roberto's hand has
        roberto.addCard(deck.deal());
        int size=roberto.getSize();

        //Then I see the value of 1
        assertEquals(1,size);


    }

}
