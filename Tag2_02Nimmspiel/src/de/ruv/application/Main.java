package de.ruv.application;

import de.ruv.clients.SpielClient;
import de.ruv.spiele.nimmspiel.Nimmspiel;
import de.ruv.spiele.nimmspiel.spieler.ComputerPlayer;
import de.ruv.spiele.nimmspiel.spieler.HumanPlayer;

public class Main {

	public static void main(String[] args) {
		Nimmspiel spiel = new Nimmspiel();
		spiel.addNimmspielSpieler(new HumanPlayer());
		spiel.addNimmspielSpieler(new ComputerPlayer());
		SpielClient client = new SpielClient(spiel);
		client.start();
	}

}
