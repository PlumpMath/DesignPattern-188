package com.behavioral.iterator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MenuItem {
	BigDecimal price;

	String name;
	
	String description;

	public MenuItem(String name, String description, BigDecimal price) {
		super();
		this.price = price.setScale(2, RoundingMode.HALF_DOWN);
		this.name = name;
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price.setScale(2, RoundingMode.HALF_DOWN);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
