package blackjack;

import java.util.ArrayList;

public class Deck implements IDeck{
    private ArrayList<Card> deckOfCards;
    private ArrayList<String> ranks;
    private ArrayList<String> suits;


    public Deck(){
        this.suits=new ArrayList<String>();
        suits.add("Two");
        suits.add("Three");
        suits.add("Four");
        suits.add("Five");
        suits.add("Six");
        suits.add("Seven");
        suits.add("Eight");
        suits.add("Nine");
        suits.add("Ten");
        suits.add("Jack");
        suits.add("Queen");
        suits.add("King");
        suits.add("Ace");

        this.ranks=new ArrayList<String>();
        ranks.add("Hearts");
        ranks.add("Diamonds");
        ranks.add("Spades");
        ranks.add("Clubs");

        this.deckOfCards = new ArrayList<Card>();
        for(String rank:ranks){
            for(String suit:suits){
                deckOfCards.add(new Card(rank,suit));


            }

        }

        for(Card card:deckOfCards){
            System.out.println(card.showCard());
        }
        System.out.println(deckOfCards.size());

    }
    
    public Card deal(){
        if(deckOfCards.size()>0) {
            Card card = deckOfCards.remove(deckOfCards.size() - 1);
            return card;
        }return null;

    }


    public void shuffle(){

    }

    public int getSize(){

        return this.deckOfCards.size();
    }

}
