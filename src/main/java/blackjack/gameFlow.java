package blackjack;

public class gameFlow implements IGameFlow  {
        private IDeck deck;
        private IBlackJackLogic blackJackLogic;
        private IHand hand;

        public gameFlow (IDeck deck, IBlackJackLogic blackJackLogic, IHand hand){
            this.deck = deck;
            this.blackJackLogic = blackJackLogic;
            this.hand = hand;
        }

        public Boolean playGame(){
            blackJackLogic.startingMove();

            return true;
        }



}
