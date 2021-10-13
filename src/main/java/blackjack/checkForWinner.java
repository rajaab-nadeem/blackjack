package blackjack;

public class checkForWinner implements ICheckForWinner{


    public Boolean checkIfWinner(int dealer, int player, IHand player1){


        if(dealer==21 && player==21 ){
            System.out.println("It is a TIE");
            return false;



        }

        else if(player==21){
            System.out.println(player1.getName() + " Wins!!!");
            return false;



        }
        else if(player>21){
            System.out.println(player1.getName() + " Busted!!!");
            return false;



        }

        else if(dealer>21){
            System.out.println("Dealer" + " Busted!!!");
            return false;



        }

        else if(dealer==21) {
            System.out.println("Dealer" + " Wins!!!");
            return false;


        }


        else if(dealer==player){
            System.out.println("It is a TIE");
            return false;



        }

        else if(dealer>player ){
            System.out.println("Dealer Wins!!");
            return false;



        }

        else if(dealer<player ){
            System.out.println(player1.getName() + "Wins!!");
            return false;



        }
        else{
            return true;
        }





    }

}
