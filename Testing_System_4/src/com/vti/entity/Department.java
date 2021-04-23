package com.vti.entity;

public class Department {
	public int ID;
	public String name;
	
	public Department() {
		
	}

	@Override
	public String toString() {
		return "Department" +ID+ " ID = " + ID + ", Tên Deparment = " + name + "";
	}

	public Department(String name) {
		this.ID = 0;
		this.name = name;
	}
}
