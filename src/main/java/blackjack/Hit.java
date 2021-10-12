package blackjack;

public class Hit implements IHit {

    public void hit(IHand hand, IDeck deck) {
        hand.addCard(deck.deal());
    }
}
