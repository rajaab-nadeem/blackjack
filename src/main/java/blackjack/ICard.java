package blackjack;

public interface ICard {

    String showCard();
    int getValue();
    void setValue(int value);
    String getRank();
}
