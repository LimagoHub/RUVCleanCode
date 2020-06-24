package de.ruv.application;

import de.ruv.clients.SpielClient;
import de.ruv.spiele.AbstractSpiel;
import de.ruv.spiele.nimmspiel.Nimmspiel;
import de.ruv.spiele.nimmspiel.spieler.ComputerPlayer;
import de.ruv.spiele.nimmspiel.spieler.HumanPlayer;

public class Main {

	public static void main(String[] args) {
		AbstractSpiel spiel = new Nimmspiel();
		spiel.addPlayer(new HumanPlayer());
		spiel.addPlayer(new HumanPlayer("Fritz"));
		spiel.addPlayer(new ComputerPlayer());
		SpielClient client = new SpielClient(spiel);
		client.start();
	}

}
