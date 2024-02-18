package com.promineo;

import java.util.*;




public class Player {
	private List<Card> hand;
	private int score;
	private String name;
	
	// A constructor for our player 
	public Player(String name) {
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
	}
	
	
	// The method that describes the player along with the their hand and score
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand: ");
		for (Card card : hand) {  // For every card object it will add that to the players hand
			card.describe();
		}
	}
	
	// This method flips the players top card
	public Card flip() {
		if (!hand.isEmpty()) {	
			return hand.remove(0);	// Removes the top card of the hand
		}
		return null;	// Null is returned once the hand is empty
	}
		
	// This is our method for drawing a card and adding it to the player's hand
	public void draw(Deck deck) {
		Card drawnCard = deck.dealCard();
		if (drawnCard != null) {  // This will check if the drawing a card returns null which would imply the deck is empty
			hand.add(drawnCard); // If the check is not null it adds it to our hand
		}
	}
	
	// The method to increase the score for the player by one 
	public void incrementScore() {
		score++;
	}
}
