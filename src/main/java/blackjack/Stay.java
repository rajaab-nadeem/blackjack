package blackjack;

public class Stay implements IStay {

    public void stay(IHand hand,IDeck deck) {
        int handValue = hand.getValue();

        do {

            hand.addCard(deck.deal());
        } while (hand.getValue()>16);


    }

}
