package blackjack;

public class Stay implements IStay {


    public void stay(IHand hand,IDeck deck) {

        ITotalHandValues handValues = new TotalHandValues();

       int handTotal= hand.getValue();

       while(handTotal<16){

           hand.addCard(deck.deal());

           handTotal=handValues.totalhandvalues(hand);
       }










    }

}
