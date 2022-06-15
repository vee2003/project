public class Exchange {
	public static void main(String[] args) {
	// Declares a, b, and t and assigns values to it.
		int a = 1234;
		int b = 99;
		int t = a;
	// Assigns a and b.
		a = b;
		b = t;

	// Prints the value of a and b.
	System.out.println("Value of a is : " + a);
	System.out.println("Value of b is : " + b);
	}
}