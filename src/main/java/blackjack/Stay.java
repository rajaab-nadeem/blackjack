package blackjack;

public class Stay implements IStay {


    public void stay(IHand hand,IDeck deck) {

        ITotalHandValues handValues = new TotalHandValues();
      int totalValue = handValues.totalhandvalues(hand);

      while(totalValue<16){
          hand.addCard(deck.deal());



        }



    }

}
