package blackjack;

import java.util.ArrayList;

public class Hand implements IHand {

    private ArrayList<Card> handOfCards;
    private int value;
    private String name;


    public Hand(String name){
        this.value=0;
        this.name=name;
        this.handOfCards = new ArrayList<Card>();


    }

    public void addCard(Card card){
        this.handOfCards.add(card);
        System.out.println(this.handOfCards.size());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSize(){
        return this.handOfCards.size();
    }
}
