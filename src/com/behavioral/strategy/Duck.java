package com.behavioral.strategy;

public abstract class Duck {
	Quackable quackable;
	Flyable flyable;
	
	public void perform() {
		quackable.quack();
		flyable.fly();
	}

	public abstract void display();
	
	public Quackable getQuackable() {
		return quackable;
	}
	public void setQuackable(Quackable quackable) {
		this.quackable = quackable;
	}
	public Flyable getFlyable() {
		return flyable;
	}
	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}
}
