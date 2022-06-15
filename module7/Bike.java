public abstract class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;
	
	public Bike() {	
		this.make = "Oracle Cycles";
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = "Oracle Cycles";
	}//end constructor

	//add unimplemented methods
	public String getHandleBars() {return handleBars;}
	public void setHandleBars(String handleBars) {this.handleBars = handleBars;}
	public String getTyres() {return tyres;}
	public void setTyres(String tyres) {this.tyres = tyres;}
	public String getSeatType() {return seatType; }
	public void setSeatType(String seatType) {this.seatType = seatType;}

	protected void printDescription() {
		System.out.println("\n" + this.make + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription
}//end class Bike
	
	

