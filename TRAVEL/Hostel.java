package TRAVEL;

public class Hostel extends Accommodation {

	private int nbSharedBedsPerRoom;
	
	
	public Hostel() { //default constructor
		nbSharedBedsPerRoom = 0;
	}

	public Hostel (String name, String locationCity, double pricePerNight,int nbSharedBedsPerRoom) { //parameterized constructor
		super(name, locationCity, pricePerNight); //calling the parameterized constructor of the Accommodation class
		this.nbSharedBedsPerRoom = nbSharedBedsPerRoom ;
	}
	public double calculateCost(int nbOfDays) { 
		return 0;
	}

	public int getNbSharedBedsPerRoom() {
		return nbSharedBedsPerRoom;
	}

	public void setNbSharedBedsPerRoom(int nbSharedBedsPerRoom) {
		this.nbSharedBedsPerRoom = nbSharedBedsPerRoom;
	}
	@Override
	public String toString() {
	return super.toString()+ "/n " 
	+ "Number of shared beds per room: "+ nbSharedBedsPerRoom; //calls the parent's (Accommodation) toString
	}
	@Override
	public boolean equals (Hostel other) {
		return super.equals(Accommodation other);
		if (other == null) 
			return false;
		
		if (this.getClass()!= other.getClass()) 
			return false;
		
		if (this.name.equalsIgnoreCase(other.name)&& this.locationCity.equalsIgnoreCase(other.locationCity)&& this.pricePerNight == other.pricePerNight) 
			return true;
	
		return false;

	
	}
	
		
}
