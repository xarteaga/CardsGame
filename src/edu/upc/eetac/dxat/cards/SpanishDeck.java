package edu.upc.eetac.dxat.cards;

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
		// Return the discard pile into the available cards pile
		while (super.discardPtr > 0) {
			super.dealPtr++;
			super.discardPtr--;
			super.cards[super.dealPtr] = super.discard[super.discardPtr];
		}

		// Shuffle deck with the discard pile
		super.shuffle();		
	}

}
