package de.ruv.clients;

import de.ruv.spiele.Spiel;

public class SpielClient {
	
	private Spiel spiel;
	
	
	
	public SpielClient(Spiel spiel) {
		this.spiel = spiel;
	}



	public void start() {
		spiel.play();
	}

}
