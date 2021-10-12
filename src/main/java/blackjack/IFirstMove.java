package blackjack;

import java.util.Hashtable;

public interface IFirstMove {

    // int checkingForValues(Hand hand);

    void startingMove();

    int checkingHandValues(IHand hand);

    // Hashtable<String, Integer> getValues();
}
