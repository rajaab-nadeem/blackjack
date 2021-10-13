package blackjack;

import java.util.Scanner;

public class gameFlow implements IGameFlow {
    private IDeck deck;
    private IFirstMove firstMove;
    private IHand handDealer;
    private IHand handPlayer;
    private ITotalHandValues THValues;
    private IHit hit;
    private IStay stay;
    private IShowHands showhands;
    private ICheckForWinner checkforwinners;


    public gameFlow(IFirstMove firstMove,IDeck deck,  IHand handDealer, IHand handPlayer, ITotalHandValues THValues,IHit hit,IStay stay,IShowHands showhands,ICheckForWinner checkforwinners) {

        this.firstMove = firstMove;
        this.deck = deck;
        this.handDealer = handDealer;
        this.handPlayer = handPlayer;
        this.THValues=THValues;
        this.hit=hit;
        this.stay=stay;
        this.showhands=showhands;
        this.checkforwinners=checkforwinners;


    }

    public void playGame() {
        boolean gameIsOn=true;
        firstMove.startingMove();
        while(gameIsOn){
            showhands.showCards(handPlayer,handDealer);
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to Hit-(H) or Stand-(S)");
            String play = input.nextLine();
            if(play.toLowerCase().equals("h")){
                this.hit.hit(handPlayer,deck);
                this.THValues.totalhandvalues(handPlayer);
                this.checkforwinners.checkIfWinner(THValues,handDealer,handPlayer);
                this.showhands.showCards(handPlayer,handDealer);
            }
            else if(play.toLowerCase().equals("s")){
                this.stay.stay(handDealer,deck);
                this.THValues.totalhandvalues(handDealer);
                this.checkforwinners.checkIfWinner(THValues,handDealer,handPlayer);
                this.showhands.showCards(handPlayer,handDealer);

            }


        }

    }

}
