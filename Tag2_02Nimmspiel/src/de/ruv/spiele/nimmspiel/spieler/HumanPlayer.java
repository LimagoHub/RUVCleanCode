package de.ruv.spiele.nimmspiel.spieler;

import java.util.Scanner;

public class HumanPlayer extends AbstractNimmspielSpieler {
	
	private final Scanner scanner = new Scanner(System.in);

	public HumanPlayer() {
		// TODO Auto-generated constructor stub
	}

	public HumanPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int doTurn(int steine) {
		System.out.println(String.format("Es gibt %s Steine. Bitte nehmen Sie 1,2 oder 3.", steine));
		return scanner.nextInt();
	}

}
