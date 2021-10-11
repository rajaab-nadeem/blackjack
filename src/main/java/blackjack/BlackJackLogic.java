package blackjack;

public class BlackJackLogic implements IBlackJackLogic{
    private IDeck deck;
    private IHand dealer;
    private IHand player;


    public BlackJackLogic(IDeck deck, IHand dealer, IHand player) {
        this.deck=deck;
        this.dealer= dealer;
        this.player= player;


    }

    public void startingMove(){
        dealer.addCard(deck.deal());
        dealer.addCard(deck.deal());
        player.addCard(deck.deal());
        player.addCard(deck.deal());
        System.out.println(player.getName() + "'" + " cards: ");
        for(Card card:player.getHandOfCards()){
            System.out.println(card.showCard());
        }
        System.out.println("\n");
        System.out.println(dealer.getName() +  " card: ");

        System.out.println(dealer.getHandOfCards().get(dealer.getHandOfCards().size() - 1).showCard());


    }

    public void hit(){

    }

    public void stand(){

    }

    public void aceAdjustment(){

    }

    public boolean checkingIfWinner(){
        return true;
    }
}
