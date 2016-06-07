package model.piece;

/**
 * This clas allows to create the piece number 0
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */

public class Piece0 {

	private int color;

	/**
	 * This method allows to initialize the piece 0
	 * @param color the number for the color
	 */
	public Piece0(int color) {
		this.color = color;	//Color of the players
  }

  /**
   * This method allows to create the piece in the array
   * @param position The position of the piece
   * @return The piece in the array
   */
  public int[][] getPiece0Position(int position) {
    int[][] piece = null;
    piece = new int[1][1];

    if(position >= 0 && position <= 4) {
      piece[0][0] = this.color;
    }

    return piece;
  }
}
