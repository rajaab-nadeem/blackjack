package blackjack;

import org.junit.Test;
import static org.junit.Assert.*;

public class BetTest {

    @Test
    public void get100Chips() {

        // Given I am a player

        IHand hand = new Hand("Rajaab");

        // When I am playing the game

        int chips = hand.getChips();

        // Then I have 100 chips

        assertEquals(100, chips);

    }

    @Test
    public void checkBet() {

        // Given: I am a player with 100 chips

        IHand hand = new Hand("Rajaab");
        IBet bet = new Bet(hand);

        // When: I am asked how many chips I would like to bet
        // And: I enter 110 chips

        String response = bet.makeBet(110);

        // Then: I am not allowed to make the wager
        assertEquals("Not enough money", response);
    }

    @Test
    public void loseBet() {

        // Given I have 100 and played a game waging 10 chip
        IHand hand = new Hand("Rajaab");
        IBet bet = new Bet(hand);
        bet.makeBet(10);

        // When I lose

        bet.loseBet();

        // Then I have 90 chips left

        assertEquals(90, hand.getChips());

    }

    @Test
    public void winBet() {

        // Given I have 100 chips and played a game waging 50 chips
        IHand hand = new Hand("Rajaab");
        IBet bet = new Bet(hand);
        bet.makeBet(50);

        // When I win

        bet.winBet();

        // Then I have 150 chips
        assertEquals(150, hand.getChips());

    }

    @Test
    public void naturalTest() {

        // Given I have 100 chips and played a game waging 40 chips
        IHand hand = new Hand("Rajaab");
        IBet bet = new Bet(hand);
        bet.makeBet(40);

        // When I have naturals
        bet.naturalBet();
        // Then I have 120 chips
        assertEquals(120, hand.getChips());

    }

    @Test
    public void checkNoMoney() {

        // Given I have 100 chips and played a game betting 100 chips
        // When I have lost
        // Then I exit the game

    }
}
