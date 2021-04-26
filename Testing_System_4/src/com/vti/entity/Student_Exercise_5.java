package com.vti.entity;

public class Student_Exercise_5 extends Person {
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student_Exercise_5(String name, int id) {
		super(name);
		this.id = id;
	}
	
	public Student_Exercise_5(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Student_Exercise_5 [id=" + id + "]";
	}
}
