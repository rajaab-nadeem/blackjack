package blackjack;

import java.util.Scanner;

public class ContinuePlay implements IContinuePlay {

     public Boolean play(IHand hand){

        if (hand.getChips() ==0 ){
            System.out.println("You ran out of money! Better Luck next time!");
            return false;
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to play again? y/n");
            String play = input.nextLine();
            if (play.equals("y")){
                return true;
            }
            return false;
        }
    }


}
