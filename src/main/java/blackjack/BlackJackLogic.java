package blackjack;

import java.util.Hashtable;

public class BlackJackLogic implements IBlackJackLogic{
    private IDeck deck;
    private IHand dealer;
    private IHand player;
    private Hashtable<String,Integer> values;


    public BlackJackLogic(IDeck deck, IHand dealer, IHand player) {
        this.deck=deck;
        this.dealer= dealer;
        this.player= player;

        this.values = new Hashtable<String,Integer>();
        this.values.put("Two",2);
        this.values.put("Three",3);
        this.values.put("Four",4);
        this.values.put("Five",5);
        this.values.put("Six",6);
        this.values.put("Seven",7);
        this.values.put("Eight",8);
        this.values.put("Nine",9);
        this.values.put("Ten",10);
        this.values.put("Jack",10);
        this.values.put("Queen",10);
        this.values.put("King",10);
        this.values.put("Ace",11);


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


    public void aceAdjustment(IHand hand){

    }

    public boolean checkingIfWinner(){
        return true;
    }

    public int checkingHandValues(IHand hand){
        for(Card card: hand.getHandOfCards()){
          hand.setValue(hand.getValue()+ values.get(card.getRank()));
        }
        return hand.getValue();

    }

    public Hashtable<String, Integer> getValues() {
        return values;
    }
}
