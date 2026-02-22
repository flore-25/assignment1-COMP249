package TRAVEL;

public abstract class Accommodation {
	private String accommodationID;
	private static int idCounter = 4001;
	private String name;
	private String locationCity;
	private double pricePerNight;

	
	public Accommodation() {//default constructor
		accommodationID = "A"+idCounter;
        name = "";
		locationCity = "";
		pricePerNight = 0.0;
		idCounter++; // ID has to be incremented in each constructor!
	}
	
	public Accommodation (String name, String locationCity, double pricePerNight) { //parameterized constructor
		accommodationID = "A"+idCounter;
		this.name = name;
		this.locationCity = locationCity;
		this.pricePerNight = pricePerNight;
		idCounter++;
		
		
	}
	
	public Accommodation (Accommodation other) { //copy constructor
		accommodationID = "A"+idCounter;
		this.name = other.name;
		this.locationCity = other.locationCity;
		this.pricePerNight = other.pricePerNight;
		idCounter++;
		
	}
	//this method has to be defined in Hotel and Hostel child classes
	public abstract double calculateCostPerNight();

	public String getAccommodationID() {
		return accommodationID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	public String toString(){
		return ("ID number: " + accommodationID + "\n"
				+"Name: "+ name +"\n"
				+"City: "+ locationCity + "\n"
				+"Price per night: " + pricePerNight);
	}
	
	@Override
	public boolean equals (Object other) {
		if (other == null) 
			return false;
		if (this.getClass() != other.getClass())
			return false;
				if (name.equalsIgnoreCase(((Accommodation)other).name)&& locationCity.equalsIgnoreCase(((Accommodation)other).locationCity)&& pricePerNight==((Accommodation)other).pricePerNight) 
			return true;
		return false;

	
	}
}

