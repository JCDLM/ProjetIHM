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
	}


	public void setPiece0(int position) {
		Piece0 piece0 = new Piece0(this.color);
		this.pieces.add(0, piece0.getPiece0Position(position));
	}

	public void setPiece1(int position) {
		Piece1 piece1 = new Piece1(this.color);
		this.pieces.add(1, piece1.getPiece1Position(position));
	}

		/*//The piece 0
		Piece0 piece0 = new Piece0(color);
		this.pieces.add(piece0.getPiece0Position(1));

		//The piece 1
		Piece1 piece1 = new Piece1(color);
		this.pieces.add(piece1.getPiece1Position(1));

		//The piece 2
		Piece2 piece2 = new Piece2(color);
		this.pieces.add(piece2.getPiece2Position(1));

		//The piece 3
		Piece3 piece3 = new Piece3(color);
		this.pieces.add(piece3.getPiece3Position(1));

		//The piece 4
		Piece4 piece4 = new Piece4(color);
		this.pieces.add(piece4.getPiece4Position(1));

		//The piece 5
		Piece5 piece5 = new Piece5(color);
		this.pieces.add(piece5.getPiece5Position(1));

		//The piece 6
		Piece6 piece6 = new Piece6(color);
		this.pieces.add(piece6.getPiece6Position(1));

		//The piece 7
		Piece7 piece7 = new Piece7(color);
		this.pieces.add(piece7.getPiece7Position(1));

		//The piece 8
		Piece8 piece8 = new Piece8(color);
		this.pieces.add(piece8.getPiece8Position(1));

		//The piece 9
		Piece9 piece9 = new Piece9(color);
		this.pieces.add(piece9.getPiece9Position(1));

		//The piece 10
		Piece10 piece10 = new Piece10(color);
		this.pieces.add(piece10.getPiece10Position(1));

		//The piece 11
		Piece11 piece11 = new Piece11(color);
		this.pieces.add(piece11.getPiece11Position(1));

		//The piece 12
		Piece12 piece12 = new Piece12(color);
		this.pieces.add(piece12.getPiece12Position(1));

		//The piece 13
		Piece13 piece13 = new Piece13(color);
		this.pieces.add(piece13.getPiece13Position(1));

		//The piece 14
		Piece14 piece14 = new Piece14(color);
		this.pieces.add(piece14.getPiece14Position(1));

		//The piece 15
		Piece15 piece15 = new Piece15(color);
		this.pieces.add(piece15.getPiece15Position(1));

		//The piece 16
		Piece16 piece16 = new Piece16(color);
		this.pieces.add(piece16.getPiece16Position(1));

		//The piece 17
		Piece17 piece17 = new Piece17(color);
		this.pieces.add(piece17.getPiece17Position(1));

		//The piece 18
		Piece18 piece18 = new Piece18(color);
		this.pieces.add(piece18.getPiece18Position(1));

		//The piece 19
		Piece19 piece19 = new Piece19(color);
		this.pieces.add(piece19.getPiece19Position(1));

		//The piece 20
		Piece20 piece20 = new Piece20(color);
		this.pieces.add(piece20.getPiece20Position(1));
	}*/

	/**
	 * This method allows to return the ArrayListof the pieces
	 * @return the list
	 */
	public ArrayList<int[][]> getListPiece() {
		return this.pieces;
	}

	public static void main(String[] args) {
		PieceList p = new PieceList(1);

		int[][] oui = p.getListPiece().get(1);
		for(int i=0; i < oui.length; i++) {
			for(int j=0; j < oui.length; j++) {
				System.out.print(oui[i][j]);
			}
			System.out.println();
		}

		p.setPiece1(2);

		System.out.println("");

		oui = p.getListPiece().get(1);
		for(int k=0; k < oui.length; k++) {
			for(int n=0; n < oui.length; n++) {
				System.out.print(oui[k][n]);
			}
			System.out.println();
		}
	}
}
