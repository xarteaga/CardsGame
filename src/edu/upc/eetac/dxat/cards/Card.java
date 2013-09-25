package edu.upc.eetac.dxat.cards;

public abstract class Card implements Comparable<Card> {
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

	public int compareTo(Card card) {
		int c = this.getSuit().compareTo(card.getSuit());

		if (c == 0) {
			return this.getNumber().compareTo(card.getNumber());
		}
		return c;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNumber() + " " + getSuit();
	}

}
