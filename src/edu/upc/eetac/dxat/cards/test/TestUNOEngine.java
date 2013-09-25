package edu.upc.eetac.dxat.cards.test;

import edu.upc.eetac.dxat.cards.*;

public class TestUNOEngine {
	public static void main(String[] args) {

		// Show welcome
		System.out.println("Welcome to UNO card game...");
		System.out.println("----------------------------------------------");

		String[] names = { "Alex", "Jesus", "Gerard", "Marti", "Xavier" };

		Engine myEngine = new UNOEngine(names);
		System.out.println(myEngine.toString());

	}
}
