package edu.upc.eetac.dxat.cards;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
	private String name;
	private ArrayList<Card> hand;

	public Player(String name) {
		super();
		this.name = name;
		this.hand = new ArrayList<Card>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void sortHand (){
		Collections.sort(hand);
	}
	
	public void giveCard(Card card) {
		// TODO Auto-generated method stub
		this.hand.add(card);
	}

	public void giveCards(Card[] cards) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cards.length; i++) {
			this.giveCard(cards[i]);
		}
	}

	public Card pickCard(int index) {
		return this.hand.remove(index);
	}

	public Card[] pickCards(int[] index) {
		// TODO Auto-generated method stub
		Card[] cards = new Card[index.length];

		for (int i = 0; i < index.length; i++) {
			cards[i] = this.pickCard(index[i]);
		}

		return cards;

	}

	public Card stealRandCard() {
		// TODO Auto-generated method stub
		return this.pickCard((int) (Math.random() * hand.size()));
	}

	public Card[] stealRandCards(int n) {
		// TODO Auto-generated method stub
		Card[] cards = new Card[n];

		for (int i = 0; i < n; i++) {
			cards[i] = this.stealRandCard();
		}

		return cards;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", hand=" + hand + "]";
	}

	
	
}
