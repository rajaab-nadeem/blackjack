package blackjack;

import java.util.Hashtable;

public interface ITotalHandValues {

    int totalhandvalues(IHand hand);
    Hashtable<String, Integer> getValues();

}
