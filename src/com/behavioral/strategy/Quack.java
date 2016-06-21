package com.behavioral.strategy;

public class Quack implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

}
