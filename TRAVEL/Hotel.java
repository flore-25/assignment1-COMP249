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
	
	public int getStarRating() {
		return starRating;
	}
		
	
	public double calculateCost(int nbOfDays) {
		return super.getPricePerNight()*nbOfDays*0.15;
	}
	@Override
	public String toString() {
	return super.toString()+ "/n " 
	+ "Star rating: "+ starRating; //calls the parent's (Accommodation) toString
	}
	@Override
	public boolean equals(Accommodation other) {
		
		if (other == null) 
			return false;
		
		else if (!super.equals(other))
			return false;
		
		else if(getClass()!= other.getClass())
			
			return false;
		else
		{ 
			Hotel o = (Hotel) other;
			return this.starRating == o.starRating;
		}

	
	
	}}
	
