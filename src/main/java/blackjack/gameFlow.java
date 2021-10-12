package blackjack;

public class gameFlow implements IGameFlow {
    private IDeck deck;
    private IFirstMove firstMove;
    private IHand handDealer;
    private IHand handPlayer;

    public gameFlow(IDeck deck, IFirstMove firstMove, IHand handDealer, IHand handPlayer) {
        this.deck = deck;
        this.firstMove = firstMove;
        this.handDealer = handDealer;
        this.handPlayer = handPlayer;
    }

    public void playGame() {
        deck.shuffle();
        firstMove.startingMove();

    }

}
