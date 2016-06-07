package model.piece;

/**
 * This clas allows to create the pieces
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */

import java.util.ArrayList;

public class PieceList {

	private int color;
	private ArrayList<int[][]> pieces;

	/**
	 * This method allows to initialize the piece
	 * @param color the number for the color
	 */
	public PieceList(int color) {
		this.color = color;	//Color of the players
		this.pieces = new ArrayList<int[][]>();	//The list of the pieces
		setPiece0(1);		//The piece 0
		setPiece1(1);		//The piece 1
		setPiece2(1);		//The piece 2
		setPiece3(1);		//The piece 3
		setPiece4(1);		//The piece 4
		setPiece5(1);		//The piece 5
		setPiece6(1);		//The piece 6
		setPiece7(1);		//The piece 7
		setPiece8(1);		//The piece 8
		setPiece9(1);		//The piece 9
		setPiece10(1);		//The piece 10
		setPiece11(1);		//The piece 11
		setPiece12(1);		//The piece 12
		setPiece13(1);		//The piece 13
		setPiece14(1);		//The piece 14
		setPiece15(1);		//The piece 15
		setPiece16(1);		//The piece 16
		setPiece17(1);		//The piece 17
		setPiece18(1);		//The piece 18
		setPiece19(1);		//The piece 19
		setPiece20(1);		//The piece 20
	}

	/**
	 * This method allows to create the piece 0
	 * @param position the position of the piece
	 */
	public void setPiece0(int position) {
		Piece0 piece0 = new Piece0(this.color);
		this.pieces.add(0, piece0.getPiece0Position(position));
	}

	/**
	 * This method allows to create the piece 1
	 * @param position the position of the piece
	 */
	public void setPiece1(int position) {
		Piece1 piece1 = new Piece1(this.color);
		this.pieces.add(1, piece1.getPiece1Position(position));
	}

	/**
	 * This method allows to create the piece 2
	 * @param position the position of the piece
	 */
	public void setPiece2(int position) {
		Piece2 piece2 = new piece2(this.color);
		this.pieces.add(2, piece2.getPiece2Position(position));
	}

	/**
	 * This method allows to create the piece 3
	 * @param position the position of the piece
	 */
	public void setPiece3(int position) {
		Piece3 piece3 = new Piece3(this.color);
		this.pieces.add(3, piece3.getPiece3Position(position));
	}

	/**
	 * This method allows to create the piece 4
	 * @param position the position of the piece
	 */
	public void setPiece4(int position) {
		Piece4 piece4 = new Piece4(this.color);
		this.pieces.add(4, piece4.getPiece4Position(position));
	}

	/**
	 * This method allows to create the piece 5
	 * @param position the position of the piece
	 */
	public void setPiece5(int position) {
		Piece5 piece5 = new Piece5(this.color);
		this.pieces.add(5, piece5.getPiece5Position(position));
	}

	/**
	 * This method allows to create the piece 6
	 * @param position the position of the piece
	 */
	public void setPiece6(int position) {
		Piece6 piece6 = new Piece6(this.color);
		this.pieces.add(6, piece6.getPiece6Position(position));
	}

	/**
	 * This method allows to create the piece 7
	 * @param position the position of the piece
	 */
	public void setPiece7(int position) {
		Piece7 piece7 = new Piece7(this.color);
		this.pieces.add(7, piece7.getPiece7Position(position));
	}

	/**
	 * This method allows to create the piece 8
	 * @param position the position of the piece
	 */
	public void setPiece8(int position) {
		Piece8 piece8 = new Piece8(this.color);
		this.pieces.add(8, piece8.getPiece8Position(position));
	}

	/**
	 * This method allows to create the piece 9
	 * @param position the position of the piece
	 */
	public void setPiece9(int position) {
		Piece9 piece9 = new Piece9(this.color);
		this.pieces.add(9, piece9.getPiece9Position(position));
	}

	/**
	 * This method allows to create the piece 10
	 * @param position the position of the piece
	 */
	public void setPiece10(int position) {
		Piece10 piece10 = new Piece10(this.color);
		this.pieces.add(10, piece10.getPiece10Position(position));
	}

	/**
	 * This method allows to create the piece 11
	 * @param position the position of the piece
	 */
	public void setPiece11(int position) {
		Piece11 piece11 = new Piece11(this.color);
		this.pieces.add(11, piece11.getPiece11Position(position));
	}

	/**
	 * This method allows to create the piece 12
	 * @param position the position of the piece
	 */
	public void setPiece12(int position) {
		Piece12 piece12 = new Piece12(this.color);
		this.pieces.add(12, piece12.getPiece12Position(position));
	}

	/**
	 * This method allows to create the piece 13
	 * @param position the position of the piece
	 */
	public void setPiece13(int position) {
		Piece13 piece13 = new Piece13(this.color);
		this.pieces.add(13, piece13.getPiece13Position(position));
	}

	/**
	 * This method allows to create the piece 14
	 * @param position the position of the piece
	 */
	public void setPiece14(int position) {
		Piece14 piece14 = new Piece14(this.color);
		this.pieces.add(14, piece14.getPiece14Position(position));
	}

	/**
	 * This method allows to create the piece 15
	 * @param position the position of the piece
	 */
	public void setPiece15(int position) {
		Piece15 piece15 = new Piece15(this.color);
		this.pieces.add(15, piece15.getPiece15Position(position));
	}

	/**
	 * This method allows to create the piece 16
	 * @param position the position of the piece
	 */
	public void setPiece16(int position) {
		Piece16 piece16 = new Piece16(this.color);
		this.pieces.add(16, piece16.getPiece16Position(position));
	}

	/**
	 * This method allows to create the piece 17
	 * @param position the position of the piece
	 */
	public void setPiece17(int position) {
		Piece17 piece17 = new Piece17(this.color);
		this.pieces.add(17, piece17.getPiece17Position(position));
	}

	/**
	 * This method allows to create the piece 18
	 * @param position the position of the piece
	 */
	public void setPiece18(int position) {
		Piece18 piece18 = new Piece18(this.color);
		this.pieces.add(18, piece18.getPiece18Position(position));
	}

	/**
	 * This method allows to create the piece 19
	 * @param position the position of the piece
	 */
	public void setPiece19(int position) {
		Piece19 piece19 = new Piece19(this.color);
		this.pieces.add(19, piece19.getPiece19Position(position));
	}

	/**
	 * This method allows to create the piece 20
	 * @param position the position of the piece
	 */
	public void setPiece20(int position) {
		Piece20 piece20 = new Piece20(this.color);
		this.pieces.add(20, piece20.getPiece20Position(position));
	}

////////////////////////////////////////////////////// GETLISTPIECE \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	/**
	 * This method allows to return the ArrayListof the pieces
	 * @return the list
	 */
	public ArrayList<int[][]> getListPiece() {
		return this.pieces;
	}

	public static void main(String[] args) {
		PieceList p = new PieceList(1);

		int[][] oui = p.getListPiece().get(12);
		for(int i=0; i < oui.length; i++) {
			for(int j=0; j < oui.length; j++) {
				System.out.print(oui[i][j]);
			}
			System.out.println();
		}

		p.setPiece1(2);

		System.out.println("");

		oui = p.getListPiece().get(12);
		for(int k=0; k < oui.length; k++) {
			for(int n=0; n < oui.length; n++) {
				System.out.print(oui[k][n]);
			}
			System.out.println();
		}
	}
}
