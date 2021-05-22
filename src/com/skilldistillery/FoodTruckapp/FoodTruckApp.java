package com.skilldistillery.FoodTruckapp;

import java.util.Scanner;


public class FoodTruckApp {

	public static void main(String[] args) {
	}
//		private FoodTruck[] trucks;
//		  private int numTrucks = 0;
//		  
//		  private final static int MAX_TRUCKS = 5;
//		  
//		  public FoodTruckApp() {
//		    trucks = new FoodTruck[MAX_TRUCKS];
//		  }
//		  public void addTruck(FoodTruck truck) {
//		    trucks[numTrucks] = truck;
//		    numTrucks++;    
//		  }
//		  
//		  public FoodTruck[] getTrucks() {
//		    FoodTruck[] truckCopy;
//		    truckCopy = new FoodTruck[numTrucks];
//		    for(int i=0; i < numTrucks; i++) {
//		      truckCopy[i] = trucks[i];
//		    }
//		    
//		    return truckCopy;
//		  }
		  
		  public FoodTruckApp() {
			  
			  Scanner kb = new Scanner(System.in);
			  System.out.println("Welcome to Denver's Drive up Dinners, where you can have a place"
			  		+ "to keep track of all the delicious Food Trucks Denver has to offer! Please start"
			  		+ "by entering the name of a Food Truck you visited...");
			  String name = kb.nextLine();
			  System.out.println("The Food Truck you visited is called: " + name);
			  
			  System.out.println("Great, now enter the type of food you had at this Food Truck: ");
			  String typeOfFood = kb.nextLine();
			  System.out.println("The type of food you had at " + name + " was " + typeOfFood);
			  
			  System.out.println("Yumm!! Sounds good! And on a scale of 0-5 with 5 being the highest, what is your overall food and experience rating for this Food Truck:");
			  int rating = kb.nextInt();
			  System.out.println("Alrighty then, you gave " + name + " a rating of " + rating + " after you visited and had their " + typeOfFood);
			  
			  System.out.println("*****************************************");
			  System.out.println("********* 1.List all Food Trucks ********");
			  System.out.println("*****************************************");
			  System.out.println("* 2. View Rating Average for All Trucks *");
			  System.out.println("*****************************************");
			  System.out.println("*** 3. View Highest Rated Food Truck ****");
			  System.out.println("*****************************************");
			  System.out.println("*************** 4. Quit *****************");
			  System.out.println("*****************************************");
			  int menuChoice = kb.nextInt();
			  
		  if(menuChoice < 4) {
			  
			  
		  }
}



}