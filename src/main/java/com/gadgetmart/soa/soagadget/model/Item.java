package com.gadgetmart.soa.soagadget.model;

public class Item {
	private int id;
	private String brand;
	private String name;
	private double price;

	public Item() {
		super();
	}

	public Item(int id, String brand, String name, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}

}
