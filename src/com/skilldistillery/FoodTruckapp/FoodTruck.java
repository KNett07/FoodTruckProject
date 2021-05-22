package com.skilldistillery.FoodTruckapp;

public class FoodTruck {
	private int foodTruckId;
	  private String name;
	  private String foodType;
	  private int truckRating;
	  
	  public FoodTruck(String name, String foodType, int truckRating) {
//	    TODO this.foodTruckId = foodTruckId; generate FoodTruckId here
	    this.name = name;
	    this.foodType = foodType;
	    this.truckRating = truckRating;
	  }
	public int getFoodTruckId() {
		return foodTruckId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFoodType() {
		return foodType;
	}
	
	public int getTruckRating() {
		return truckRating;
	}
	
	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}
	  
	  
	  
	  

}
