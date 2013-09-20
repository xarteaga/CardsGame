package src.edu.upc.eetac.dxat.cards.CardsGame;

public class UNODeck extends Deck {

	public UNODeck() {
		super(104);
	}

	@Override
	void initDeck(int numCards) {
	
		// Create the game cards
		int k = 0; // Card counter

		// Generate Colour cards
		for (int i = 0; i < 12 * 4; i++) {
			super.cards[k + 0] = new UNOCard(i);
			super.cards[k + 1] = new UNOCard(i);
			k += 2;
		}

		// Generate other cards
		for (int i = 0; i < 4; i++) {
			super.cards[k + 0] = new UNOCard(12 * 4);
			super.cards[k + 1] = new UNOCard(13 * 4);
			k += 2;
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
