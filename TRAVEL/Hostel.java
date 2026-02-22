package TRAVEL;

public class Hostel extends Accommodation{

private int nbSharedBedsPerRoom;
	
	
	public Hostel() { //default constructor
		nbSharedBedsPerRoom = 0;
	}

	public Hostel (String name, String locationCity, double pricePerNight,int nbSharedBedsPerRoom) { //parameterized constructor
		super(name, locationCity, pricePerNight); //calling the parameterized constructor of the Accommodation class
		this.nbSharedBedsPerRoom = nbSharedBedsPerRoom ;
	}
	
	
	public Hostel (Hostel other) {//copy constructor
		super(other);
		this.nbSharedBedsPerRoom = other.nbSharedBedsPerRoom ;
	}
	
	public int getNbSharedBedsPerRoom() {
		return nbSharedBedsPerRoom;
	}

	public void setNbSharedBedsPerRoom(int nbSharedBedsPerRoom) {
		this.nbSharedBedsPerRoom = nbSharedBedsPerRoom;
		
	}
	@Override
	public double calculateCostPerNight() {
		return (super.getPricePerNight()*.90);
	}
	@Override
	public String toString() {
	return super.toString()+ "\n" 
	+ "Number of shared beds per room: "+ nbSharedBedsPerRoom; //calls the parent's (Accommodation) toString
	}

	public boolean equals(Hostel other) {
		if (other == null) 
			return false;
		else if (!super.equals(other))
			return false;
		else if (nbSharedBedsPerRoom==other.nbSharedBedsPerRoom)
			return true;
		return false;
	}

	
	
	
	
		
}