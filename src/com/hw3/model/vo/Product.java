package com.hw3.model.vo;

import java.util.Objects;

public class Product {

	private String brand;
	private String name;
	private String color;
	private int price;
	
	public Product() {}
	
	public Product(String brand, String name, String color, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
			return "brand=" + brand + ", " + "name=" + name + ", " + "color=" + color + ", " + "price=" + price;  
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, color, name, price);
	}

	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Objects.equals(name, other.name) && price == other.price;
	}

	public Product clone() {
		return new Product(this.brand, this.name, this.color, this.price);
	}
		
}
