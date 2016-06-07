import model.Tray;
import model.Mod;

public class Test{
	private Tray tray;
	private int[][] testTab;
	private int total;

	public Test(){
		this.tray= new Tray(20,new Mod(1));
		this.testTab= this.tray.getTray();
	}

	public void afficheTray(){
		BufferedWriter bw = new BufferedWriter(new FileWriter)
		for (int i=0; i<20; i++) {
			for (int j=0; j<20; j++) {
				if (j>20) {
					System.out.println(this.testTab[i][j]);
				}
				else {
					System.out.print(this.testTab[i][j]);
				}
				this.total++;
			}
		}
	}

	public int getTotal(){
		return this.total;
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.afficheTray();
		System.out.println(test.getTotal());
	}
}