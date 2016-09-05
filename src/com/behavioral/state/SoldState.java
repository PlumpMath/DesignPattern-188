package com.behavioral.state;

public class SoldState implements State {

	GumballMachine machine;

	public SoldState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Ready");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry you already turned the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't give you another gumball");
	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if (machine.getCount() > 0) {
			machine.setState(machine.noQuarterState);
		} else {
			System.out.println("Oops, out of gumballs");
			machine.setState(machine.getSoldOutState());
		}
	}

}
