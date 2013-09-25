package edu.upc.eetac.dxat.cards.test;

import edu.upc.eetac.dxat.cards.*;

public class TestFrenchDeck {

	public static void main(String[] args) {
		Deck myDeck = new FrenchDeck();
		
		System.out.println("Testing French deck...");
		System.out.println("-----------------------------------------");
		System.out.println("Without sort:");
		System.out.println(myDeck.toString());
		
		myDeck.shuffle();
		System.out.println("Shuffled:");
		System.out.println(myDeck.toString());
	}

}
