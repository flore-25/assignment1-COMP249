package TRAVEL;

public abstract class Transport {
	//all idCounter are static
	private String TransportID;
	private static int idCounter; 
	private String companyName;
	private String departureCity;
	private String arrivalCity;
	
	
	//this method has to be defined in Bus, Train and Flight
	public abstract double calculateCost();
	
	
	
	

}
