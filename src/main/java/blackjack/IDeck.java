package blackjack;

public interface IDeck {

    void shuffle();

    Card deal();

    int getSize();

    int getDeckRanks(String rank);

    int getDeckSuits(String suit);
}
