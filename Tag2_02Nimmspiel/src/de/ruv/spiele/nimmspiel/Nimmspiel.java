package de.ruv.spiele.nimmspiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import de.ruv.spiele.Spiel;
import de.ruv.spiele.nimmspiel.spieler.NimmspielSpieler;

public class Nimmspiel implements Spiel{
	
	private int steine;
	private int zug;
	
	private List<NimmspielSpieler> players = new ArrayList<>();
	
	
	public Nimmspiel() {
		steine = 23;
	}
	
	
	
	
	public boolean addNimmspielSpieler(NimmspielSpieler nimmspielSpieler) {
		return players.add(nimmspielSpieler);
	}




	public boolean removeNimmspielSpieler(NimmspielSpieler nimmspielSpieler) {
		return players.remove(nimmspielSpieler);
	}




	protected boolean gameOver() {
		return steine < 1 || players.isEmpty();
	}

	@Override
	public void play() {
		while(! gameOver()) 	executeTurns();
	}

	private void executeTurns() {
		spielerzug();
		computerzug();
	}
	
	private void spielerzug() {
		
		if(gameOver()) return;
		
		while(gamersTurnIsInvalid()) {
			System.out.println("ungültiger Zug");
		}
		terminateTurn("Spieler");
	}

	
	private void computerzug() {
		if(gameOver()) return;
		
		final int zuege[] = {3,1,1,2};
		
		zug = zuege[steine % 4];
		System.out.println(String.format("Computer nimmt %s Steine", zug));
		
		terminateTurn("Computer");
		
	}
	
	private boolean gamersTurnIsInvalid() {
		humanPlayersTurn();
		return ! isTurnValid();
	}

	
	private void humanPlayersTurn() {
		System.out.println(String.format("Es gibt %s Steine. Bitte nehmen Sie 1,2 oder 3.",steine));
		zug = scanner.nextInt();
	}


	private void terminateTurn(String spieler) {
		updateBoard();
		checkLosing(spieler);
	}
	
	private boolean isTurnValid() {
		return  zug >= 1 && zug <= 3;
	}


	private void checkLosing(String spieler) {
		if(gameOver()) {
			System.out.println(spieler + " hat verloren");
			
		}
	}

	private void updateBoard() {
		steine-= zug;
	}
	
	

}
