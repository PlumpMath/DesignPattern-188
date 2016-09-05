package com.structural.composite;

import java.math.BigDecimal;
import java.util.Iterator;

//This abstract class can represent either menu item or menu
public abstract class MenuComponent {
	// by default all methods (except common method between menu items and menus
	// throw an exception)

	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public BigDecimal getPrice() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}

	public Iterator<MenuComponent> createIterator() {
		throw new UnsupportedOperationException();
	}
}
