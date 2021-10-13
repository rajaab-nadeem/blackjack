package blackjack;

public class checkForWinner implements ICheckForWinner{


    public void checkIfWinner(ITotalHandValues THValue, IHand dealer, IHand player){


        if(THValue.totalhandvalues(dealer)==21 && THValue.totalhandvalues(player)==21 ){
            System.out.println("It is a TIE");



        }

        else if(THValue.totalhandvalues(player)==21){
            System.out.println(player.getName() + " Wins!!!");



        }
        else if(THValue.totalhandvalues(player)>21){
            System.out.println(player.getName() + " Busted!!!");



        }

        else if(THValue.totalhandvalues(dealer)>21){
            System.out.println("Dealer" + " Busted!!!");



        }

        else if(THValue.totalhandvalues(dealer)==21) {
            System.out.println("Dealer" + " Wins!!!");


        }


        else if(THValue.totalhandvalues(dealer)==THValue.totalhandvalues(player) ){
            System.out.println("It is a TIE");



        }

        else if(THValue.totalhandvalues(dealer)>THValue.totalhandvalues(player) ){
            System.out.println("Dealer Wins!!");



        }

        else if(THValue.totalhandvalues(dealer)<THValue.totalhandvalues(player) ){
            System.out.println(player.getName() + "Wins!!");



        }





    }

}
