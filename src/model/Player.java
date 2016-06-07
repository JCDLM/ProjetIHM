package model;

/**
 * This class allows to create a player with all his parameters
 * The parameters are the color, the team, the name, the time, the score and if it's a IA or real player
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */


public class Player {

	private int color;	// It's the color of the player
	private String name;	// It's the name of the player
	private int team;	// It's the team of the player
	private double time;	// It's the time of the player
	private int score;		// It's the score of the player
	private boolean isAI;	// It's true if it's a IA
	private Tray plateau;	//It's the tray of the game
	//private Piece piece;	//It's the list of piece of the player

	/**
	 *
	 * @param color the color of the player
	 * @param name the name of the player
	 * @param team the team of the player
	 * @param isIA if it's a IA or real player
	 */
	public Player(Tray plat, int color, String name, int team, boolean isAI) {
		this.plateau=plat;
		this.color=color;
		this.name=name;
		this.team=team;
		this.isAI=isAI;
		//this.piece= new Piece(this.color);
	}

	/**
	 * Check if the piece can be placed on the tray
	 */
	/*public boolean checkPiece(Piece p, int posX, int posY){
		boolean ret=true;
		if(//la diagonal = la couleur){
			ret=false;
		}
		return ret;
	}*/

	/**
	 * This method allows to return the tray of the game
	 * @return the tray of the game
	 */
	public Tray getTray(){
		return this.plateau;
	}

	/**
	 * This method allows to return the team of the player
	 * @return the team of the player
	 */
	public int getTeam() {
		return this.team;
	}

	/**
	 * This method allows to return the color of the player
	 * @return the color of the player
	 */
	public int getColor() {
		return this.color;
	}

	/**
	 * This method allows to return the name of the player
	 * @return the name of the player
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * This method allows to return the time of the player
	 * @return the time of the player
	 */
	public double getTime() {
		return this.time;
	}

	/**
	 * This method allows to return the score of the player
	 * @return the score of the player
	 */
	public int getScore() {
		return this.score;
	}

	/**
	 * This method return true if this player is a IA
	 * And this method return false if this player is not a IA
	 * @return true or False
	 */
	public boolean getIsIA() {
		return this.isAI;
	}

}
