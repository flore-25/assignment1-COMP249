package CLIENT;

public class Client {
	//all idCounter are static
	private String clientID; 
	private static int idCounter=1001;
	private String firstName;
	private String lastName;
	private String emailAddress;
	

	//make sure EACH constructors increment idCounter, AFTER AFTER assigning clientID
	public Client() {
		clientID="C"+idCounter;
		firstName=null;
		lastName=null;
		emailAddress=null;
		idCounter++;
	}
	
	public Client(String firstName, String lastName, String emailAddress) {
		clientID="C"+idCounter;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailAddress=emailAddress;
		idCounter++;
		
	}
	
	public Client(Client other) {
		clientID="C"+idCounter;
		this.emailAddress=other.emailAddress;
		this.firstName=other.firstName;
		this.lastName=other.lastName;
		idCounter++;
	}
	public String getClientId() {
		return clientID;
	}


	public String getFirstName() {
		return firstName;
	}
	
	public String getEmail() {
		return emailAddress;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	//the user CANNOT set the ID, no setID
	public void setLastName(String newLastName) {
		lastName=newLastName;
	}
	
	public void setFirstName(String newFirstName) {
		firstName=newFirstName;
	}

	public void setEmail(String newEmail) {
		emailAddress=newEmail;
	}
	
	public String toString() {
		return(firstName+" "+lastName+" ,@ "+emailAddress);
	}
	
	//making sure the other object is not null, then making sure it is of the Client class, and finally making sure all attributes are equal (except ID)
	//do not compare IDs in equals methods
	public boolean equals(Client other) {
		if (other==null)
			return (false);
		if (other.getClass()!=this.getClass())
			return(false);
		if ((this.emailAddress.equalsIgnoreCase(other.emailAddress))&&(this.firstName.equalsIgnoreCase(other.firstName))&&(this.lastName.equalsIgnoreCase(other.lastName)))
			return(true);
		return false;

	}

			
	
	
}
