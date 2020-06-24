package de.ruv.spiele.nimmspiel;

import de.ruv.spiele.AbstractSpiel;

public class Nimmspiel extends AbstractSpiel<Integer, Integer>{
	
	
	
	
	public Nimmspiel() {
		setGameboard(23);
	}
	
	

	protected boolean isGameOver() {
		return getGameboard() < 1 || getPlayers().isEmpty();
	}

		
	protected boolean isTurnValid() {
		return  getTurn() >= 1 && getTurn() <= 3;
	}


	
	protected void updateBoard() {
		setGameboard(getGameboard()- getTurn()); 
	}



	
	
	

}
