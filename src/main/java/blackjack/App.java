package blackjack;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){



        ArrayList<String> suits=new ArrayList<String>();
        suits.add("Two");
        suits.add("Three");
        suits.add("Four");
        suits.add("Five");
        suits.add("Six");
        suits.add("Seven");
        suits.add("Eight");
        suits.add("Nine");
        suits.add("Ten");
        suits.add("Jack");
        suits.add("Queen");
        suits.add("King");
        suits.add("Ace");

        ArrayList<String> ranks=new ArrayList<String>();
        ranks.add("Hearts");
        ranks.add("Diamonds");
        ranks.add("Spades");
        ranks.add("Clubs");

        IDeck deck = new Deck(suits,ranks);
        ICard card = new Card("Two","Heart");
        System.out.println(card.getRank());





    }

}
