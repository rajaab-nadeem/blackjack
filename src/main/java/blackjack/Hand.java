package blackjack;

import java.util.ArrayList;

public class Hand implements IHand {

    private ArrayList<ICard> handOfCards;
    private int value;
    private String name;
    private int chips;

    public Hand(String name) {
        this.value = 0;
        this.name = name;
        this.handOfCards = new ArrayList<ICard>();
        this.chips = 100;
    }

    public int getChips() {
        return this.chips;
    }

    public void setChips(int bet) {
        this.chips += bet;
    }

    public void addCard(ICard card) {
        this.handOfCards.add(card);

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSize() {
        return this.handOfCards.size();
    }

    public ArrayList<ICard> getHandOfCards() {
        return handOfCards;
    }

    public String getName() {
        return name;
    }
}
