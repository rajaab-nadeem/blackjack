package blackjack;

import java.util.Hashtable;

public interface IBlackJackLogic {

    void startingMove();
    void hit();
    void stand();
    void aceAdjustment(Hand hand);
    boolean checkingIfWinner();
    int checkingHandValues(Hand hand);
    Hashtable<String, Integer> getValues();
}
