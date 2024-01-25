package com.Vegetable;

public class Vegetable {
	int id;
	String name;
	private String color;
	public void dish() {
		System.out.println(name+" is yummy");
	}
	public void getVegetable(int id, String name,String color) {
		this.id=id;
		this.name=name;
		this.color=color;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
