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
            System.out.println(player.getName() + "'" + " cards: ");
            for (ICard card : player.getHandOfCards()) {
                System.out.println(card.showCard());
            }
            System.out.println("\n");
            System.out.println(dealer.getName() + " card: ");

            System.out.println(dealer.getHandOfCards().get(dealer.getHandOfCards().size() - 1).showCard());


        }

}