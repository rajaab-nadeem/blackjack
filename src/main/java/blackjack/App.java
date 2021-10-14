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
        String name = input.nextLine();
        IHand dealer = new Hand("Dealer");
        IHand player = new Hand(name);
        IContinuePlay play = new ContinuePlay();
        IDeck deck = new Deck();
        IShowHands showhands = new ShowHands();
        IFirstMove firstmove= new FirstMove(deck,dealer,player);
        ITotalHandValues THValues =new TotalHandValues();
        IHit hit = new Hit();
        IStay stay = new Stay();
        ICheckForWinner checkforwinner = new checkForWinner();
        IGameFlow BlackJackGame = new gameFlow(firstmove,deck,dealer,player,THValues,hit,stay,showhands,checkforwinner,play);
        BlackJackGame.playGame();






//   System.out.println(game1.checkingHandValues(player));
//


    }
}
