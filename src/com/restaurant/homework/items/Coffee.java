package com.restaurant.homework.items;

public class Coffee extends HotDrinks {
	String name;
	double cost;
	int quantity;

	Coffee() {
		this.name = "";
		this.cost = 0.0;
		quantity = 0;
	}
	
	public Coffee(String name, double cost) {
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
