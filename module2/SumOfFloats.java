public class SumOfFloats {
	public static void main(String[] args) {
		if(args.length == 4) {
			// convert strings to numbers
			Float a = (Float.valueOf(args[0])).floatValue();
			Float b = (Float.valueOf(args[1])).floatValue();
			Float c = (Float.valueOf(args[2])).floatValue();
			Float d = (Float.valueOf(args[3])).floatValue();
			Float sum = a + b + c + d;
			
			// do some arithmetic
			System.out.printf("a + b + c + d = " + ("%.2f"), sum);
		}
		else {
			System.out.println("This program " + "requires four command-line arguments.");
		}
	}
}