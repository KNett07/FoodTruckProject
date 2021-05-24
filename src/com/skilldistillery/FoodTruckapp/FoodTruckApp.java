package com.skilldistillery.FoodTruckapp;

import java.util.Scanner;

public class FoodTruckApp {

	private FoodTruck[] trucks;
	private final static int MAX_TRUCKS = 5;

	public FoodTruckApp() {
		trucks = new FoodTruck[MAX_TRUCKS];
	}

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();

		Scanner kb = new Scanner(System.in);
		app.welcomeMenu(kb);
	}

	private void welcomeMenu(Scanner scanner) {

		boolean exit = false;

		System.out.println("Welcome to **Denver's Delicious Dinners** ");
		System.out.println("Where you can keep track of all the great Food Trucks Denver has to offer! ");
		while (!exit) {
			if (numTrucks()) {
				System.out.println("You have " + trucks + " locations in your Food Truck App.");
				exit = truckInputMenu(scanner);
			
			} else {
				System.out.println("No Food Trucks entered, so we are taking you to the input menu.");
				this.inputTruck(scanner);
			} 
		
		}
		System.out.println("Thanks for checking out Denver's Delicious Dinners, have a great day!");


	}

	public void inputTruck(Scanner scanner) {
		boolean nameAcceptable = false;
		String name = "";
		System.out.println("You currently have: " + numTrucks() + " Food Trucks entered so far.");

		System.out.print("Enter the name of the new Food Truck: ");
		name = scanner.nextLine();
		if (name != null && !name.equalsIgnoreCase("")) {
			nameAcceptable = true;
		}
		if (name.equalsIgnoreCase("QUIT")) {
			return;
		}
		System.out.println("The Food Truck you visited is called: " + name);

		System.out.print("Enter the type of food you had at this Food Truck: ");
		String typeOfFood = scanner.nextLine();

		if (name.equalsIgnoreCase("QUIT")) {
			return;
		}
		System.out.println("Yumm! Sounds good!");
		System.out.print("On a scale of 0-Bad to 5-Fantastic, please enter your overall food and experience rating:");
		int truckRating = scanner.nextInt();

		if (name.equalsIgnoreCase("QUIT")) {
			return;
		}

		this.createTruck(name, typeOfFood, truckRating);

	}

	public void createTruck(String name, String typeOfFood, int truckRating) {
		int truckId = 0;
		for ( int i = 0; i < this.trucks.length; i++) {
			if (this.trucks[i] != null) {
				truckId = this.trucks[i].getFoodTruckId();
			}
		}
		truckId = truckId + 1;
		
		FoodTruck ft = new FoodTruck(name, typeOfFood, truckRating, truckId);
		trucks[numTrucks()] = ft;

	}

	public int numTrucks() {
		int numTrucks = 0;
		for (int i = 0; i < MAX_TRUCKS; i++) {
			if (trucks[i] != null) {
				numTrucks++;
			}

		}
		return numTrucks;

	}

	private boolean truckInputMenu(Scanner scanner) {
		System.out.println("*****************************************");
		System.out.println("********* 1.List all Food Trucks ********");
		System.out.println("*****************************************");
		System.out.println("* 2. View Average Rating for All Trucks *");
		System.out.println("*****************************************");
		System.out.println("*** 3. View Highest Rated Food Truck ****");
		System.out.println("*****************************************");
		System.out.println("*************** 4. Quit *****************");
		System.out.println("*****************************************");
		boolean validResponse = false;
		int response = 0;
		
		while(!validResponse) {
			response = scanner.nextInt();
			if (response == 1 || response == 2 || response == 3 || response == 4) {
				validResponse = true;
			} else {
				System.out.println("Please choose a menu option from the list.");
			}
			
		}

		switch (response) {
		case '1':
			this.viewTruckList(scanner);
			break;
		case '2':
			this.viewAverageRating(scanner);
			break;
		case '3':
			this.viewHighestRating(scanner);
			break;
		case '4':
			return true;
			default:
				break;

		}
		return false;

	}

	private void viewTruckList(Scanner scanner) {
		for(int i = 0; i < this.trucks.length; i++) {
			if(this.trucks[i] != null){

	int choiceNumber = i + 1;
	FoodTruck chosenTruck = this.trucks[i];
	
	System.out.println(choiceNumber + "." + chosenTruck.getName() + "(ID: " + chosenTruck.getFoodTruckId() + ")" 
	+ chosenTruck.getFoodType() + "Type Of Food: " + chosenTruck.getTruckRating() + "Rating: ");
	}
}

	}

	public void viewAverageRating(Scanner scanner) {
		int count = 0;
		int total = 0;
		
		for (int i = 0; i < this.trucks.length; i++) {
			if (this.trucks[i] != null) {
				count ++;
				total += this.trucks[i].getTruckRating();
			}
			
		}
		int avg = total / count;
		
		System.out.println("Average rating of " + count + " trucks is " + avg);
	}

	public void viewHighestRating(Scanner scanner) {
		int count = 0;
		int total = 0;
		for (int i = 0; i < this.trucks.length; i++) {
			if (this.trucks[i] != null) {
				count ++;
				total += trucks[i].getTruckRating();
				
			}
				
			}
		int highest = total / trucks.length;
		System.out.println("The highest rated Food Truck is: " + highest);
		

	}

}
