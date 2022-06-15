public class Dog extends Animal {
    	private String name;
    	private String barkNoise = "Woof";
    	private double weight;

	// Constructor that creates a dog object
	// Use super keyword to access the superclass constructor
    	public Dog(String name, String breed, double weight, String colour) {
    		super(breed, colour);
    		this.name = name;
    		this.weight = weight;
    	}

	// Second constructor that accepts values for all instance fields
    	public Dog (String name, String breed, String noise, double weight, String colour) {
    		super(breed, colour);
    		this.name = name;
    		barkNoise = noise;
    		this.weight = weight;
    	}

	//Getter and setter methods
    	public String getName() {
    		return name;
    	}

    	public void setName(String name) {
    		this.name = name;
    	}

    	public double getWeight() {
    		return weight;
    	}

    	public void setWeight(double weight) {
        	this.weight = weight;
    	}
	
	// Print the value of barkNoise
    	public void bark(){
    		System.out.println(barkNoise);
    	}

    	public void bark(String barkNoise){
    		System.out.println(barkNoise);
    	}
}