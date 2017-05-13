import javax.swing.JOptionPane;

public class Racoon {
	private int trash;

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

	public int getTrash(){
		System.out.println(trash);
	}

	public static void main(String[] args) {
		Racoon Marg = new Racoon(5);
		Marg.addTrash(2);
		Marg.setTrash(7);

	}
}
