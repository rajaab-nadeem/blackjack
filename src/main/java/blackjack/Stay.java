package blackjack;

public class Stay implements IStay {


    public void stay(IHand hand,IDeck deck) {

        ITotalHandValues handValues = new TotalHandValues();

        do {
            hand.addCard(deck.deal());


        }while(handValues.totalhandvalues(hand)<16);









    }

}
