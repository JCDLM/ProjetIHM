package model;

/**
 * This class allows to initialize the tray with the mod, the size and put the value 0
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */


public class Tray {

  private int[][] tray; //It's the variable for the tray
  private final int SIZE_TRAY;

  /**
   * This method allows to initialize the tray
   * @param sizeTray It's the size of the tray
   * @param mod It's the mod of the game
   */
  public Tray(int sizeTray, Mod mod) {
    this.SIZE_TRAY = sizeTray;

    if(mod.getMod().equals("Classique")) {

      this.tray = new int[SIZE_TRAY][SIZE_TRAY];

      for(int i=0; i < sizeTray; i++) {
        for(int j=0; j < sizeTray; j++) {
          this.tray[i][j] = 0;
        }
      }

    }
    else if (mod.getMod().equals("Contact Rapide")) {


    }
    else if (mod.getMod().equals("Duo")) {

    }
  }

  /**
   * This method allows to set the Tray with a new Piece
   * @param i It's the index of the 1st dimension of the tray
   * @param j It's the index of the 2nd dimension of the tray
   * @param thePiece It's the Piece to put on the tray
   * @param couleur It's the number of the color
   */
  /*public void setTray(int i, int j, Piece thePiece, int color) {


  }*/

  /**
   * This method allows to return the tray
   * @return the tray of the game
   */
  public int[][] getTray() {
    return this.tray;
  }
}
