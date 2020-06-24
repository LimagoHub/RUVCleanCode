package de.ruv.spiele.nimmspiel.spieler;

public class ComputerPlayer extends AbstractNimmspielSpieler {

	public ComputerPlayer() {
		
	}

	public ComputerPlayer(String name) {
		super(name);
		
	}

	@Override
	public Integer doTurn(Integer steine) {
		final int zuege[] = {3,1,1,2};
		
		int zug = zuege[steine % 4];
		System.out.println(String.format("Computer nimmt %s Steine", zug));
		
		return zug;
	}

}
