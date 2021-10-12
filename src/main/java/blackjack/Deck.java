package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck implements IDeck {
    private ArrayList<Card> deckOfCards;
    private ArrayList<String> ranks;
    private ArrayList<String> suits;

    public Deck() {
        this.ranks = new ArrayList<String>();
        ranks.add("Two");
        ranks.add("Three");
        ranks.add("Four");
        ranks.add("Five");
        ranks.add("Six");
        ranks.add("Seven");
        ranks.add("Eight");
        ranks.add("Nine");
        ranks.add("Ten");
        ranks.add("Jack");
        ranks.add("Queen");
        ranks.add("King");
        ranks.add("Ace");

        this.suits = new ArrayList<String>();
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Spades");
        suits.add("Clubs");

        this.deckOfCards = new ArrayList<Card>();
        for (String rank : ranks) {
            for (String suit : suits) {
                deckOfCards.add(new Card(rank, suit));

            }

        }

    }

    public Card deal() {
        if (deckOfCards.size() > 0) {
            Card card = deckOfCards.remove(deckOfCards.size() - 1);
            return card;
        }
        return null;

    }

    public void shuffle() {

        Collections.shuffle(this.deckOfCards);

    }

    public int getSize() {

        return this.deckOfCards.size();
    }

    public int getDeckSuits(String suit) {
        int newVar = 0;
        for (Card newObj : this.deckOfCards) {
            if (newObj.getSuit(suit).equals(suit)) {
                newVar++;
            }
        }
        return newVar;
    }

    public int getDeckRanks(String rank) {

        int newVar = 0;

        for (Card newObj : this.deckOfCards) {
            if (newObj.getRank(rank).equals(rank)) {
                newVar++;
            }
        }
        return newVar;
    }
}
