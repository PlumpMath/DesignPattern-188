package com.structural.decorator;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		espresso = new Mocha(espresso);
		espresso = new Whip(espresso);
		
		System.out.println(espresso.getDescription());
		
	}
}
