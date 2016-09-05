package com.behavioral.state;

public class NoQuarterState implements State {
	GumballMachine machine;
	
	public NoQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

}
