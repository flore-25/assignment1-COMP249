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
	return super.toString()+ "\n " 
	+ "Name of the airline: "+ airlineName+ "\n"
	+ "Luggage allowance: "+ luggageAllowance; //calls the parent's (Transport) toString
	}
	@Override
	public boolean equals(Transport other) {
		
		if (other == null) 
			return false;
		
		else if (!super.equals(other))
			return false;
		
		else if(getClass()!= other.getClass())
			
			return false;
		else
		{ 
			Flight o = (Flight) other;
			return this.airlineName == o.airlineName  && this.luggageAllowance == o.luggageAllowance;
		}

	
	
	}}
	

	
	
	





