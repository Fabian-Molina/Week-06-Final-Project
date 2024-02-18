package com.promineo;


public class App {
	public static void main(String[] args) {
		
		// Instantiate the deck and then shuffle so we can get random cards
		Deck deck = new Deck();
		deck.shuffle();
		
		// Instantiate two players so we can have a comparison of scores
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		// This loop iterates through the deck and makes each player draw out of the deck
		for (int i = 0; i < 52; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		// These variables are for storing the score and both players start at 0
		int player1Score = 0;
		int player2Score = 0;
		
		// Now we iterate through each players hands which is half of the deck size and flips the top card
		for (int i = 0; i < 26; i++) {
			Card hand1 = player1.flip();
			Card hand2 = player2.flip();
			
			// We use an if else loop to compare each cards value to each other.
			if (hand1.getValue() > hand2.getValue()) {	// If player 1 has a higher value card they get a point
				player1.incrementScore();
				player1Score++;
				
			} else if (hand1.getValue() < hand2.getValue()) {	// If player 2 has a higher value card then they get a point
				player2.incrementScore();
				player2Score++;
				
			} else if (hand1.getValue() == hand2.getValue()){	// If the cards are the same value then there is a draw and neither player is given a point
				System.out.println("Draw: no points awarded");
				
			}
		}
		
		// Displays each player's final score total
		System.out.println("Player 1: " + player1Score);
		System.out.println("Player 2: " + player2Score);
		
		// Another if else loop that compares the final score and declares the winner. If there is a draw then there is no winner.
		if (player1Score > player2Score) {
			System.out.println("Player 1 wins! Final score: " + player1Score);
			
		} else if (player1Score < player2Score) {
			System.out.println("Player 2 wins! Final score: " + player2Score);
			
		} else if (player1Score == player2Score) {
			System.out.println("Draw! " + " " + "Player 1 final score: "+ player1Score + " " + "Player 2 final score: " + player2Score);
			
		}
		
	}
}
