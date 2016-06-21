package com.behavioral.strategy;

public class FlyNoWay implements Flyable {

	@Override
	public void fly() {
		System.out.println("No way I can fly");
	}
 
}
