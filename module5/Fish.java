public class Fish extends Animal {
    	private String waterType;

	// Constructor that creates a fish object
	// Use super keyword to access the superclass constructor
    	public Fish(String breed, String waterType, String colour) {
        	super(breed, colour);
        	this.waterType = waterType;
	}

	// Getter and setter methods
    	public String getWaterType() {
    		return waterType;
    	}

    	public void setWaterType(String waterType) {
    		this.waterType = waterType;
    	}
}
