package de.ruv.spiele.player;

public interface Player<R,P> {
	
	String getName();
	R doTurn(P board);

}
