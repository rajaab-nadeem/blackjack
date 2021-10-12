package blackjack;

import java.util.ArrayList;

public interface IHand {

    void addCard(ICard card);
    int getValue();
    void setValue(int value);
    int getSize();
    ArrayList<ICard> getHandOfCards();
    String getName();
}
