package edu.upc.eetac.dxat.cards.test;

import edu.upc.eetac.dxat.cards.*;

public class TestCard {

	public static void main(String[] args) {

		// Show welcome
		System.out.println("Welcome to DXAT card game...");
		System.out.println("----------------------------------------------");

		String[] names = {"Alex","Jesus", "Gerard", "Marti", "Xavier"};
		
		Engine myEngine = new UNOEngine (names);
		System.out.println(myEngine.toString());
		
		Deck spanishDeck = new SpanishDeck();
		Deck frenchDeck = new FrenchDeck();
		
		System.out.println(spanishDeck.toString());
		System.out.println(frenchDeck.toString());
		
	}
}
