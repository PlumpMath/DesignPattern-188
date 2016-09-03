package com.behavioral.iterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
	
	List<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", new BigDecimal(2.99));
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", new BigDecimal(2.99));
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
	
	public void addItem(String name, String description, BigDecimal price) {
		MenuItem menuItem = new MenuItem(name, description, price);
		menuItems.add(menuItem);
	}


}
