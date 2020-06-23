package de.ruv.spiele.nimmspiel.spieler;

public abstract class AbstractNimmspielSpieler implements NimmspielSpieler{
	
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
