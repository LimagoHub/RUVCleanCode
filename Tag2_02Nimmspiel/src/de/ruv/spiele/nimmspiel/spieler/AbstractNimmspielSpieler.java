package de.ruv.spiele.nimmspiel.spieler;

import de.ruv.spiele.player.Player;

public abstract class AbstractNimmspielSpieler implements Player<Integer, Integer>{
	
	private String name = this.getClass().getSimpleName();

	public AbstractNimmspielSpieler() {
		// ok
	}
	
	public AbstractNimmspielSpieler(String name) {
		
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
	

}
