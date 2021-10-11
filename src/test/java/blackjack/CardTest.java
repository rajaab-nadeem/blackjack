package blackjack;

import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void cardNameTest(){
        
        //Given I create a card with rank "Two" and suit "Heart"
        
        ICard card = new Card("Two" , "Heart");
        
        //When I show the card

        String newCard= card.showCard();
        String expected= "The Two of Heart";
        
        //Then I see "The Two of Heart"

        assertEquals(expected,newCard);

    }

    @Test
    public void cardStartingValue(){

        //Given I create a card with rank "Two" and suit "Heart"

        ICard card = new Card("Two" , "Heart");

        //When I see the value of the card

        int value = card.getValue();


        //Then I see the value of 0

        assertEquals(0,value);

    }

    @Test
    public void cardGetSetValue(){

        //Given I create a card with value 2

        ICard card = new Card("Two" , "Heart");
        card.setValue(2);

        //When I see the value of the card

        int value = card.getValue();


        //Then I see the value of 2

        assertEquals(2,value);

    }



}
