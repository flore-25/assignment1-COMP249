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
	private Accommodation accommodation=null;
	private Transport transport=null;
	
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
		double totalcost=basePrice;
		if (accommodation!=null)
			totalcost+=accommodation.calculateCostPerNight()*durationInDay;
		if(transport!=null)
			totalcost+=transport.calculateCost();
		return(totalcost);
	}
	
	public static void mostExpensiveTrip(Trip [] t) {
		double max=0.0;
		Trip mostExpensive=null;
		for (int i=0; i<t.length;i++) {
			if (t[i]!=null)
				if (t[i].calculateTotalCost()>max) {
				max=t[i].calculateTotalCost();
				mostExpensive=t[i];
				}
		}
		System.out.println("The most expensive trip is TRIP #"+mostExpensive.getTripId()+"\ntotal cost of the trip: "+max+"\n"+mostExpensive);
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
	
	public void setAccommodation(Accommodation a) {
		accommodation=a;
	}
	
	public void setTransport(Transport t) {
		transport=t;
	}
	
	public Accommodation getAccommodation() {
		return accommodation;
	}
	
	public Transport getTransport() {
		return transport;
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
		return("destination: "+destination+"\nDuration of the trip: "+durationInDay+"\nBase price: "+basePrice+"\nAssociated client: "+client.toString());
		
	}
	
	

}
