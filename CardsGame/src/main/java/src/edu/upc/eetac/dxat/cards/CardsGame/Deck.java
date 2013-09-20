package src.edu.upc.eetac.dxat.cards.CardsGame;

/**
 * @author Xavier Arteaga
 * 
 */
public abstract class Deck {
	protected Card cards[];
	protected Card discard[];

	protected int dealPtr;
	protected int discardPtr;

	/* Constructor */
	public Deck(int numCards) {
		this.dealPtr = numCards - 1;
		this.discardPtr = 0;

		// Create cards and discart piles arrays
		this.cards = new Card[numCards];
		this.discard = new Card[numCards];

		this.initDeck(numCards);
	}

	/* Initialize deck */
	abstract void initDeck(int numCards);

	/* Recycle the discarded cards */
	abstract public void recycleDiscard();

	/* Deal card of the deck */
	public Card deal() {
		/* Check if the Deck is empty */
		if (this.dealPtr < 0) {
			/* Check if there are cards in the discard pile */
			if (this.discardPtr > 0) {
				/* Recycle discard pile */
				this.recycleDiscard();
			} else {
				/* Return null as consequence of no cards available */
				return null;
			}
		}

		Card card = this.cards[this.dealPtr];
		this.dealPtr--;

		return card;
	}

	/* Deal n cards */
	public Card[] deal(int n) {
		Card cards[] = new Card[n];

		for (int i = 0; i < n; i++)
			cards[i] = this.deal();

		return cards;
	}

	/* Discard one card */
	public void discard(Card card) {
		this.discard[this.discardPtr] = card;
		this.discardPtr++;
	}

	/* Discard N cards */
	public void discard(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			this.discard[this.discardPtr] = cards[i];
			this.discardPtr++;
		}
	}

	/* Shuffle the cards available in the deck */
	public void shuffle() {
		int N = this.dealPtr + 1;
		// shuffle
		for (int i = 0; i < N; i++) {
			// Integer from remainder of deck
			int r = i + (int) (Math.random() * (N - i));
			Card swap = this.cards[r];
			this.cards[r] = this.cards[i];
			this.cards[i] = swap;
		}
	}
	
	@Override
	public String toString (){
		String str = "";
	
		str = str + "Available in pile: ";
		for (int i = 0; i < this.dealPtr+1; i++){
			str = str + this.cards[i].toString() + "; ";
		}
		
		str = str + "\n\nIn discard pile: ";
		for (int i = 0; i < this.discardPtr; i++){
			str = str + this.discard[i].toString() + "; ";
		}
		
		str = str + "\n";
		
		return str;
	}
}
