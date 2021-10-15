package blackjack;

public interface ICheckForWinner {

    Boolean checkIfWinner(int dealer, int player, IHand player1,IBet betplayer);
}
