package TRAVEL;

public class Train extends Transport {
	
		private String trainType;
		private char seatClass;
		
		public Train() { //default constructor
			trainType = "";
			seatClass = ' ';
		}

		public Train (String companyName, String departureCity, String arrivalCity) { //parameterized constructor
			super(companyName, departureCity, arrivalCity); //calling the parameterized constructor of the Transport class
			this.trainType = trainType;
			this.seatClass = seatClass;
		}
		
	
			
		@Override
		public double calculateCost(int km) {
			return 0.28*km; //fictional value for fare price
		}
		@Override
		public String toString() {
		return super.toString()+ "/n " 
		+ "Train type: "+ trainType
		+ "Seat class: "+ seatClass; //calls the parent's (Transport) toString
		}
		@Override
		public boolean equals (Transport other) {
			
			if (other == null) 
				return false;
			
			if (!super.equals(other))
				return false;
				
			if (this.getClass()!= other.getClass()) 
				return false;
			
			if (this.getCompanyName().equalsIgnoreCase(other.getCompanyName())&& this.getDepartureCity().equalsIgnoreCase(other.getDepartureCity())&& this.getArrivalCity() == other.getArrivalCity())
				return true;
		
			return false;

		
		}
		
			
	}


