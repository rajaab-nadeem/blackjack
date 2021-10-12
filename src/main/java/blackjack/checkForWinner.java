package blackjack;

public class checkForWinner implements ICheckForWinner{


    public void checkIfWinner(ITotalHandValues THValue, IHand dealer, IHand player){
        if(THValue.totalhandvalues(player)==21){
            System.out.println(player.getName() + " WON!!!");


        }
        else if(THValue.totalhandvalues(dealer)<21 && THValue.totalhandvalues(dealer)>=17){

        }

    }

}
