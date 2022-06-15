public class Hellos { 
    	public static void main(String[] args) {
        	int n = Integer.parseInt(args[0]);

        	for (int i = 1; i <= n; i++) {
            	System.out.print(i);

            // use "th" as suffix from 10 to 20.
            if (i % 100 >= 10 && i % 100 <= 20) {
                	System.out.print("th");
            }

            // uses "st", "nd", "rd" as suffix if it ends in 1, 2, 3.
            else if (i % 10 == 1) 
			System.out.print("st");
            else if (i % 10 == 2) 
			System.out.print("nd");
            else if (i % 10 == 3) 
			System.out.print("rd");

            // uses "th" as suffix.
            else                  
			System.out.print("th");

           	System.out.println(" Hello");

        	}

	}
}