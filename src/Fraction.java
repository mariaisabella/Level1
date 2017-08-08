public class Fraction {
	public int numerator;
	public int denominator;

	public Fraction(int num, int den) {
		numerator = num;
		denominator = den;
	}

	public float getValue() {
		return (numerator / denominator);

	}
}
