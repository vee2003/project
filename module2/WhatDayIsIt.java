public class WhatDayIsIt { 
	public static void main(String[] args) {
		if (args.length == 3) {
			// Accepts three input from the user.
			int m = (Integer.valueOf(args[0])).intValue();
			int d = (Integer.valueOf(args[1])).intValue();
			int y = (Integer.valueOf(args[2])).intValue();
			// Formula of Gregorian calendar.
			int y0 = (y - (14-m) / 12) - 1;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14-m) / 12) - 2;
			int d0 = (d + x + 31 * m0 / 12) % 7;
			
			switch (d0) {
				case 0:
				System.out.println("Monday");
				break;
				case 1:
				System.out.println("Tuesday");
				break;
				case 2:
				System.out.println("Wednesday");
				break;
				case 3:
				System.out.println("Thursday");
				break;
				case 4:
				System.out.println("Friday");
				break;
				case 5:
				System.out.println("Saturday");
				break;
				case 6:
				System.out.println("Sunday");
				break;
			}
		}
			else {
				System.out.println(" ");
			}
	}
}
			