package model.piece;

/**
 * This clas allows to create the piece number 1
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */

public class Piece1 {

	private int color;

	/**
	 * This method allows to initialize the piece 1
	 * @param color the number for the color
	 */
	public Piece1(int color) {
		this.color = color;	//Color of the players
  }

  /**
   * This method allows to create the piece in the array
   * @param position The position of the piece
   * @return The piece in the array
   */
  public int[][] getPiece1Position(int position) {
    int[][] piece = null;
    piece = new int[2][2];

    if(position == 1 || position == 3) {
      piece[0][0] = this.color;
  		piece[0][1] = this.color;
    }
    else if(position == 2 || position == 4) {
      piece[0][0] = this.color;
  		piece[1][0] = this.color;
    }

    return piece;
  }
}
