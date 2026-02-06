package TRAVEL;

import CLIENT.Client;

//all idCounter are static
public class Trip {	
	private String tripID;
	private static int idCounter=2001;
	private String destination;
	private int durationInDay; 
	private double basePrice;
	private Client client;
	
	//make sure EACH constructors increment idCounter, AFTER assigning tripID
	public Trip() {
		basePrice=0;
		durationInDay=0;
		client=null;
		destination=null;
		tripID="T"+idCounter;
		idCounter++;
	}
	
	public Trip(String destination, int durationInDay, double basePrice, Client client) {
		this.basePrice=basePrice;
		this.destination=destination;
		this.durationInDay=durationInDay;
		this.client=client;
		tripID="T"+idCounter;
		idCounter++;
	}

	public Trip(Trip other) {
		this.basePrice=other.basePrice;
		this.client=other.client;
		this.destination=other.destination;
		this.durationInDay=other.durationInDay;
		tripID="T"+idCounter;
		idCounter++;
	}
	
	public String getTripId() {
		return tripID;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public Client getClient() {
		return client;
	}
	
	public double getBasePrice() {
		return basePrice;
	}
	
	public int getDurationInDays() {
		return durationInDay;
	}
	
	//we will have to get the cost of transport and accommodation here
	public double calculateTotalCost() {
		
	}
	
	//the user CANNOT set the ID, no setID
	public void setDurationInDay(int days) {
		durationInDay=days;
	}
	
	public void setBasePrice(double price) {
		basePrice=price;
	}
	
	public void setClient(Client client) {
		this.client=client;
	}
	
	public void setDestination(String newDestination) {
		destination=newDestination;
	}
	
	//making sure the other object is not null, then making sure it is of the Trip class, and finally making sure all attributes are equal (except ID)
	//do not compare IDs in equals methods
	public boolean equals(Trip other) {
			if (other==null)
				return (false);
			if (other.getClass()!=this.getClass())
				return(false);
			if ((destination.equalsIgnoreCase(other.destination))&&(durationInDay==other.durationInDay)&&(basePrice==other.basePrice)&&(client.equals(other)))
				return(true);
			return false;
	}
	
	public String toString() {
		return("destination: "+destination+"/nDuration of the trip: "+durationInDay+"/nBase price: "+basePrice+"/n Client: "+client.toString());
		
	}
	
	
	//additionnal methods, optional
	public String getTripType() {
		
	}
	public double getDistance() {
		
	}

}
