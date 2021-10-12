package blackjack;

import java.util.Hashtable;

public interface IBlackJackLogic {

    void startingMove();
    void hit();
    void stand();
    void aceAdjustment(IHand hand);
    boolean checkingIfWinner();
    int checkingHandValues(IHand hand);
    Hashtable<String, Integer> getValues();
}
