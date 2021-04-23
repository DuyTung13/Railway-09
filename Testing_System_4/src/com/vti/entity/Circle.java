package com.vti.entity;

public class Circle {
	private double radius;
	private String color;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
		color = "black";
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
}
