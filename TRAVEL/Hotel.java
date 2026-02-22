package TRAVEL;

public class Hotel extends Accommodation {

private int starRating;
	
	public Hotel() { //default constructor
		super();
		starRating= 0;
	}

	public Hotel (String name, String locationCity, double pricePerNight,int starRating) { //parameterized constructor
		super(name, locationCity, pricePerNight); //calling the parameterized constructor of the Accommodation class
		this.starRating = starRating ;
	}
	
	public Hotel (Hotel other) {//copy constructor
		super(other);
		this.starRating = other.starRating ;
	}
	public int getStarRating() {
		return starRating;
	}
		
	@Override
	public double calculateCostPerNight() {
		return (super.getPricePerNight()*1.1);
	}
	@Override
	public String toString() {
	return super.toString()+ "\n" 
	+ "Star rating: "+ starRating; //calls the parent's (Accommodation) toString
	}

	public boolean equals(Hotel other) {
		if (other == null) 
			return false;
		else if (!super.equals(other))
			return false;
		else if(starRating==other.starRating)
			return true;
		return false;

	}
	
}
	
