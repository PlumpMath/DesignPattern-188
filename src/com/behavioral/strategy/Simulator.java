package com.behavioral.strategy;

public class Simulator {
	public static void main(String[] args) {
		System.out.println("The strategy pattern:");
		System.out.println("Defines a family of algorithm, encapsulates each one, and makes them interchangeable. ");
		System.out.println("Strategy lets the algorithm vary independently from clients that use it. ");
		Duck duck = new MallardDuck();
		duck.perform();
		duck = new ModelDuck();
		duck.perform();
	}
}
