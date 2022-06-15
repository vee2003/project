public class AnimalTester{
    	public static void main(String[]args) {
		// Create a dog and fish object
        	Dog dog = new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "brown");
        	Fish fish = new Fish("Goldfish", "cold", "red");

		// Print dog using instance field getter methods
        	System.out.println("Dog name : " + dog.getName());
        	System.out.println("Dog breed : " + dog.getBreed());
        	System.out.print("Bark noise: ");
        	dog.bark();
        	System.out.println("Dog weight: " + dog.getWeight());
        	System.out.println("Dog colour: " + dog.getColour());

		System.out.println();

		// Print fish using instance field getter methods
        	System.out.println("Fish breed : " + fish.getBreed());
        	System.out.println("Water type : " + fish.getWaterType());
        	System.out.println("Fish colour: " + fish.getColour());
    	}
}