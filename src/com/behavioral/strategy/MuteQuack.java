package com.behavioral.strategy;

public class MuteQuack implements Quackable {

	@Override
	public void quack() {
		System.out.println("Quack silently");
	}

}
