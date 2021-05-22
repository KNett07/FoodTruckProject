package com.skilldistillery.FoodTruckapp;

public class FoodTruck {
	private int foodTruckId;
	  private String name;
	  private String foodType;
	  private int truckRating;
	  
	  public FoodTruck(int foodTruckId, String name, String foodType, int truckRating) {
	    this.foodTruckId = foodTruckId;
	    this.name = name;
	    this.foodType = foodType;
	    this.truckRating = truckRating;
	  }
	public int getFoodTruckId() {
		return foodTruckId;
	}
	public void setFoodTruckId(int foodTruckId) {
		this.foodTruckId = foodTruckId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getTruckRating() {
		return truckRating;
	}
	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}
	  
	  
	  
	  

}
