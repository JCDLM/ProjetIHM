package model;

/**
 * This class allows to initialize and create the model game
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */
import java.util.*;

public class Game {

	private ArrayList<Player> listPlayers;	//It's the list of the players
	//private Mod typeMod;										//It's the mod for the game
	private int traySize;										//It's the tray's size
	//private double totalTime;								//It's the total time for play
	//private int pieceMaxSize; 							//It's the size max of the pieces

	/**
	 * This method allows to initialize the game
	 * @param listPlayers the list of the players
	 * @param traySize The Size of the tray
	 */
	public Game(ArrayList<Player> listPlayers, int traySize) {
		this.listPlayers = listPlayers;
		this.traySize = traySize;
		//this.typeMod = typeMod;
		//this.totalTime = totalTime;

		initializeGame();
	}

	/**
	 * This method allows to initialize the game
	 */
	public void initializeGame() {
		//Tray tray = new Tray(this.traySize);
	}




}
