package com.vti.entity;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float diemhocluc;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public float getDiemhocluc() {
		return diemhocluc;
	}

	public void setDiemhocluc(float diemhocluc) {
		this.diemhocluc = diemhocluc;
	}
	

	public Student(String name, String hometown, float diemhocluc) {
		this.name = name;
		this.hometown = hometown;
		this.diemhocluc = 0;
	}
	
	

	public Student(int id, String name, String hometown, float diemhocluc) {
		super();
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.diemhocluc = diemhocluc;
	}

	@Override
	public String toString() {
		return "Student "+id+ " id=" + id + ", name=" + name + ", hometown=" + hometown + ", diemhocluc=" + diemhocluc;
	}
}
