package blackjack;

public class FirstMove implements IFirstMove{
    private IDeck deck;
    private IHand dealer;
    private IHand player;

    public FirstMove(IDeck deck, IHand dealer, IHand player) {
        this.deck = deck;
        this.dealer = dealer;
        this.player = player;
    }


        public void startingMove(){
            deck.shuffle();
            dealer.addCard(deck.deal());
            dealer.addCard(deck.deal());
            player.addCard(deck.deal());
            player.addCard(deck.deal());



        }

}