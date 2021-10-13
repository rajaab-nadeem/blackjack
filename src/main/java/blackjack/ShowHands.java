package blackjack;

public class ShowHands implements IShowHands {

    public void showCards(IHand player, IHand dealer){

        System.out.println(player.getName() + "'" + " cards: ");
        for (ICard card : player.getHandOfCards()) {
            System.out.println(card.showCard());
        }
        System.out.println("\n");
        System.out.println(dealer.getName() + " card: ");
        System.out.println(dealer.getHandOfCards().get(dealer.getHandOfCards().size() - 1).showCard());
    }

}
