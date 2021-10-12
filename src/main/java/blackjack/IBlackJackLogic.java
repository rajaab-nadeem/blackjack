package blackjack;

import java.util.Hashtable;

public interface IBlackJackLogic {

    void startingMove();
    void hit();
    void stand();
    boolean checkingIfWinner();
    int checkingHandValues(IHand hand);
    Hashtable<String, Integer> getValues();
}
