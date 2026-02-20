package DRIVER;

import java.util.Scanner;
import CLIENT.Client;
import TRAVEL.Accommodation;
import TRAVEL.Hotel;
import TRAVEL.Hostel;
import TRAVEL.Transport;
import TRAVEL.Flight;
import TRAVEL.Train;
import TRAVEL.Bus;
import TRAVEL.Trip;


public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//------------------------------------------------------------------------------------------------------------ 
		//Assignment 1 - COMP 249
		//Question: Driver for SmartTravel program
		//Written by: Florence Simard (40136888) and Angelina Yajaira Montano (40344724)
		//------------------------------------------------------------------------------------------------------------ 
		
		
		int menuChoice;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to SmartTravel ");
		Client [] client = new Client[20];
		Transport[] transport = new Transport[20];
		Trip [] trip = new Trip[20];
		Accommodation [] accommodation = new Accommodation[20];
		
		
		do {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
					+ "| 1  >> Access the main menu                                                                   |\n"
					+ "| 2  >> Testing mode                                                                           |\n"
					+ "| 3  >> Exit program                                                                           |\n"
					+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.print("Please enter your choice and press <Enter>: ");
			menuChoice = keyboard.nextInt();
			switch (menuChoice) {
			case 1:{
				//mainMenu actual program
				int subMenuChoice;
				do {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
							+ "| 1  >> Client Management                                                                      |\n"
							+ "| 2  >> Trip Management                                                                        |\n"
							+ "| 3  >> Transportation Management                                                              |\n"   
							+ "| 4  >> Accommodation Management                                                               |\n"                           
							+ "| 5  >> Additional Operations                                                                  |\n"                           
							+ "| 6  >> Generate Visualization                                                                 |\n"                           
							+ "| 7  >> Quit this menu                                                                         |\n"
							+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
					System.out.print("Please enter your choice and press <Enter>: ");
					subMenuChoice = keyboard.nextInt();
					
					// validate user input
					while ((subMenuChoice<1) || (subMenuChoice>7)) {
						System.out.println("Sorry that is not a valid choice. Try again.");
						System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
								+ "| 1  >> Client Management                                                                      |\n"
								+ "| 2  >> Trip Management                                                                        |\n"
								+ "| 3  >> Transportation Management                                                              |\n"   
								+ "| 4  >> Accommodation Management                                                               |\n"                           
								+ "| 5  >> additional Operations                                                                  |\n"                           
								+ "| 6  >> Generate Visualization                                                                 |\n"                           
								+ "| 7  >> Quit this menu                                                                         |\n"
								+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
						System.out.print("Please enter your choice and press <Enter>: ");
						subMenuChoice = keyboard.nextInt();				
					}
					
					switch (subMenuChoice) {
					case 1:
						int subsubMenuChoice;
						//client management
						do{
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| You are managing clients, what do you want to do?                                            |\n"
									+ "| 1  >> add a client                                                                           |\n"
									+ "| 2  >> edit a client                                                                          |\n"   
									+ "| 3  >> delete a client                                                                        |\n"                           
									+ "| 4  >> list all clients                                                                       |\n"     
									+ "| 5  >> return to main menu                                                                    |\n" 
									+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
							System.out.print("Please enter your choice and press <Enter>: ");
							subsubMenuChoice = keyboard.nextInt();
							
							switch (subsubMenuChoice) {
							case 1:
								//subsubMenu add client
								System.out.print("What is the first name of the new client? ");
								String firstName=keyboard.next();
								System.out.print("What is the last name of the new client? ");
								String lastName=keyboard.next();
								System.out.print("What is the email address of the new client? ");
								String email=keyboard.next();
								//parse through array and overwrite first null object
								for (int i=0;i<client.length;i++) {
									if (client[i]==null) {
										client[i]= new Client(firstName,lastName,email);
										break;
									}
								}
								break;
							case 2:
								//subsubMenu edit client
								//edit client includes subsubsubmenu 
								int subsubsubmenu;
								System.out.print("What is the id of the client you want to edit? ");
								String editId =keyboard.next();
								do {
								System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
										+ "| You are currently editing client #"+editId+"                                                 |\n"
										+ "| 1  >> edit first name                                                                        |\n"
										+ "| 2  >> edit last name                                                                         |\n"   
										+ "| 3  >> edit email address                                                                     |\n"                           
										+ "| 4  >> I'm done editing client #"+editId+"                                                    |\n" 
										+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
								System.out.print("What do you want to do? ");
								subsubsubmenu=keyboard.nextInt(); 
								switch (subsubsubmenu){
									case 1:
										//edit first name
										System.out.print("What is the new first name ? ");
										String newFirstName =keyboard.next();
										for (int i=0;i<client.length;i++) {
											if (client[i].getClientId().equalsIgnoreCase(editId)) {
												client[i].setFirstName(newFirstName);
												break;
											}
										}
										break;
										
									case 2:
										//edit last name
										System.out.print("What is the new last name ? ");
										String newLastName =keyboard.next();
										for (int i=0;i<client.length;i++) {
											if (client[i].getClientId().equalsIgnoreCase(editId)) {
												client[i].setLastName(newLastName);
												break;
											}
										}
										break;
										
									case 3:
										//edit email name
										System.out.print("What is the new email ? ");
										String newEmail =keyboard.next();
										for (int i=0;i<client.length;i++) {
											if (client[i].getClientId().equalsIgnoreCase(editId)) {
												client[i].setEmail(newEmail);
												break;
											}
										}
										break;
										
									case 4:
										subsubsubmenu=4;
								}
				
								} while (subsubsubmenu!=4);
								break;
							case 3:
								//subsubMenu delete client
								System.out.print("What is the id of the client you want to remove? ");
								String id =keyboard.next();
								for (int i=0;i<client.length;i++) {
									if (client[i].getClientId().equalsIgnoreCase(id)) {
										client[i]=null;
										break;
									}
								}
								break;
							case 4:
								//subsubMenu list all clients
								for (int i=0;i<client.length;i++) {
									if (client[i]!=null) {
										System.out.println(client[i]);
									}
								}
								break;
							
							case 5: subsubMenuChoice=5;
							}
							
						} while (subsubMenuChoice!=5);
					case 2:
						//subMenu trip management
						
						
						break;
					case 3:
						//subMenu transportation management
						
						int subMenuTransportation;
						do{
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| You are managing transportation options, what do you want to do?                                             |\n"
									+ "| 1  >> add a transportation option                                                                         |\n"
									+ "| 2  >> remove a transportation option                                                                        |\n"                            
									+ "| 3  >> list all transportation options by type (Flight, Train, Bus)                                                   |\n"     
									+ "| 4  >> return to main menu                                                                            |\n" 
									+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
							System.out.print("Please enter your choice and press <Enter>: ");
							subMenuTransportation = keyboard.nextInt();
							switch (subMenuTransportation) {
							case 1:
								//subMenuTransportation add a transportation option
								System.out.print("What is the company name? ");
								String companyName=keyboard.next();
								System.out.print("What is the departure city? ");
								String departureCity=keyboard.next();
								System.out.print("What is the  arrival city?");
								String arrivalCity =keyboard.next();
								System.out.print("There are three types of transportation optiones available:Flight, Train and Bus. Which type do you wish to add? "
										+ "+ Please enter your choice and press <Enter>: ");
								String transportChoice = keyboard.next();
								if (transportChoice.equalsIgnoreCase("Flight")) {
									System.out.print("What is the name of the airline? ");
									String airlineName =keyboard.next();
									System.out.print("What is the name of the airline? ");
									double luggageAllowance =keyboard.nextDouble();
									//parse through array and overwrite first null object
									for (int i=0;i<transport.length;i++) {
										if (transport[i]==null) {
											transport[i]= new Flight(companyName,departureCity,arrivalCity,airlineName,luggageAllowance);
											
								}}}
								else if (transportChoice.equalsIgnoreCase("Train")) {
									System.out.print("What is the type of the train? ");
									String trainType=keyboard.next();
									System.out.print("What is the class of the seat? ");
									char seatClass=keyboard.next().charAt(0);
									//parse through array and overwrite first null object
									for (int i=0;i<transport.length;i++) {
										if (transport[i]==null) {
											transport[i]= new Train(companyName,departureCity,arrivalCity,trainType,seatClass);
										}}}
								
								else if (transportChoice.equalsIgnoreCase("Bus")) {
									System.out.print("What is the bus company? ");
									String busCompany=keyboard.next();
									System.out.print("What is the number of seats? ");
									int numberOfSeats=keyboard.nextInt();
									//parse through array and overwrite first null object
									for (int i=0;i<transport.length;i++) {
										if (transport[i]==null) {
											transport[i]= new Bus(companyName,departureCity,arrivalCity,busCompany,numberOfSeats);
										}}
									}
								
										break;
							case 2:
								//subMenuTransportation remove a transportation option
								System.out.print("What is the id of the transportation option you want to remove? ");
								String transportIDToRemove =keyboard.next();
								for (int i=0;i<transport.length;i++) {
									if (transport[i].getTransportID().equalsIgnoreCase(transportIDToRemove)) {
										transport[i]=null;
									}}
										break;
						    case 3:
						    	//subMenuTransportation  list all transportation options by type (Flight, Train, Bus) 
						    	for (int i=0;i<transport.length;i++) {
									if (transport[i]!=null) {
										System.out.println(transport[i]);
									}break;
								}		

						break;
					case 4:
						//subMenu accommodation management
						int subMenuAccommodation;
						do{
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| You are managing accommodations, what do you want to do?                                             |\n"
									+ "| 1  >> add an accommodation                                                                           |\n"
									+ "| 2  >> remove an accommodation                                                                        |\n"                            
									+ "| 4  >> list all accommodation by type (Hotel, Hostel)                                                    |\n"     
									+ "| 5  >> return to main menu                                                                            |\n" 
									+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
							System.out.print("Please enter your choice and press <Enter>: ");
							subMenuAccommodation = keyboard.nextInt();
							
							switch (subMenuAccommodation) {
							case 1:
								//subMenuAccommodation add an accommodation
								System.out.print("What is the name of the accommodation? ");
								String name=keyboard.next();
								System.out.print("What is the location? ");
								String locationCity=keyboard.next();
								System.out.print("What is the price per night? ");
								double pricePerNight=keyboard.nextDouble();
								System.out.print("There are two types of accommodation available: Hotel or Hostel. Which type do you wish to add? "
										+ "+ Please enter your choice and press <Enter>: ");
								String accommodationChoice = keyboard.next();
								if (accommodationChoice.equalsIgnoreCase("Hotel")) {
									System.out.print("What is the star rating? ");
									int starRating =keyboard.nextInt();
									//parse through array and overwrite first null object
									for (int i=0;i<accommodation.length;i++) {
										if (accommodation[i]==null) {
											accommodation[i]= new Hotel(name,locationCity,pricePerNight,starRating);
											
								}}}
								else if (accommodationChoice.equalsIgnoreCase("Hostel")) {
									System.out.print("What is the number of shared beds per room? ");
									int nbSharedBedsPerRoom=keyboard.nextInt();
									//parse through array and overwrite first null object
									for (int i=0;i<accommodation.length;i++) {
										if (accommodation[i]==null) {
											accommodation[i]= new Hotel(name,locationCity,pricePerNight,nbSharedBedsPerRoom);
										}}}
								
				
			
										break;
							case 2:
								//subMenuAccommodation remove an accommodation
								System.out.print("What is the id of the accommodation you want to remove? ");
								String accommodationIDToRemove =keyboard.next();
								for (int i=0;i<accommodation.length;i++) {
									if (accommodation[i].getAccommodationID().equalsIgnoreCase(accommodationIDToRemove)) {
										accommodation[i]=null;
									}}
										break;
						    case 3:
						    	//subMenuAccommodation list all accommodation types (Hotel,Hostel)
						    	for (int i=0;i<accommodation.length;i++) {
									if (accommodation[i]!=null) {
										System.out.println(accommodation[i]);
									}
									break;
								}		
						break;
					case 5:
						//additionnal operations
						break;
					case 6:
						//subMenu visualization
						break;
					case 7: subMenuChoice=7;
					}
				
				

				} while (subMenuChoice!=7);
				break;
				
				}
			case 2: //mainMenu testing mode (predefined scenario)
				
				{   //creating objects with fictional values
					Client c1 = new Client("Alice", "Johnson", "alice.johnson@example.com");
				    Client c2 = new Client("Mark", "Thompson", "mark.thompson@example.com");
				    Client c3 = new Client("Sophie", "Williams", "sophie.williams@example.com");
		
				    Trip t1 = new Trip("Paris",7,1200.0,c1);
				    Trip t2 = new Trip("New York",5,900.0,c2);
				    Trip t3 = new Trip("London",10,2000.0,c3);
				    
				    
				    Flight f1 = new Flight("AirExpress","Montreal", "Sydney", "AirExpress", 23.5 );
				    Flight f2 = new Flight("SkyHigh", "Laval", "Tokyo", "SkyHigh", 25.5);
				    Flight f3 = new Flight("SkyHigh", "Laval", "Tokyo", "SkyHigh", 25.5);
				    
				    Train train1 = new Train("USATrack","Boston","Los Angeles","high-speed",'E');
				    Train train2 = new Train("ViaRail","Quebec","Vancouver", "regional", 'B');
				    
				    
				    Bus b1 = new Bus("GreyHound","Toronto", "Denver", "GreyHound",30);
				    Bus b2 = new Bus("FlixBus","Ottawa","Chicago", "FlixBus",67);
				    
				    
				    Hotel hotel1 = new Hotel("Safari Grand Hotel","Nairobi",150.0,8);
				    Hotel hotel2 = new Hotel("Rome Suites","Rome",200.0, 4);
				    
				    Hostel hostel1 = new Hostel("Budget Stay", "Berlin", 30.0, 10);
				    Hostel hostel2 = new Hostel("Youth Lodge", "Madrid", 25.0, 12);
				    
				    //printing all created objects with toString()
				    
				    System.out.println(c1.toString());
				    System.out.println(c2.toString());
				    System.out.println(c3.toString());
				    
				    System.out.println(t1.toString());
				    System.out.println(t2.toString());
				    System.out.println(t3.toString());
				    
				    System.out.println(f1.toString());
				    System.out.println(f2.toString());
				    System.out.println(f3.toString());
				    
				    System.out.println(train1.toString());
				    System.out.println(train2.toString());
				    
				    System.out.println(b1.toString());
				    System.out.println(b2.toString());
				    
				    System.out.println(hotel1.toString());
				    System.out.println(hotel2.toString());
				    
				    System.out.println(hostel1.toString());
				    System.out.println(hostel2.toString());
				 
				    //compare objects from different classes
				  
				    c1.equals(t1);

				    train1.equals(b1);
				    train2.equals(b2);
				    
				    //compare objects of the same class with and with different attributes and with identical attributes
				    
				    f1.equals(f2);
				    f2.equals(f3);
				    
				    //Fill arrays for: Clients, Tripps, Transportation options, Accommodations
				    
				    Client [] clientTest = new Client [10];
				    
				    client = {c1,c2,c3};
				  
				    
				    Trip [] tripTest = new Trip[10];
				    
				    trip  = {t1,t2,t3};
				  
				    
				    Transport[] transportTest = new Transport[15];
				    
				    transportTest = {f1,f2,train1,train2,b1,b2};
				    
				    Accommodation [] accommodationTest = new Accommodation[15];
				    
				    accommodationTest = {hotel1, hotel2, hostel1, hostel2};
				    
				    double totalCostForTransport;
				    for (int i =0; i < transport.length;i++) {
				    	
				    	totalCostForTransport += transport[i].calculateCost(1050);
				    }
				    
				    double totalCostForAccommodation;
                    for (int i =0; i < accommodation.length;i++) {
				    	totalCostForAccommodation += accommodation[i].calculateCost(15);
				    }
				}
				
				}
					
				
				
			}
				
				break;
				}
			case 3:{
				System.out.println("Thank you for using SmartTravel! See you soon.");
				menuChoice=3;
				}
			}
		
			
		} while (menuChoice!=3);
		

}

