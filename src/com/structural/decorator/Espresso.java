package com.structural.decorator;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}
	//this was an abstract method inside beverage
	public double cost() {
		return 0.99;
	}
}
