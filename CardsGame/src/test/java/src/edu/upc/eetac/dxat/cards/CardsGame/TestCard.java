package src.edu.upc.eetac.dxat.cards.CardsGame;

import src.edu.upc.eetac.dxat.cards.*;

public class TestCard {

	public static void main(String[] args) {
		
		// Show welcome
		System.out.println("Welcome to DXAT card game...");
		System.out.println("----------------------------------------------");
		
		Deck myDeck = new UNODeck();
		Card myCard = null;
		Boolean finished = false;

		myDeck.shuffle();
		System.out.println(myDeck.toString());
		
		while (!finished) {
			myCard = myDeck.deal();

			if (myCard != null) {
				System.out.print(myCard.toString()+"; ");
			} else {
				finished = true;
			}
		}
	}
}
