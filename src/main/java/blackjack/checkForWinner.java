package blackjack;

public class checkForWinner implements ICheckForWinner{


    public void checkIfWinner(ITotalHandValues THValue, IHand dealer, IHand player){
        if(THValue.totalhandvalues(player)==21){
            System.out.println(player.getName() + " WON!!!");


        }
        if(THValue.totalhandvalues(player)>21){
            System.out.println(player.getName() + "Busted!!!");


        }


    }

}
