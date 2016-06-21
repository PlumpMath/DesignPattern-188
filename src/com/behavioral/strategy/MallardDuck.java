package com.behavioral.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackable = new Quack();
		flyable = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("This is a mallard duck");
	}
}
