package edu.upc.eetac.dxat.cards;

public class FrenchCard extends Card{
	public final static String [] NUMBERS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	public final static String [] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	public FrenchCard(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNumber() {
		// TODO Auto-generated method stub
		return NUMBERS[super.getId()%NUMBERS.length];
	}

	@Override
	public String getSuit() {
		// TODO Auto-generated method stub
		return SUITS[super.getId()/NUMBERS.length];
	}

}
