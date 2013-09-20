package src.edu.upc.eetac.dxat.cards.CardsGame;

public class SpanishCard extends Card {
	public final static String [] NUMBERS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	public final static String [] SUITS = {"Oros", "Bastos", "Copas", "Espadas"};
	
	public SpanishCard(int id) {
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
