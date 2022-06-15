public class BikeDriver {
	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike("drop", "racing", "tread less", "razor", 19, 20, 20);
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike("Bull Horn", "Hardtail", "Maxxis", "dropper", 27, "RockShox XC32", "Pro", 19);
		// Bike bike4 = new Bike();
		
		System.out.println(bike1);
		System.out.println(bike2);
		System.out.println(bike3);
		// bike4.printDescription();
	}//end method main
}//end class BikeDriver
