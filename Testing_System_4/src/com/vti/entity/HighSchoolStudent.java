package com.vti.entity;

public class HighSchoolStudent extends Student_Exercise_5 {
	private String clazz;
	private String desiredUniversity;
	
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDesiredUniversity() {
		return desiredUniversity;
	}

	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}

	public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return "HighSchoolStudent"+super.getId()+" id:"+super.getId()+" Tên:"+super.getName()+ " clazz: " + clazz + ", Trường đại học mong muốn:" + desiredUniversity + "]";
	}
}
