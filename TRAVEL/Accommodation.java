package TRAVEL;

public abstract class Accommodation {
	private String accommodationID;
	private int idCounter = 4001;
	private String name;
	private String locationCity;
	private double pricePerNight;
	
	public Accommodation() {
		
		accommodationID = "";
		idCounter = 4001;
		name = "";
		locationCity = "";
		pricePerNight = 0;
		idCounter++; // ID has to be incremented in each constructor
	}
	
	public Accommodation (String accommodationID, int idCounter) {
		accommodationID = "A"+idCounter;
		idCounter++;
		
		
	}
	
	
	public abstract double calculateCost(int nbOfDays);

	public String getAccommodationID() {
		return accommodationID;
	}

	public void setAccommodationID(String accommodationID) {
		this.accommodationID = accommodationID;
	}

	public int getIdCounter() {
		return idCounter;
	}

	public void setIdCounter(int idCounter) {
		this.idCounter = idCounter;
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
	
	public boolean equals (Accommodation obj) {
		if (this == obj) {
			return true;
		}
		else 
			return false;
	}
	
	public String toString();
	
		

	}

	
	

