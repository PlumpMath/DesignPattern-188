package com.behavioral.iterator;

import java.math.BigDecimal;
import java.util.Iterator;

public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegaterian BLT", "Faking Bacon with lettuce & tomato on whole wheat", new BigDecimal(2.99));
		addItem("VBLT", "Bacon with lettuce & tomato on whole wheat", new BigDecimal(2.99));

	}
	
	public void addItem(String name, String description, BigDecimal price) {
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full");
		} else {
			this.menuItems[numberOfItems++] = new MenuItem(name, description, price);
		}
	}
}
