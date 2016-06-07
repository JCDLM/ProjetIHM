package model.piece;

/**
 * This clas allows to create the piece number 14
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */

public class Piece14 {

	private int color;

	/**
	 * This method allows to initialize the piece 14
	 * @param color the number for the color
	 */
	public Piece14(int color) {
		this.color = color;	//Color of the players
  }

  /**
   * This method allows to create the piece in the array
   * @param position The position of the piece
   * @return The piece in the array
   */
  public int[][] getPiece14Position(int position) {
    int[][] piece = null;
    piece = new int[5][5];

    if(position == 1 || position == 3) {
      piece[0][2] = this.color;
  		piece[1][2] = this.color;
  		piece[2][2] = this.color;
  		piece[3][2] = this.color;
  		piece[4][2] = this.color;
    }
    else if( position == 2 || position == 4) {
      piece[2][0] = this.color;
  		piece[2][1] = this.color;
  		piece[2][2] = this.color;
  		piece[2][3] = this.color;
  		piece[2][4] = this.color;
    }

    return piece;
  }
}
