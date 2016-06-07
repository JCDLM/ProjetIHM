package model.piece;

/**
 * This clas allows to create the piece number 20
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */

public class Piece20 {

	private int color;

	/**
	 * This method allows to initialize the piece 20
	 * @param color the number for the color
	 */
	public Piece20(int color) {
		this.color = color;	//Color of the players
  }

  /**
   * This method allows to create the piece in the array
   * @param position The position of the piece
   * @return The piece in the array
   */
  public int[][] getPiece20Position(int position) {
    int[][] piece = null;
    piece = new int[4][4];

    switch(position) {
      case 1:
      piece[1][1] = this.color;
  		piece[2][0] = this.color;
  		piece[2][1] = this.color;
  		piece[2][2] = this.color;
  		piece[2][3] = this.color;
      break;
      case 2:
      piece[0][1] = this.color;
  		piece[1][1] = this.color;
  		piece[1][2] = this.color;
  		piece[2][1] = this.color;
  		piece[3][1] = this.color;
      break;
      case 3:
      piece[1][0] = this.color;
      piece[1][1] = this.color;
      piece[1][2] = this.color;
      piece[1][3] = this.color;
      piece[2][2] = this.color;
      break;
      case 4:
      piece[0][2] = this.color;
      piece[1][2] = this.color;
      piece[2][1] = this.color;
      piece[2][2] = this.color;
      piece[3][2] = this.color;
      break;
    }

    return piece;
  }
}
