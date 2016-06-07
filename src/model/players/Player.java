package model;

/**
 * This class allows to create a player with all his parameters
 * The parameters are the color, the team, the name, the time, the score and if it's a IA or real player
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */


public class Player {

	private String color;	// It's the color of the player
	private String name;	// It's the name of the player
	private String team;	// It's the team of the player
	private double time;	// It's the time of the player
	private int score;		// It's the score of the player
	private boolean isIA;	// It's true if it's a IA

	/**
	 *
	 * @param color the color of the player
	 * @param name the name of the player
	 * @param team the team of the player
	 * @param isIA if it's a IA or real player
	 */
	public Player(int color, String name, int team, boolean isIA) {

	}

	/**
	 * This method allows to return the team of the player
	 * @return the team of the player
	 */
	public String getTeam() {
		return this.team;
	}

	/**
	 * This method allows to return the color of the player
	 * @return the color of the player
	 */
	public String getColor() {
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
		return this.isIA;
	}

}
