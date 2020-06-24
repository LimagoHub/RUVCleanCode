package de.ruv.spiele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.ruv.spiele.player.Player;

public abstract class AbstractSpiel<ZUG, BOARD> implements Spiel {
	
	private BOARD gameboard;
	private ZUG turn;

	private List<Player<ZUG, BOARD>> players = new ArrayList<>();
	
	public boolean addPlayer(Player<ZUG, BOARD> player) {
		return players.add(player);
	}

	public boolean removePlayer(Player<ZUG, BOARD> player) {
		return players.remove(player);
	}

	
	
	protected void setGameboard(BOARD gameboard) {
		this.gameboard = gameboard;
	}

	protected BOARD getGameboard() {
		return gameboard;
	}

	protected ZUG getTurn() {
		return turn;
	}
	
	
	protected List<Player<ZUG, BOARD>> getPlayers() {
		return Collections.unmodifiableList(players);
	}

	@Override
	public void play() {
		while(! isGameOver()) executeTurns();
	}
	
	private void executeTurns() {
		for (Player<ZUG, BOARD> player : players) {
			executeTurnWith(player);
		}
	}
	
	private void executeTurnWith(Player<ZUG, BOARD> player) {
		
		if(isGameOver()) return;
		
		while(gamersTurnIsInvalid(player)) {
			System.out.println("ungültiger Zug");
		}
		terminateTurn(player);
	}

	private boolean gamersTurnIsInvalid(Player<ZUG, BOARD> player) {
		turn = player.doTurn(gameboard);
		return ! isTurnValid();
	}

	private void terminateTurn(Player<ZUG, BOARD> spieler) {
		updateBoard();
		checkLosing(spieler);
	}
	
	private void checkLosing(Player<ZUG, BOARD> spieler) {
		if(isGameOver()) {
			System.out.println(spieler.getName() + " hat verloren");
			
		}
	}

	protected abstract boolean isTurnValid() ;



	protected abstract void updateBoard() ;
	
	protected abstract boolean isGameOver() ;
	
}
