package TRAVEL;

public class Flight extends Transport {
	
	private String airlineName;
	private double luggageAllowance;
	
	public Flight() { //default constructor
		airlineName = "";
		luggageAllowance = 0.0;
	}

	public Flight (String companyName, String departureCity, String arrivalCity,String airlineName, double luggageAllowance) { //parameterized constructor
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
	public double calculateCost(int km) {
		double ticketPricePerKm = 0.25;//fictional value for ticket price
		return ticketPricePerKm*km; 
	}
	@Override
	public String toString() {
	return super.toString()+ "/n " 
	+ "Name of the airline: "+ airlineName
	+ "Luggage allowance: "+ luggageAllowance; //calls the parent's (Transport) toString
	}
	@Override
	public boolean equals (Transport other) {
		
		if (other == null) 
			return false;
		
		if (!super.equals(other))
			return false;
			
		if (this.getClass()!= other.getClass()) 
			return false;
		
		if (this.getCompanyName().equalsIgnoreCase(other.getCompanyName())&& this.getDepartureCity().equalsIgnoreCase(other.getDepartureCity())&& this.getArrivalCity() == other.getArrivalCity())
			return true;
	
		return false;

	
	}
	
		
}




