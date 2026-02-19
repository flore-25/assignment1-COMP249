package TRAVEL;

public class Train extends Transport {
	
		private String trainType;
		private char seatClass;
		
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
		public boolean equals(Transport other) {
			
			if (other == null) 
				return false;
			
			else if (!super.equals(other))
				return false;
			
			else if(getClass()!= other.getClass())
				
				return false;
			else
			{ 
				Train o = (Train) other;
				return this.trainType == o.trainType && this.seatClass == o.seatClass;
			}

		
		
		}}
		

