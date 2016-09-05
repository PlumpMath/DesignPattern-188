package com.structural.composite;

import java.math.BigDecimal;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
		MenuComponent dinerMenu = new Menu("Diner menu", "Lunch");
		MenuComponent cafeMenu = new Menu("Cafe menu", "Diner");
		MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert");

		MenuComponent menus = new Menu("All menus", "All menus for a day");
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);

		dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", new BigDecimal(3.89)));
		dinerMenu.add(dessertMenu);
		dinerMenu.add(new MenuItem("Apple pie", "Apple pie with a flakey crust", new BigDecimal(1.59)));

		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}
