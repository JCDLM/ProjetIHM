package model;

/**
 * This class allows to select the mod
 *
 * @author Ars Martin - Biancat Jean
 * @version 0.1.1
 */
public class Mod {

	private String mod;	//The mod

	/**
	 * This method allows to select the mod with a int in param
	 * @param the int for select the mod
	 */
	public Mod(int theMod) {
		switch(theMod) {
			case 1:
				this.mod = "Classique";
			break;
			case 2:
			this.mod = "Contact Rapide";
			break;
			case 3:
				this.mod = "Duo";
			break;
		}
	}

	/**
	 * This method allows to return the name of the mod
	 * @return the name of the mod
	 */
	public String getMod() {
		return this.mod;
	}
}
