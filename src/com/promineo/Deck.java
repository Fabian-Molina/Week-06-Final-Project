package com.promineo;

import java.util.*;


public class Deck {
	private List<Card> cards;
	
	// initializes our deck of cards
	public Deck() {
		this.cards = new ArrayList<>();
		initializeDeck();
	}
	
	// Storing the values and the suits that are possible to be drawn
	private void initializeDeck() {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		
		// Our method for that creates our deck of cards
		for (String suit: suits) { 				// This line iterates over the suits array
			for (int value = 2; value <= 14; value++) {  	// Since we need the value to start at 2, this line iterates from 2 to 14
				String name = names[value - 2] + " of " + suit;		// This allows our code to combine the value and the suit so we can display the name of our cards
				Card card = new Card(value, name);		// Creates a new card with the value and suit we just generated previously
				cards.add(card);	// Finally we add the card to a new list so we can use them in our main class
			}
		}
	}
	
	// This method allows us to shuffle and randomize our deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Deals a card from the deck 
	public Card dealCard() {
		if (cards.isEmpty()) {
			return null;	// We deal until the deck is empty and then it will stop running our method
		}
		
		return cards.remove(0); // After dealing a card that card is now removed from the deck so we don't have any repeats
	}
	
	// After dealing the program checks if the deck is empty and will do so until it finally is empty
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	
	
	
}