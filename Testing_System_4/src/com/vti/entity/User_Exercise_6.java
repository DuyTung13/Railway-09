package com.vti.entity;

public abstract class User_Exercise_6 {
	private String name;
	private double salary_ratio;
	
	public abstract void calculatePay(Double salary);
	
	public abstract void displayInfor(String name);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary_ratio() {
		return salary_ratio;
	}
	public void setSalary_ratio(double salary_ratio) {
		this.salary_ratio = salary_ratio;
	}
	@Override
	public String toString() {
		return "User_Exercise_6 [name=" + name + ", salary_ratio=" + salary_ratio + "]";
	}
	
}
