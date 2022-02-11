package com.dependencyinjection;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int id;
	private String Brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", Brand=" + Brand + "]";
	}
	
	public void compile()
	{
		System.out.println("compiling");
	}

}
