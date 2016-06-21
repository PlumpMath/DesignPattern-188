package com.structural.decorator;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "Espresso";
	}
	//this was an abstract method inside beverage
	public double cost() {
		return 1.99;
	}
}
