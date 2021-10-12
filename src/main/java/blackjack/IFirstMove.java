package blackjack;

import java.util.Hashtable;

public interface IFirstMove {

    public void startingMove();

    public boolean checkingIfWinner();

    // int checkingForValues(Hand hand);

    Hashtable<String, Integer> getValues();
}
