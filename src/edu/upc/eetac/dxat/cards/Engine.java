package edu.upc.eetac.dxat.cards;

import java.util.Arrays;

public abstract class Engine {
	protected Player [] players;
	protected Deck deck;
	
	public Engine (String [] names){
		players = new Player[names.length];
		
		this.initDeck();
		
		this.initPlayers(names);
	}
	
	public abstract void initDeck ();
	public abstract void initPlayers(String [] names);

	@Override
	public String toString() {
		return "Engine [players=" + Arrays.toString(players) + ", deck=" + deck
				+ "]";
	}
	
	
}
