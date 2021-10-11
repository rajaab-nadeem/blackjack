package blackjack;

public interface IHand {

    void addCard(Card card);
    int getValue();
    void setValue(int value);
    int getSize();
}
