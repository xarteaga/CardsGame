package edu.upc.eetac.dxat.cards;

import javax.swing.text.NumberFormatter;

public class SpanishDeck extends Deck {

	public SpanishDeck() {
		super(48);
		// TODO Auto-generated constructor stub
	}

	@Override
	void initDeck(int numCards) {
		// TODO Auto-generated method stub
		for (int i=0; i<numCards; i++){
			super.cards[i] = new SpanishCard(i);
		}
	}

	@Override
	public void recycleDiscard() {
		// TODO Auto-generated method stub
		
	}

}
