package blackjack;

public class gameFlow implements IGameFlow {
    private IDeck deck;
    private IFirstMove firstMove;
    private IHand handDealer;
    private IHand handPlayer;
    private ITotalHandValues THValues;
    private IHit hit;
    private IStay stay;
    private IShowHands showhands;
    private ICheckForWinner checkforwinners;


    public gameFlow(IFirstMove firstMove,IDeck deck,  IHand handDealer, IHand handPlayer, ITotalHandValues THValues,IHit hit,IStay stay,IShowHands showhands,ICheckForWinner checkforwinners) {

        this.firstMove = firstMove;
        this.deck = deck;
        this.handDealer = handDealer;
        this.handPlayer = handPlayer;
        this.THValues=THValues;
        this.hit=hit;
        this.stay=stay;
        this.showhands=showhands;
        this.checkforwinners=checkforwinners;


    }

    public void playGame() {
        deck.shuffle();
        firstMove.startingMove();

    }

}
