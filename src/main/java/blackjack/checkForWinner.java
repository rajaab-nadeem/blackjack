package blackjack;

public class checkForWinner implements ICheckForWinner{


    public Boolean checkIfWinner(ITotalHandValues THValue, IHand dealer, IHand player){


        if(THValue.totalhandvalues(dealer)==21 && THValue.totalhandvalues(player)==21 ){
            System.out.println("It is a TIE");
            return false;



        }

        else if(THValue.totalhandvalues(player)==21){
            System.out.println(player.getName() + " Wins!!!");
            return false;



        }
        else if(THValue.totalhandvalues(player)>21){
            System.out.println(player.getName() + " Busted!!!");
            return false;



        }

        else if(THValue.totalhandvalues(dealer)>21){
            System.out.println("Dealer" + " Busted!!!");
            return false;



        }

        else if(THValue.totalhandvalues(dealer)==21) {
            System.out.println("Dealer" + " Wins!!!");
            return false;


        }


        else if(THValue.totalhandvalues(dealer)==THValue.totalhandvalues(player) ){
            System.out.println("It is a TIE");
            return false;



        }

        if(THValue.totalhandvalues(dealer)>THValue.totalhandvalues(player) ){
            System.out.println("Dealer Wins!!");
            return false;



        }

        else if(THValue.totalhandvalues(dealer)<THValue.totalhandvalues(player) ){
            System.out.println(player.getName() + "Wins!!");
            return false;



        }
        else{
            return true;
        }





    }

}
