package blackjack;

import java.util.Hashtable;

public interface IBlackJackLogic {

    public void startingMove();
    public void hit();
    public void stand();
    public void aceAdjustment();
    public boolean checkingIfWinner();
    int checkingForValues(Hand hand);
    Hashtable<String, Integer> getValues();
}
