package TRAVEL;

public class Bus extends Transport{
	private String busCompany;
	private int numberOfStops;
	private double fare=3.5;

	public Bus() { //default constructor
		busCompany = "";
		numberOfStops = 0;
	}

	public Bus (String companyName, String departureCity, String arrivalCity,String busCompany,int numberOfStops) { //parameterized constructor
		super(companyName, departureCity, arrivalCity); //calling the parameterized constructor of the Transport class
	    this.busCompany = busCompany;
		this.numberOfStops = numberOfStops;
	}
	
	public Bus(Bus other) {//copy constructor
		super(other);
		this.busCompany= other.busCompany;
		this.numberOfStops= other.numberOfStops;
	}
		
	
	public String getBusCompany() {
		return busCompany;
	}

	public void setBusCompany(String busCompany) {
		this.busCompany = busCompany;
	}

	public int getNumberOfStops() {
		return numberOfStops;
	}

	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	@Override
	public double calculateCost() {
		return (fare+(numberOfStops*.15));
	}
	
	@Override
	public String toString() {
	return super.toString()+ "\n" //calls the parent's (Transport) toString
	+ "Bus Company: "+ busCompany + "\n" 
	+ "Number of stops: "+ numberOfStops; 
	}
	
	public boolean equals(Bus other) {
		if (other == null) 
			return false;
		else if (!super.equals(other))
			return false;
		else if ((numberOfStops==other.numberOfStops) && (other.getBusCompany().equalsIgnoreCase(busCompany)))
			return true;
		return false;
		}

	
	
}
	
