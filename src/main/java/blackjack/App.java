package blackjack;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

   IHand dealer= new Hand("dealer");
   IHand player= new Hand("Roberto");
   IDeck deck = new Deck();
   IBlackJackLogic game1 = new BlackJackLogic(deck,dealer,player);
   game1.startingMove();

   System.out.println(game1.checkingHandValues(player));







    }

}
