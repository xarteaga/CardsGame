package edu.upc.eetac.dxat.cards.test;

import edu.upc.eetac.dxat.cards.*;

public class TestUNODeck {

	public static void main(String[] args) {
		Deck myDeck = new UNODeck();

		System.out.println("Testing UNO deck...");
		System.out.println("-----------------------------------------");
		System.out.println("Without sort:");
		System.out.println(myDeck.toString());

		myDeck.shuffle();
		System.out.println("Shuffled:");
		System.out.println(myDeck.toString());
	}

}
