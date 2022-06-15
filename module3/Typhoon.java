public class Typhoon {
	public static void main(String[] args) {
		int WindSpeed = Integer.parseInt(args[0]);
		
		if (WindSpeed > 220) System.out.println("Super Typhoon");
		else if (WindSpeed >= 118 && WindSpeed <= 220) System.out.println("Typhoon");
		else if (WindSpeed >= 89 && WindSpeed <= 117) System.out.println("Severe Tropical Strom");
		else if (WindSpeed >= 62 && WindSpeed <= 88) System.out.println("Tropical Storm");
		else if (WindSpeed <= 61) System.out.println("Tropical Depression");
		else System.out.println("Unidentified");
	}
}