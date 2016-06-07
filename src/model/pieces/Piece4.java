package model.piece;

/**
 * This clas allows to create the piece number 4
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */

public class Piece4 {

	private int color;

	/**
	 * This method allows to initialize the piece 4
	 * @param color the number for the color
	 */
	public Piece4(int color) {
		this.color = color;	//Color of the players
  }

  /**
   * This method allows to create the piece in the array
   * @param position The position of the piece
   * @return The piece in the array
   */
  public int[][] getPiece4Position(int position) {
    int[][] piece = null;
    piece = new int[2][2];

    if (position >= 0 && position <= 4) {
      piece[0][0] = color;
  		piece[0][1] = color;
  		piece[1][0] = color;
  		piece[1][1] = color;
    }

    return piece;
  }
}
