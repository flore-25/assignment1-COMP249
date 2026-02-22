package TRAVEL;

public class Train extends Transport {
	private String trainType;
	private char seatClass;
	private double fare =50;
	
	public Train() { //default constructor
		trainType = "";
		seatClass = ' ';
	}

	public Train (String companyName, String departureCity, String arrivalCity,String trainType,char seatClass) { //parameterized constructor
		super(companyName, departureCity, arrivalCity); //calling the parameterized constructor of the Transport class
		this.trainType = trainType;
		this.seatClass = seatClass;
	}
	
	public Train(Train other) {//copy constructor
		super(other);
		this.trainType= other.trainType;
		this.seatClass= other.seatClass;
	}
		
		
	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public char getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(char seatClass) {
		this.seatClass = seatClass;
	}

	@Override
	public double calculateCost() {
		double cost=0;
		switch(seatClass) {
		case 'a': cost=fare*2.5;
			break;
		case 'b': cost=fare*2;
			break;
		case 'c': cost=fare*1.5;
			break;
		case 'd':cost=fare;
		}
		return cost;
	}
	
	@Override
	public String toString() {
	return super.toString()+ "\n" 
	+ "Train type: "+ trainType + "\n" 
	+ "Seat class: "+ seatClass; 
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null) 
			return false;
		else if (!super.equals(other))
			return false;
		else if ((trainType.equalsIgnoreCase(((Train)other).trainType))&&(seatClass==((Train)other).seatClass))
			return true;
		return false;
	}
	
}

