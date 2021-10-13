package blackjack;

public class Stay implements IStay {

    public IHand stay(IHand hand, IDeck deck) {

        ITotalHandValues handValues = new TotalHandValues();

    while(handValues.totalhandvalues(hand)<17)

       hand.addCard(deck.deal());

        return hand;
    }

}
