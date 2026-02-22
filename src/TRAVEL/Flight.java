package TRAVEL;

public class Flight extends Transport {
	private String airlineName;
	private double luggageAllowance;
	private double baseTicketPrice=550.0;
	
	public Flight() { //default constructor
		super();
		airlineName = "";
		luggageAllowance = 0.0;
	}

	public Flight(String companyName, String departureCity, String arrivalCity,String airlineName, double luggageAllowance) { //parameterized constructor
		super(companyName, departureCity, arrivalCity); //calling the parameterized constructor of the Transport class
		this.airlineName= airlineName;
		this.luggageAllowance = luggageAllowance;
	}
	
	public Flight(Flight other) {//copy constructor
		super(other);
		this.airlineName= other.airlineName;
		this.luggageAllowance= other.luggageAllowance;
	}
		
	@Override
	public double calculateCost() {
		return (baseTicketPrice+(luggageAllowance*1.5)); 
	}
	
	@Override
	public String toString() {
	return super.toString()+ "\n" 
	+ "Name of the airline: "+ airlineName+ "\n"
	+ "Luggage allowance: "+ luggageAllowance; //calls the parent's (Transport) toString
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null) 
			return false;
		else if (!super.equals(other))
			return false;
		else if ((airlineName.equalsIgnoreCase(((Flight)other).airlineName))&&(luggageAllowance==((Flight)other).luggageAllowance))
			return true;
		return false;
	}
	

}
