package blackjack;

import java.util.ArrayList;

public class Deck implements IDeck{
    private ArrayList<Card> deckOfCards;
    private ArrayList<String> ranks;
    private ArrayList<String> suits;


    public Deck(ArrayList<String> ranks, ArrayList<String> suits){
        this.ranks=ranks;
        this.suits=suits;

        ArrayList<Card> deckOfCards = new ArrayList<Card>();
        for(String rank:ranks){
            for(String suit:suits){
                deckOfCards.add(new Card(rank,suit));


            }

        }

        for(Card card:deckOfCards){
            System.out.println(card.showCard());
        }

    }
    
    public String deal(){
        return "Test";

    }


    public void shuffle(){

    }

}
