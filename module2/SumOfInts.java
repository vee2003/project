public class SumOfInts {
	public static void main(String[] args) {
		if(args.length == 4) {
			// convert strings to numbers
			int a = (Integer.valueOf(args[0])).intValue();
			int b = (Integer.valueOf(args[1])).intValue();
			int c = (Integer.valueOf(args[2])).intValue();
			int d = (Integer.valueOf(args[3])).intValue();
			int sum = a + b + c + d;
			
			// do some arithmetic
			System.out.printf("a + b + c + d = " + sum);
		}
		else {
			System.out.println("This program " + "requires four command-line arguments.");
		}
	}
}