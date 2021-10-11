package blackjack;

public interface IBlackJackLogic {

    public void startingMove();
    public void hit();
    public void stand();
    public void aceAdjustment();
    public boolean checkingIfWinner();
}
