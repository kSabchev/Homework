package com.restaurant.homework.items.vegitems;
import com.restaurant.homework.items.Sandwich;


public class VegSandwich extends Sandwich {
	String name;
	double cost;
	int quantity;
	
	VegSandwich(){
		this.name = "";
		this.cost = 0.0;
		quantity = 0;
	}
	
	public VegSandwich(String name, double cost){
		this.name = name;
		this.cost = cost;
		quantity = 0;
	}

	@Override
	public int getQuantity() {
		return this.quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getCost() {
		return this.cost;
	}
	
	@Override
	public String toString() {
		return name +" - $"+ cost;
	}
	
}