package blackjack;

public class Stay implements IStay {

<<<<<<< HEAD
    public void stay(IHand hand,IDeck deck) {
        int handValue = hand.getValue();
        ITotalHandValues handValues = new TotalHandValues();
=======
    public IHand stay(IHand hand, IDeck deck) {
>>>>>>> 30c40ed7871605355f10bd7255b687f34cdb44c9

        ITotalHandValues handValues = new TotalHandValues();

<<<<<<< HEAD
            hand.addCard(deck.deal());
        } while (handValues.totalhandvalues(hand)<16);
=======
    while(handValues.totalhandvalues(hand)<17)
>>>>>>> 30c40ed7871605355f10bd7255b687f34cdb44c9

       hand.addCard(deck.deal());

        return hand;
    }

}
