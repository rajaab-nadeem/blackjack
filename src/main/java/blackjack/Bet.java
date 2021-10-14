package blackjack;

public class Bet implements IBet {

    private int bet;
    private IHand hand;

    public Bet(IHand hand) {
        this.bet = 0;
        this.hand = hand;
    }

    public int getBet() {
        return this.bet;
    }

    public String makeBet(int chips) {
        if (chips > hand.getChips()) {
            return "Not enough money";
        }
        bet = chips;
        return "Bet placed";
    }

    public void loseBet() {
        hand.setChips(0 - (bet));

    }

    public void winBet() {
        hand.setChips(bet);

    }

    public void naturalBet() {
        hand.setChips(Math.abs((bet / 2)));
    }
}
