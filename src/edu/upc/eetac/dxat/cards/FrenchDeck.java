package edu.upc.eetac.dxat.cards;

public class FrenchDeck extends Deck {

	public FrenchDeck() {
		super(52);
		// TODO Auto-generated constructor stub
	}

	@Override
	void initDeck(int numCards) {
		// TODO Auto-generated method stub
		for (int i=0; i<numCards; i++){
			super.cards[i] = new FrenchCard(i);
		}
	}

	@Override
	public void recycleDiscard() {
		// TODO Auto-generated method stub
		
	}

}
