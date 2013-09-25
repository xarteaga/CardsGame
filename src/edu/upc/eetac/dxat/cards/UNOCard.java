package edu.upc.eetac.dxat.cards;

public class UNOCard extends Card {
	public static final String [] NUMBERS = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
		"SKIP", "REVERSE", "+2", "+0", "+4"};
	
	public static final String [] SUITES = {"RED", "GREEN", "BLUE", "YELLOW", "WILD"};
	
	public UNOCard(int id) {
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
		return SUITES[super.getId()/NUMBERS.length];
	}

}
