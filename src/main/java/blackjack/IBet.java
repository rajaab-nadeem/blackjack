package blackjack;

public interface IBet {

    int getBet();

    String makeBet(int chips);

    void loseBet();

    void winBet();

    void naturalBet();

}
