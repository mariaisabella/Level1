
public class Shoop {
	private int tailLength;
	private String shape;
	private String name;

	public Shoop(int tailLength, String shape, String name) {
		this.tailLength = tailLength;
		this.shape = shape;
		this.name = name;
		System.out.println("creating shoop with tailLength " + tailLength);
	}

	public void lengthenTail(int addLength) {
		tailLength = tailLength + addLength;
	}

	public void describeShoop() {
		System.out.println("Hi. I'm " + name + ". My tail length is " + tailLength + " and my shape is " + shape + ".");
	}

	public static void main(String[] args) {
		Shoop petCarl = new Shoop(3, "trapezoid", "Carl");
		petCarl.lengthenTail(5);
		petCarl.describeShoop();
	}
}
