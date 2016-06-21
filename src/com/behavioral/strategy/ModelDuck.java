package com.behavioral.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackable = new MuteQuack();
		flyable = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("This is a model duck");
	}

}
