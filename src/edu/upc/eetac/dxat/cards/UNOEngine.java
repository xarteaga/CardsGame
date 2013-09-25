package edu.upc.eetac.dxat.cards;

public class UNOEngine extends Engine {

	public UNOEngine(String[] names) {
		super(names);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initDeck() {
		super.deck = new UNODeck();
		super.deck.shuffle();
	}

	@Override
	public void initPlayers(String[] names) {
		for (int i = 0; i < names.length; i++) {
			super.players[i] = new Player(names[i]);
			super.players[i].giveCards(deck.deal(7));
			super.players[i].sortHand();
		}
	}

}
