package blackjack;

import java.util.Hashtable;

public interface IFirstMove {

    void startingMove();
    int checkingHandValues(IHand hand);
    Hashtable<String, Integer> getValues();
}
