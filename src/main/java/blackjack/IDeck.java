package blackjack;

public interface IDeck {
    

    void shuffle();
    Card deal();
    int getSize();
}
