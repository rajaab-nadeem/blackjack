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
    private IContinuePlay cplay;
    private IBet playerbet;
    public gameFlow(IFirstMove firstMove, IDeck deck, IHand handDealer, IHand handPlayer, ITotalHandValues THValues, IHit hit, IStay stay, IShowHands showhands, ICheckForWinner checkforwinners, IContinuePlay cplay,IBet playerbet) {
        this.firstMove = firstMove;this.deck = deck;this.handDealer = handDealer;this.handPlayer = handPlayer;this.THValues = THValues;this.hit = hit;this.stay = stay;this.showhands = showhands;this.checkforwinners = checkforwinners;this.cplay =cplay;this.playerbet=playerbet;}

    public void playGame() {
        boolean gameIsOn2 = true;


        while (gameIsOn2){

            handPlayer.getHandOfCards().clear();
            handDealer.getHandOfCards().clear();
            handPlayer.setValue(0);
            handDealer.setValue(0);
            Scanner betq = new Scanner(System.in);
            System.out.println(handPlayer.getName()+ " You have "+ handPlayer.getChips()+ ". Chips" + " How many Chips do you want to bet? : ");
            Integer betqq = betq.nextInt();
            playerbet.makeBet(betqq);
            firstMove.startingMove();
            showhands.showCards(handPlayer, handDealer);
            boolean gameIsOn = true;
        while (gameIsOn) {
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to Hit-(H) or Stand-(S)");
            String play = input.nextLine();
            if (play.equals("h")) {
                hit.hit(handPlayer, deck);
                showhands.showCards(handPlayer, handDealer);
            }
            if (play.equals("s")) {
                stay.stay(handDealer, deck);
                showhands.showCards(handPlayer, handDealer);
                int playerHandValues = THValues.totalhandvalues(handPlayer);
                int dealerHandValues = handDealer.getValue();
                System.out.println(handPlayer.getName() + "-" + handPlayer.getValue());
                System.out.println("Dealer" + "-" + handDealer.getValue());


                gameIsOn = checkforwinners.checkIfWinner(dealerHandValues, playerHandValues,handPlayer,playerbet);
            }

        }
            gameIsOn2 = cplay.play(handPlayer);


        }
    }
}
