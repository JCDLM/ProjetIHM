package model.piece;

/**
 * This clas allows to create the piece number 19
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */

public class Piece19 {

	private int color;

	/**
	 * This method allows to initialize the piece 19
	 * @param color the number for the color
	 */
	public Piece19(int color) {
		this.color = color;	//Color of the players
  }

  /**
   * This method allows to create the piece in the array
   * @param position The position of the piece
   * @return The piece in the array
   */
  public int[][] getPiece19Position(int position) {
    int[][] piece = null;
    piece = new int[3][3];

    if(position >= 0 && position <= 4) {
      piece[0][1] = this.color;
  		piece[1][0] = this.color;
  		piece[1][1] = this.color;
  		piece[1][2] = this.color;
  		piece[2][1] = this.color;
    }

    return piece;
  }
}
