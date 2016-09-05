package com.structural.composite;

import java.util.Iterator;

//As a leaf, its iterator has nothing to iterate over
public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

}
