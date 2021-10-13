package blackjack;

public interface ICheckForWinner {

    Boolean checkIfWinner(ITotalHandValues THValue,IHand hand, IHand player);
}
