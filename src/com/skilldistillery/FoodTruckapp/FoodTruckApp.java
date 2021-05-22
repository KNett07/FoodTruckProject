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
//		System.out.println(app.trucks.length);

		Scanner kb = new Scanner(System.in);
		app.welcomeMenu(kb);
		app.inputLandingMenu(kb);
		app.inputFoodTruckMenu(kb);
		app.inputTruckRating(kb);
		app.viewTruckList(kb);
		app.viewAverageRating(kb);
		app.viewHighestRating(kb);
	}

	public void welcomeMenu(Scanner scanner) {
		System.out.print("Welcome to Denver's Delicious Dinners, where you can have a place "
				+ " to keep track of all the delicious Food Trucks Denver has to offer!");
		public FoodTruck[] getTruckId() {
			FoodTruck[] truckId;
			truckId = new FoodTruck[numTrucks];
			for (int i = 0; i < numTrucks; i++) {
				truckId[i] = trucks[i];
			}
			
			return truckId;
		}
		boolean trucksArePresent = this.areTrucksPresent();
		if (trucksArePresent) {
			this.listTrucksOrEnterNewTrucks();

		} else {
			this.inputTruck();
		}

//		TODO give user option to see list if food trucks already exist

	}

	public void inputTruck(Scanner scanner) {
		System.out.println("To start, enter the name of the new Food Truck: ");
		String name = scanner.nextLine();
		System.out.println("The Food Truck you visited is called: " + name);
		private int numTrucks = 0;
		
		public void addTruck(FoodTruck truck) {
			trucks[numTrucks] = truck;
			numTrucks++;
		}
	}

	public void inputLandingMenu(Scanner scanner) {
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

		if (menuChoice < 4) {
//			1 = FoodTruck(); TODO make the menu choice match the info produced

		} else {
			System.out.println("Thanks and have a delicious day!");
		}

	}

	public void inputFoodTruckMenu(Scanner scanner) {
		System.out.print("Great, now enter the type of food you had at this Food Truck: ");
		String typeOfFood = scanner.nextLine();
//		System.out.println("The type of food you had at " + name + " was " + typeOfFood);

	}

	public void inputTruckRating(Scanner scanner) {
		System.out.print(
				"Yumm!! Sounds good! And on a scale of 0-5 with 5 being the highest, what is your overall food and experience rating for this Food Truck:");
		int truckRating = scanner.nextInt();
//		System.out.println("Alrighty then, you gave " + name + "Truck ID: " + foodTruckId + "a rating of " + truckRating
//				+ " after you visited and had their " + typeOfFood);
		System.out.print("Do you have more Food Trucks to enter: Y/N? ");
		String nextTruck = scanner.next();

	}

	public void viewTruckList(Scanner scanner) {
//			TODO this will bring back loading menu choice one
//		TODO and then loop back to landing menu
	}

	public void viewAverageRating(Scanner scanner) {
//			TODO this will bring back loading menu choice two
//		TODO and then loop back to landing menu
	}

	public void viewHighestRating(Scanner scanner) {
//			TODO this will bring back loading menu choice three
//		TODO and then loop back to landing menu
//			TODO we also need a quit program option

	}

}
