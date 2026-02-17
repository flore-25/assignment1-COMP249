package DRIVER;

import java.util.Scanner;
import CLIENT.Client;
import TRAVEL.Accommodation;
import TRAVEL.Transport;
import TRAVEL.Trip;
import TRAVEL.Hotel;

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
							+ "| 5  >> additional Operations                                                                  |\n"                           
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
						break;
					case 4:
						//subMenu accommodation management
						int subMenuAccommodation;
						do{
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
									+ "| You are managing accommodations, what do you want to do?                                            |\n"
									+ "| 1  >> add an accommodation                                                                           |\n"
									+ "| 2  >> remove an accommodation                                                                          |\n"                            
									+ "| 4  >> list all accommodation types (Hotel,Hostel)                                                                      |\n"     
									+ "| 5  >> return to main menu                                                                    |\n" 
									+ "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
							System.out.print("Please enter your choice and press <Enter>: ");
							subMenuAccommodation = keyboard.nextInt();
							
							switch (subMenuAccommodation) {
							case 1:
								//subMenuAccommodation add an accommodation
								System.out.print("What is the type of the accommodation? ");
								String accommodationType=keyboard.next();
								System.out.print("What is the name of the accommodation? ");
								String name=keyboard.next();
								System.out.print("What is the location? ");
								String locationCity=keyboard.next();
								System.out.print("What is the price per night? ");
								double pricePerNight=keyboard.nextDouble();
								//parse through array and overwrite first null object
								for (int i=0;i<accommodation.length;i++) {
									if (accommodation[i]==null) {
										accommodation[i]= new Hotel(name,locationCity,pricePerNight);
										}}
										break;
						
						break;
					case 5:
						//additionnal operations
						break;
					case 6:
						//subMenu visialization
						break;
					case 7: subMenuChoice=7;
					}
				
				

				} while (subMenuChoice!=7);
				break;
				}
			case 2:{
				//mainMenu test mode
				break;
				}
			case 3:{
				System.out.println("Thank you for using SmartTravel! See you soon.");
				menuChoice=3;
				}
			}
		
			
		} while (menuChoice!=3);
		

}

