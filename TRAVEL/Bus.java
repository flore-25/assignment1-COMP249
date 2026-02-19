package TRAVEL;

public class Bus extends Transport{
	private String busCompany;
	private int numberOfStops;

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
	public double calculateCost(int km) {
		double baseFare = 0.15;
		return baseFare*km; //fictional value for baseFare price
	}
	@Override
	public String toString() {
	return super.toString()+ "\n " 
	+ "Bus Company: "+ busCompany + "\n " 
	+ "Number of stops: "+ numberOfStops; //calls the parent's (Transport) toString
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
			Bus o = (Bus) other;
			return this.busCompany == o.busCompany && this.numberOfStops == o.numberOfStops;
		}

	
	
	}}
	






