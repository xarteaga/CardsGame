package src.edu.upc.eetac.dxat.cards.CardsGame;

public abstract class Card {
	private int id;

	public Card(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public abstract String getNumber();

	public abstract String getSuit();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNumber() + " " + getSuit();
	}

}
