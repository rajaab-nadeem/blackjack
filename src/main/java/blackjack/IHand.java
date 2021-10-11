package blackjack;

import java.util.ArrayList;

public interface IHand {

    void addCard(Card card);
    int getValue();
    void setValue(int value);
    int getSize();
    ArrayList<Card> getHandOfCards();
    String getName();
}
