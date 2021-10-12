package blackjack;

import java.util.ArrayList;

public class Card implements ICard {
    private String rank;
    private String suit;
    private int value;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        value = 0;

    }

    public String showCard() {

        return "The " + rank + " of " + suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

}
