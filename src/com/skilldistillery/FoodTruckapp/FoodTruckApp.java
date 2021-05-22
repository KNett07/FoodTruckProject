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

		boolean exit = false;
		boolean keepGoing = true;
		boolean trucksArePresent = true;
		;
		app.welcomeMenu(kb);
		while (!exit) {
		if (trucksArePresent) {
			app.viewTruckList(kb);
		} else {
			inputTruck();
		}

		if (app.numTrucks() == 0) {
			app.inputTruck(kb);
		} else if (app.numTrucks() > 5) {
			exit = true;
		} else if (app.numTrucks() < 5 && keepGoing) {
			app.inputTruck(kb);
		} else {
			app.truckInputMenu(kb);

		}
	}


	app.viewTruckList(kb);app.viewAverageRating(kb);app.viewHighestRating(kb);

	}

	public void welcomeMenu(Scanner scanner) {
		System.out.println("Welcome to **Denver's Delicious Dinners** ");
		System.out.println("Where you can keep track of all the great Food Trucks Denver has to offer! ");

	}

//		TODO give user option to see list if food trucks already exist

	public void inputTruck(Scanner scanner) {
		System.out.println("You currently have: " + numTrucks() + " Food Trucks entered so far.");

		System.out.print("Enter the name of the new Food Truck: ");
		String name = scanner.nextLine();
		System.out.println("The Food Truck you visited is called: " + name);

		System.out.print("Enter the type of food you had at this Food Truck: ");
		String typeOfFood = scanner.nextLine();
		System.out.println("Yumm! Sounds good!");
		System.out.print("On a scale of 0-Bad to 5-Fantastic, please enter your overall food and experience rating:");
		int truckRating = scanner.nextInt();
		this.createTruck(name, typeOfFood, truckRating);

		System.out.println(" You currently have: " + numTrucks() + " Food Trucks entered.");
		
	}

	public void createTruck(String name, String typeOfFood, int truckRating) {
		int truckId = numTrucks() + 1;
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

	public void truckInputMenu(Scanner scanner) {
		System.out.println("*****************************************");
		System.out.println("********* 1.List all Food Trucks ********");
		System.out.println("*****************************************");
		System.out.println("* 2. View Average Rating for All Trucks *");
		System.out.println("*****************************************");
		System.out.println("*** 3. View Highest Rated Food Truck ****");
		System.out.println("*****************************************");
		System.out.println("*************** 4. Quit *****************");
		System.out.println("*****************************************");
		int menuChoice = scanner.nextInt();

		switch (menuChoice) {
		case '1':
			System.out.println(viewTruckList());
			break;
		case '2':
			System.out.println(viewAverageRating());
			break;
		case '3':
			System.out.println(viewHighestRating());
			break;
		case '4':
			System.exit(menuChoice);

		}

	}

	public void viewTruckList(Scanner scanner) {
//			TODO this will bring back loading menu choice one
//		TODO and then loop back to landing menu
	}

	public void viewAverageRating(Scanner scanner) {
//			TODO this will bring back loading menu choice two
//		TODO and then loop back to landing menu
	}
//	 TODO calculate average rating here??

	public void viewHighestRating(Scanner scanner) {
//			TODO this will bring back loading menu choice three
//		TODO and then loop back to landing menu
//			TODO we also need a quit program option

//		TODO calculate highest rating here??
	}

}
