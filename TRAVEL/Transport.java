package TRAVEL;

public abstract class Transport {
	//all idCounter are static
	private String transportID;
	private static int idCounter=3001; 
	private String companyName;
	private String departureCity;
	private String arrivalCity;
	
	
	
	public Transport(){//default constructor
		transportID = "TR"+idCounter;
		companyName= "";
		departureCity= "";
		arrivalCity= "";
		idCounter++;// ID has to be incremented in each constructor!
	}
	
	
	
	public Transport (String companyName,String departureCity,String arrivalCity) { //parameterized constructor
		transportID = "TR"+idCounter;
		this.companyName= companyName;
		this.departureCity= departureCity;
		this.arrivalCity= arrivalCity;
		idCounter++;
		
		
	}
	
	public Transport (Transport other) { //copy constructor
		transportID = "TR"+idCounter;
		this.companyName= other.companyName;
		this.departureCity= other.departureCity;
		this.arrivalCity= other.arrivalCity;
		idCounter++;
		
		
	}
	
	//this method has to be defined in Bus, Train and Flight child classes
	public abstract double calculateCost();



	public String getTransportID() {
		return transportID;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getDepartureCity() {
		return departureCity;
	}



	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}



	public String getArrivalCity() {
		return arrivalCity;
	}



	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
	
	public String toString(){
		return ("Company name: "+ companyName +"/n"
				+"ID type: " + transportID + "/n"
				+"ID number: " + idCounter +"/n"
				+"Departure city: "+ departureCity + "/n"
				+"Arrival city: " + arrivalCity);
	}
	public boolean equals (Transport other) {
		
		if (other == null) 
			return false;
		
		if (this.getClass()!= other.getClass()) 
			return false;
		
		if (this.companyName.equalsIgnoreCase(other.companyName)&& this.departureCity.equalsIgnoreCase(other.departureCity)&& this.arrivalCity == other.arrivalCity)
			return true;
	
		return false;

	
	}
	
		
}
	
	
	


