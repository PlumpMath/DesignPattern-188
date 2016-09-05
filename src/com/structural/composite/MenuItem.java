package com.structural.composite;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	BigDecimal price;
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price.setScale(2, RoundingMode.DOWN);
	}

	public MenuItem(String name, String description, BigDecimal price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price.setScale(2, RoundingMode.DOWN);
	}
	
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}

	public void print() {
		System.out.print(" " + getName());
		System.out.println(", " + getPrice());
		System.out.println("    -- " + getDescription());
	}

}
