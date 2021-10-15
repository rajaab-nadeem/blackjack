package blackjack;

public class checkForWinner implements ICheckForWinner{


    public Boolean checkIfWinner(int dealer, int player, IHand player1,IBet betplayer){


        if(dealer==21 && player==21 ){
            System.out.println("It is a TIE");
            return false;



        }

        if(player==21){
            System.out.println(player1.getName() + " Wins!!!");
            betplayer.winBet();
            return false;



        }
        if(player>21){
            System.out.println(player1.getName() + " Busted!!!");
            betplayer.loseBet();
            return false;



        }

        if(dealer>21){
            System.out.println("Dealer" + " Busted!!!");
            betplayer.winBet();
            return false;



        }

        if(dealer==21) {
            System.out.println("Dealer" + " Wins!!!");
            betplayer.loseBet();
            return false;


        }


        if(dealer==player){
            System.out.println("It is a TIE");
            return false;



        }

        if(dealer>player ){
            System.out.println("Dealer Wins!!");
            betplayer.loseBet();
            return false;



        }

        if(dealer<player ){
            System.out.println(player1.getName() + " Wins!!");
            betplayer.winBet();
            return false;



        }
        else{
            return false;
        }





    }

}
