package blackjack;

public class checkForWinner implements ICheckForWinner{


    public void checkIfWinner(ITotalHandValues THValue, IHand dealer, IHand player){


        if(THValue.totalhandvalues(dealer)==21 && THValue.totalhandvalues(player)==21 ){
            System.out.println("It is a TIE");


        }

        if(THValue.totalhandvalues(player)==21){
            System.out.println(player.getName() + " Wins!!!");


        }
        if(THValue.totalhandvalues(player)>21){
            System.out.println(player.getName() + "Busted!!!");


        }

        if(THValue.totalhandvalues(dealer)>21){
            System.out.println("Dealer" + "Busted!!!");


        }

        if(THValue.totalhandvalues(dealer)==21) {
            System.out.println("Dealer" + " Wins!!!");

        }


        if(THValue.totalhandvalues(dealer)==THValue.totalhandvalues(player) ){
            System.out.println("It is a TIE");


        }

        if(THValue.totalhandvalues(dealer)>THValue.totalhandvalues(player) ){
            System.out.println("Dealer Wins!!");


        }

        if(THValue.totalhandvalues(dealer)<THValue.totalhandvalues(player) ){
            System.out.println(player.getName() + "Wins!!");


        }





    }

}
