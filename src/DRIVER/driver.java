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
		int subMenuChoice;
		int subsubMenuChoice;
		int subsubsubmenu;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to SmartTravel ");
		Client [] client = new Client[20];
		Transport[] transport = new Transport[20];
		Trip [] trip = new Trip[20];
		Accommodation [] accommodation = new Accommodation[20];
		
		
		do {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
					+ "| 1  >> Access the program                                                                     |\n"
					+ "| 2  >> Testing mode                                                                           |\n"
					+ "| 3  >> Exit program                                                                           |\n"
					+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.print("Please enter your choice and press <Enter>: ");
			menuChoice = keyboard.nextInt();
			switch (menuChoice) {
			case 1:{
				//mainMenu actual program
				do {
					subMenuChoice=0;
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
							+ "| 1  >> Client Management                                                                      |\n"
							+ "| 2  >> Trip Management                                                                        |\n"
							+ "| 3  >> Transportation Management                                                              |\n"   
							+ "| 4  >> Accommodation Management                                                               |\n"                           
							+ "| 5  >> additional Operations                                                                  |\n"                           
							+ "| 6  >> Generate Visualization                                                                 |\n"                           
							+ "| 7  >> Return to main menu                                                                    |\n"
							+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
					System.out.print("Please enter your choice and press <Enter>: ");
					subMenuChoice = keyboard.nextInt();
					
					switch (subMenuChoice) {
					case 1:
						subsubMenuChoice=0;
						//we are in option 1 of subMenu : client management
						do{
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| You are managing clients, what do you want to do?                                            |\n"
									+ "| 1  >> add a client                                                                           |\n"
									+ "| 2  >> edit a client                                                                          |\n"   
									+ "| 3  >> delete a client                                                                        |\n"                           
									+ "| 4  >> list all clients                                                                       |\n"     
									+ "| 5  >> return to precedent menu                                                               |\n" 
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
								subsubsubmenu=0;
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
						break;
					case 2:
						//we are in option 2 of subMenu : trip management
						subsubMenuChoice=0;
						do{
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| You are managing trips, what do you want to do?                                              |\n"
									+ "| 1  >> Create a trip                                                                          |\n"
									+ "| 2  >> Edit trip information                                                                  |\n"   
									+ "| 3  >> Cancel a trip                                                                          |\n"                           
									+ "| 4  >> list all trips                                                                         |\n" 
									+ "| 5  >> list all trips for a specific client                                                   |\n"    
									+ "| 6  >> return to precedent menu                                                               |\n" 
									+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
							System.out.print("Please enter your choice and press <Enter>: ");
							subsubMenuChoice = keyboard.nextInt();

							switch (subsubMenuChoice) {
							case 1:
								//create trip
								System.out.print("What is the trip destination? ");
								String destination = keyboard.next();
								System.out.print("What is the trip duration (in days)? ");
								int duration = keyboard.nextInt();
								System.out.print("What is the base price? ");
								double basePrise = keyboard.nextDouble();
								System.out.print("What is the id of the client associated to that trip? ");
								String cId=keyboard.next();
								boolean flag=false;
								
								for (int i=0; i<client.length; i++) {
								    if ((client[i]!=null) && (client[i].getClientId().equalsIgnoreCase(cId))) {
								        for (int j= 0; j<trip.length; j++) {
								            if (trip[j]==null) {
								                trip[j]=new Trip(destination,duration,basePrise,client[i]);
								                flag = true;
								                break;
								            }
								        }
								        break; // also exit the i loop once client is found
								    }
								}
								if (!flag) {
								    System.out.println("No matching client found or trip array is full.");
								}

								break;
							case 2:
								//edit trip subsubsubmenu
								subsubsubmenu=0;
								System.out.print("What is the id of the trip you want to edit? ");
								String editTripId =keyboard.next();
								do {
								System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
										+ "| You are currently editing trip #"+editTripId+"                                                 |\n"
										+ "| 1  >> edit destination                                                                       |\n"
										+ "| 2  >> edit duration of the trip                                                              |\n"   
										+ "| 3  >> edit base price                                                                        |\n"   
										+ "| 4  >> edit associated client                                                                 |\n"                           
										+ "| 5  >> I'm done editing trip #"+editTripId+"                                                    |\n" 
										+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
								System.out.print("What do you want to do? ");
								subsubsubmenu=keyboard.nextInt(); 
								switch (subsubsubmenu){
									case 1:
										//edit destination
										System.out.print("What is the new destination ? ");
										String newDestination =keyboard.next();
										for (int i=0;i<trip.length;i++) {
											if (trip[i]!=null) {
													if (trip[i].getTripId().equalsIgnoreCase(editTripId)) {
														trip[i].setDestination(newDestination);
														break;}
													break;
											}
										}
										break;
										
									case 2:
										//edit duration of the trip 
										System.out.print("What is the new duration of the trip (in days) ? ");
										int newDuration =keyboard.nextInt();
										for (int i=0;i<trip.length;i++) {
											if (trip[i]!=null) {
												if (trip[i].getTripId().equalsIgnoreCase(editTripId)) {
												trip[i].setDurationInDay(newDuration);
												break;
												}
											} 
										}
										break;
										
									case 3:
										//edit base price
										System.out.print("What is the new base price for this trip ? ");
										double newBasePrise =keyboard.nextDouble();
										for (int i=0;i<trip.length;i++) {
											if (trip[i]!=null) {
												if (trip[i].getTripId().equalsIgnoreCase(editTripId)) {
													trip[i].setBasePrice(newBasePrise);
													break;}
											}
										}
										break;
										
									case 4:
										//edit associated client 
										System.out.print("What is the id of the client to be associated with that trip ? ");
										String clientID=keyboard.next();
										
										for (int i=0;i<trip.length;i++) {
											if ((trip[i]!=null)&&(trip[i].getTripId().equalsIgnoreCase(editTripId))) {
												for (int j=0;j<client.length;j++) {
													if ((client[j]!=null)&&(client[j].getClientId().equalsIgnoreCase(clientID))) {
														trip[i].setClient(client[j]);
													}
												}
											}
										}
										break;
									case 5: subsubsubmenu=5;
								}
				
								} while (subsubsubmenu!=5);
								break;
							case 3:
								//cancel trip (submenu)
								System.out.print("What is the id of the trip you want to cancel? ");
								String tripId=keyboard.next();
								for (int i=0;i<trip.length;i++) {
									if ((trip[i]!=null)&&(trip[i].getTripId().equalsIgnoreCase(tripId))) {
										trip[i]=null;
										}
									}
								break;
							case 4:
								//list all trips
								for (int i=0;i<trip.length;i++) {
									if (trip[i]!=null) {
										System.out.println("TRIP "+trip[i].getTripId()+"\n"+trip[i]);
										System.out.println();}
									}
								break;
							case 5:
								//list all trips for a specific client
									System.out.print("What is the id of the client you want to see all trips associated to this client? ");
									String clientId=keyboard.next();
									System.out.println("\nTRIPS OF CLIENT "+clientId);
									for (int i=0;i<trip.length;i++) {
										if (trip[i]!=null) {
											if (trip[i].getClient().getClientId().equalsIgnoreCase(clientId)) {
											System.out.println("TRIP "+trip[i].getTripId()+"\n"+trip[i]);
											System.out.println();}
									}}
								break;
							case 6: subsubMenuChoice=6;
							}
						} while (subsubMenuChoice!=6);
						break;
					case 3:
						// we are in option 3 of subMenu : transportation management
						int subMenuTransportation=0;
						do{
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| You are managing transportation options, what do you want to do?                                  |\n"
									+ "| 1  >> add a transportation option                                                                 |\n"
									+ "| 2  >> remove a transportation option                                                              |\n"                            
									+ "| 3  >> list all transportation options by type (Flight, Train, Bus)                                |\n"     
									+ "| 4  >> return to main menu                                                                         |\n" 
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
								System.out.print("There are three types of transportation optiones available: Flight, Train and Bus. Which type do you wish to add? ");
								String transportChoice=keyboard.next();
								System.out.print("This is the transportation for which Trip? Please enter the corresponding tripId: ");
								String associatedTridId = keyboard.next();
								
								if (transportChoice.equalsIgnoreCase("Flight")) {
									System.out.print("What is the name of the airline? ");
									String airlineName =keyboard.next();
									System.out.print("What is the luggage allowance? ");
									double luggageAllowance =keyboard.nextDouble();
									//parse through array and overwrite first null object
									for (int i = 0; i < transport.length; i++) {
									    if (transport[i] == null) {
									    	transport[i] = new Flight(companyName,departureCity,arrivalCity,airlineName,luggageAllowance);
									        for (int j=0; j<trip.length; j++) {
									            if (trip[j] != null && trip[j].getTripId().equalsIgnoreCase(associatedTridId)) {
									                trip[j].setTransport(transport[i]);;
									                break; // breaks inner j loop
									            }
									        }
									        break; // breaks outer i loop
									    }
									}}
								
								else if (transportChoice.equalsIgnoreCase("Train")) {
									System.out.print("What is the type of the train? (high-speed, Inter-City Rail, Monorail, etc) ");
									String trainType=keyboard.next();
									System.out.print("What is the class of the seat? (a,b,c or d)");
									char seatClass=keyboard.next().charAt(0);
									//parse through array and overwrite first null object
									for (int i = 0; i < transport.length; i++) {
									    if (transport[i] == null) {
									    	transport[i] = new Train(companyName,departureCity,arrivalCity,trainType,seatClass);
									        for (int j=0; j<trip.length; j++) {
									            if (trip[j] != null && trip[j].getTripId().equalsIgnoreCase(associatedTridId)) {
									                trip[j].setTransport(transport[i]);;
									                break; // breaks inner j loop
									            }
									        }
									        break; // breaks outer i loop
									    }
									}}
								
								else if (transportChoice.equalsIgnoreCase("Bus")) {
									System.out.print("What is the bus company? ");
									String busCompany=keyboard.next();
									System.out.print("What is the number of stops? ");
									int numberOfStops=keyboard.nextInt();
									//parse through array and overwrite first null object
									for (int i = 0; i < transport.length; i++) {
									    if (transport[i] == null) {
									    	transport[i] = new Bus(companyName,departureCity,arrivalCity,busCompany,numberOfStops);
									        for (int j=0; j<trip.length; j++) {
									            if (trip[j] != null && trip[j].getTripId().equalsIgnoreCase(associatedTridId)) {
									                trip[j].setTransport(transport[i]);;
									                break; // breaks inner j loop
									            }
									        }
									        break; // breaks outer i loop
									    }
									}}
								else
									System.out.println("Not a valid transportation type");
										
								break;
							case 2:
								//subMenuTransportation remove a transportation option
								System.out.print("What is the id of the transportation option you want to remove? ");
								String transportIDToRemove =keyboard.next();
								for (int i=0;i<transport.length;i++) {
									if (transport[i]!=null)
										if (transport[i].getTransportID().equalsIgnoreCase(transportIDToRemove)) {
											transport[i]=null;
											break;
									}}
										break;
						    case 3:
						    	//subMenuTransportation  list all transportation options by type (Flight, Train, Bus) 
						    	System.out.println("ALL FLIGHTS");
						    	for (int i=0;i<transport.length;i++) {
									if (transport[i]!=null) {
										if (transport[i].getClass()==Flight.class){
											System.out.println((Flight)transport[i]);
										}
									}
								}
						    	
						    	System.out.println("\nALL TRAINS");
						    	for (int i=0;i<transport.length;i++) {
									if (transport[i]!=null) {
										if (transport[i].getClass()==Train.class){
											System.out.println((Train)transport[i]);
										}
									}
								}
						    	
						    	System.out.println("\nALL BUSES");
						    	for (int i=0;i<transport.length;i++) {
									if (transport[i]!=null) {
										if (transport[i].getClass()==Bus.class){
											System.out.println((Bus)transport[i]);
										}
									}
								}
						    	break;
						    case 4: subMenuTransportation=4;
							}
							} while (subMenuTransportation!=4);
						break; //for case 3 main menu
					case 4:
						//we are in option 4 of subMenu : accommodation management
						int subMenuAccommodation=0;
						do{
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| You are managing accommodations, what do you want to do?                                       |\n"
									+ "| 1  >> add an accommodation                                                                     |\n"
									+ "| 2  >> remove an accommodation                                                                  |\n"                            
									+ "| 3  >> list all accommodation by type (Hotel, Hostel)                                           |\n"     
									+ "| 4  >> return to precedent menu                                                                 |\n" 
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
								System.out.print("There are two types of accommodation available: Hotel or Hostel. Which type do you wish to add? ");
								String accommodationChoice = keyboard.next();
								System.out.print("This is the accommodation for which Trip? Please enter the corresponding tripId: ");
								String associatedTridId = keyboard.next();
								
								if (accommodationChoice.equalsIgnoreCase("Hotel")) {
									System.out.print("What is the star rating? ");
									int starRating =keyboard.nextInt();
									//overwrite the first null accommodation in accommodation[] and then set it to the corresponding trip
									for (int i = 0; i < accommodation.length; i++) {
									    if (accommodation[i] == null) {
									        accommodation[i] = new Hotel(name, locationCity, pricePerNight, starRating);
									        for (int j=0; j<trip.length; j++) {
									            if (trip[j] != null && trip[j].getTripId().equalsIgnoreCase(associatedTridId)) {
									                trip[j].setAccommodation(accommodation[i]);
									                break; // breaks inner j loop
									            }
									        }
									        break; // breaks outer i loop
									    }
									}
									}
								
								else if (accommodationChoice.equalsIgnoreCase("Hostel")) {
									System.out.print("What is the number of shared beds per room? ");
									int nbSharedBedsPerRoom=keyboard.nextInt();
									//overwrite the first null accommodation in accommodation[] and then set it to the corresponding trip
									for (int i = 0; i < accommodation.length; i++) {
									    if (accommodation[i] == null) {
									        accommodation[i] = new Hostel(name, locationCity, pricePerNight, nbSharedBedsPerRoom);
									        for (int j=0; j<trip.length; j++) {
									            if (trip[j] != null && trip[j].getTripId().equalsIgnoreCase(associatedTridId)) {
									                trip[j].setAccommodation(accommodation[i]);
									                break; // breaks inner j loop
									            }
									        }
									        break; // breaks outer i loop
									    }
									}}
								else
									System.out.println("Not a valid accommodation type");
								break;
							case 2:
								//subMenuAccommodation remove an accommodation
								System.out.print("What is the id of the accommodation you want to remove? ");
								String accommodationIDToRemove =keyboard.next();
								for (int i=0;i<accommodation.length;i++) {
									if (accommodation[i]!=null) {
										if (accommodation[i].getAccommodationID().equalsIgnoreCase(accommodationIDToRemove)) {
											accommodation[i]=null;
											break;
									}}}
								break;
							case 3:
								//subMenuAccommodation list all accommodation types (Hotel,Hostel)
								System.out.println("ALL HOTELS");
						    	for (int i=0;i<accommodation.length;i++) {
									if (accommodation[i]!=null) {
										if(accommodation[i].getClass()==Hotel.class)
											System.out.println((Hotel)accommodation[i]);
									}
						    	}
						    	
						    	System.out.println("\nALL HOSTELS");
						    	for (int i=0;i<accommodation.length;i++) {
									if (accommodation[i]!=null) {
										if(accommodation[i].getClass()==Hostel.class)
											System.out.println((Hostel)accommodation[i]);
									}
						    	}
								break;
							case 4: subMenuAccommodation=4;
							}
						}while (subMenuAccommodation!=4);
						break;
					case 5:
						//we are in option 5 of subMenu : additionnal operations
						do {
							subMenuChoice=0;
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| Additionnal operations                                                                       |\n"
									+ "| 1  >> Display the most expensive trip                                                        |\n"
									+ "| 2  >> Calculate and display the total cost of a trip                                         |\n"
									+ "| 3  >> Create a deep copy of the transportation array                                         |\n"
									+ "| 4  >> Create a deep copy of the accommodation array                                          |\n"
									+ "| 5  >> Return to precedent menu                                                               |\n"
									+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
							System.out.print("Please enter your choice and press <Enter>: ");
							subMenuChoice = keyboard.nextInt();	
							switch(subMenuChoice) {
							case 1: //Display the most expensive trip 
								Trip.mostExpensiveTrip(trip);	

								break;
							case 2: // Calculate and display the total cost of a trip
								System.out.println("What trip would you like to see the total cost of? Please enter the corresponding tripId: ");
								String tripID= keyboard.next();
								for (int i=0;i<trip.length;i++) {
									if (trip[i]!=null)
										if (trip[i].getTripId().equalsIgnoreCase(tripID)) {
											System.out.println("The total cost of TRIP #"+trip[i].getTripId()+" is: "+trip[i].calculateTotalCost());
											break;
										}
											
								}
								break;
							case 3: // Create a deep copy of the transportation array
								Transport[] transportCopy = new Transport[transport.length];
								for (int i=0; i<transport.length; i++) {
								    if (transport[i] instanceof Flight)
								        transportCopy[i] = new Flight((Flight)transport[i]);
								    else if (transport[i] instanceof Train)
								        transportCopy[i] = new Train((Train)transport[i]);
								    else if (transport[i] instanceof Bus)
								        transportCopy[i] = new Bus((Bus)transport[i]);
								    else
								        transportCopy[i] = null;
								}
								break;
							case 4: // Create a deep copy of the accommodation array
								Accommodation[] accommodationCopy = new Accommodation[accommodation.length];
								for (int i=0; i<accommodation.length; i++) {
								    if (accommodation[i] instanceof Hotel)
								    	accommodationCopy[i] = new Hotel((Hotel)accommodation[i]);
								    else if (accommodation[i] instanceof Hostel)
								    	accommodationCopy[i] = new Hostel((Hostel)accommodation[i]);
								    else
								    	accommodationCopy[i] = null;
								}
								break;
							case 5: subMenuChoice=5;
							}
						}while (subMenuChoice!=5);
						break;
					case 6:
						//we are in option 6 of subMenu :  visualization
						break;
					case 7: subMenuChoice=7;
					}// closes switch(subMenuChoice)
				} while (subMenuChoice!=7); //closes the do-while for the subMenu
				break;
				} //closes case 1
			case 2:{
				//option 2 of main menu: mainMenu test mode
				
				//creating objects with fictional values
				Client c1 = new Client("Alice", "Johnson", "alice.johnson@example.com");
			    Client c2 = new Client("Mark", "Thompson", "mark.thompson@example.com");
			    Client c3 = new Client("Sophie", "Williams", "sophie.williams@example.com");
			    Client [] client2= {c1,c2,c3};
	
			    Trip t1 = new Trip("Paris",7,1200.0,c1);
			    Trip t2 = new Trip("New York",5,900.0,c2);
			    Trip t3 = new Trip("London",10,2000.0,c3);
			    Trip [] trip2= {t1,t2,t3};
			    
			    Flight f1 = new Flight("AirExpress","Montreal", "Sydney", "AirExpress", 23.5 );
			    Flight f2 = new Flight("SkyHigh", "Laval", "Tokyo", "SkyHigh", 25.5);
			    Flight f3 = new Flight("SkyHigh", "Laval", "Tokyo", "SkyHigh", 25.5);
			    Train train1 = new Train("USATrack","Boston","Los Angeles","high-speed",'a');
			    Train train2 = new Train("ViaRail","Quebec","Vancouver", "regional", 'c');
			    Bus b1 = new Bus("GreyHound","Toronto", "Denver", "GreyHound",30);
			    Bus b2 = new Bus("FlixBus","Ottawa","Chicago", "FlixBus",67);
			    Transport [] transport2 = {f1,f2,f3,train1,train2,b1,b2};
			    
			    Hotel hotel1 = new Hotel("Safari Grand Hotel","Nairobi",150.0,8);
			    Hotel hotel2 = new Hotel("Rome Suites","Rome",200.0, 4);
			    Hostel hostel1 = new Hostel("Budget Stay", "Berlin", 30.0, 10);
			    Hostel hostel2 = new Hostel("Youth Lodge", "Madrid", 25.0, 12);
			    Accommodation [] accommodation2 = {hotel1,hotel2,hostel1,hostel2};
			    
			    //printing all objects
			    System.out.println("CLIENT ARRAY");
			    for (int i=0; i<client2.length;i++) {
			    	System.out.println(client2[i]);
			    	System.out.println("");
			    }
			    System.out.println("\n");
			    System.out.println("TRIP ARRAY");
			    for (int i=0; i<trip2.length;i++) {
			    	System.out.println(trip2[i]);
			    	System.out.println("");

			    }
			    System.out.println("\n");
			    System.out.println("TRANSPORT ARRAY");
			    for (int i=0; i<transport2.length;i++) {
			    	System.out.println(transport2[i]);
			    	System.out.println("");

			    }   
			    System.out.println("\n");
			    System.out.println("ACCOMMODATION ARRAY");
			    for (int i=0; i<accommodation2.length;i++) {
			    	System.out.println(accommodation2[i]);
			    	System.out.println("");
			    }
			    System.out.println("\n");
			    
			    //add transportation and accommodation to trips
				t1.setAccommodation(hostel2);
				t2.setAccommodation(hotel1);
				t1.setTransport(f1);
				t3.setTransport(train2);
				t2.setTransport(b1);
			    
			    //calculate total cost of trips
			    for (int i=0;i<trip2.length;i++) {
					System.out.println("The total cost of TRIP #"+trip2[i].getTripId()+" is: "+trip2[i].calculateTotalCost());
			    	}
			    System.out.println("\n");

			    //display most expensive trip
				Trip.mostExpensiveTrip(trip2);
			    System.out.println("\n");
			    
			    //compare objects from different classes
				System.out.println("COMPARING OBJECTS FROM DIFFERENT CLASSES: "+t2.equals(f1)+ ", "+train1.equals(hotel1));
				

				//compare objects of the same class with and with different attributes and with identical attributes
				System.out.println("COMPARING OBJECTS FROM SAME CLASS, DIFFERENT ATTRIBUTES: "+ f1.equals(f2));
				System.out.println("COMPARING OBJECTS FROM SAME CLASS, SAME ATTRIBUTES: "+f2.equals(f3));
			

				
			    //deep copy transportation array
				Transport [] transport3 = Transport.copyTransportationArray(transport2);
			    System.out.println("\n");

				//modify the original array
				transport2[0].setArrivalCity("");
				transport2[1].setCompanyName("");
				transport2[2].setDepartureCity("");
				transport2[3].setArrivalCity("");
				transport2[4].setCompanyName("");
				transport2[5].setDepartureCity("");
				
				//display old and new array, showing deep copy
				System.out.println("\n");
			    System.out.println("SHOWING PROOF OF DEEP COPY");
			    System.out.println("TRANSPORT ARRAY (OLD ONE)");
			    for (int i=0; i<transport2.length;i++) {
			    	System.out.println(transport2[i]);
			    	System.out.println("");
			    }
			    
			    System.out.println("TRANSPORT ARRAY (NEW ONE)");
				for (int i=0; i<transport3.length;i++) {
					 System.out.println(transport3[i]);
					 System.out.println("");
				}
				
				break;
				}
			case 3:{
				System.out.println("Thank you for using SmartTravel! See you soon.");
				menuChoice=3;
				}
			}} while (menuChoice!=3); // closes the switch AND the outer do-while
		
}
}

