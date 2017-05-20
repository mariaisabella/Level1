import javax.swing.JOptionPane;

public class Racoon {
	private int trash;
	private int patches;
	private int organs;

	public Racoon(int trash) {
		this.trash = trash;
		System.out.println("Creating racoon with " + trash + " pieces of trash.");
	}

	public void addTrash(int addTrash) {
		trash = trash + addTrash;
		System.out.println("Your racoon now has " + trash + " pieces of trash.");
	}

	public void setTrash(int numTrash){
		trash = numTrash;
	}

	public void setPatches(int numPatches){
		patches = numPatches;
	}
	public int getTrash(){
		System.out.println("Your racoon now has " + trash + " pieces of trash.");
		return trash;
	}
	public int getPatches(){
		System.out.println("Your racoon now has " + patches + " patches.");
		return patches;
	}
	public void setOrgans(int numOrgans){
		organs = numOrgans;
		if (numOrgans>3){
			System.out.println("Your racoon still has " + numOrgans + " organs! They're not roadkill yet...");
		}
		else{
			System.out.println("Whoops... your racoon is dead.");
		}
	}
	public static void main(String[] args) {
	/*	Racoon Marg = new Racoon(5);
		Marg.addTrash(2);
		Marg.setTrash(1);
		Marg.getTrash();
		Marg.setPatches(4);
		Marg.getPatches();
		Marg.setOrgans(3);
*/
		Racoon Rodger=new Racoon(10);
		Rodger.setPatches(3);
		Rodger.setTrash(13);
		Rodger.setOrgans(6);
		Rodger.getTrash();
	}
}
