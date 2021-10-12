package blackjack;

public class gameFlow implements IGameFlow  {
        private IDeck deck;
        private IBlackJackLogic blackJackLogic;
        private IHand handDealer;
        private IHand handPlayer;

        public gameFlow (IDeck deck, IBlackJackLogic blackJackLogic, IHand handDealer, IHand handPlayer){
            this.deck = deck;
            this.blackJackLogic = blackJackLogic;
            this.handDealer = handDealer;
            this.handPlayer = handPlayer;
        }

        public Boolean playGame(){
            deck.shuffle();
            blackJackLogic.startingMove();

            return true;
        }



}
