**PreGame**

- Given: When there is a user
- When: The game is started
- Then: A deck of 52 cards is created

---

- Given: There is a a deck of 52 cards
- When: The game is started
- Then: The order of cards is randomized/shuffled

---

- Given: There is a deck of cards
- When: The game is started
- Then: The deck will have 4 of a kind per card

- Given: There is a card
- When: It's a 7 of Hearts
- Then: The value this card holds is 7

---
--------

**Dealing**

- Given: I am a user
- When: A card is dealt to me
- Then: My hand will have 1 card

- Given: There is a dealer
- When: A card is dealt to them?
- Then: The dealer's hand will have 1 card

- Given: There is a deck of 52 cards
- When: One "round" of dealing cards is over
- Then: There are 51 cards left in the deck

- Given: The user's hand has a 7 and a 2
- When: The user holds
- Then: The value of the cards in the user's "hand" is 9

- Given: The user has 2 cards in their hand
- When: The user asks to hit again
- Then: The user will now have 3 cards in their hands

- Given: The user's hand has a value of 9
- When: The user asks to hit
- And: Is dealt a 5
- Then: The value of the user's hand is 14

- Given: The user's hand has a value of 9
- When: The user asks to hold
- Then: The value of the user's hand remains 9

- Given: The user has 5 cards in their hand
- When: The value of these cards does not exceed 21
- Then: The user has won the game

- Given: The user has cards in their hand
- When: The value of these cards adds up to 21
- Then: The user has won the game

- Given: The dealer has cards in their hand
- When: The value of these cards is below 17
- Then: The dealer is obliged to "hit" again

- Given: The dealer has cards in their hand
- When: The value of these cards is 17 or above
- Then: The user is obliged to "hold"

- Given: The user and dealer both have cards in their hand
- When: The value of the dealer's card is higher than the value of the user's hand
- And: The user has elected to hold
- Then: The dealer has won

- Given: The user and dealer both have cards in their hand
- When: The value of the user's card is higher than the value of the dealer's hand
- And: The dealer has elected to hold
- Then: The user has won

- Given: A player has a hand of cards
- When: The value of that hand is >21
- Then: The player has lost

