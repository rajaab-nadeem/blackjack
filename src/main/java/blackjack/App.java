package blackjack;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = input.nextLine();;
        IHand dealer = new Hand("Dealer");
        IHand player = new Hand(name);
        IDeck deck = new Deck();
        IShowHands showhands = new ShowHands();
        IFirstMove firstmove= new FirstMove(deck,dealer,player);
        firstmove.startingMove();
        showhands.showCards(player,dealer);





//   System.out.println(game1.checkingHandValues(player));
//


    }
}
