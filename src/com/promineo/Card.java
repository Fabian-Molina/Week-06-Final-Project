package com.promineo;



public class Card {
	private int value;
	private String name;
	
	
	// This is our Constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	// Our Getters and Setters listed below for the card values and the suits as well
	public int getValue() {
		return value;
	}
	
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	// We use describe to give us the info about the card
	public void describe() {
		System.out.println(name);
	}		
}