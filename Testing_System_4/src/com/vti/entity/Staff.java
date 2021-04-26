package com.vti.entity;

public abstract class Staff {
	private String Hoten;
	private int age;
	private GENDER gender;
	private String adress;
	
	public enum GENDER{
		MALE, FEMALE , UNKNOW;
	}
	
public abstract void diLam();

	public String getHoten() {
		return Hoten;
	}

	public int getAge() {
		return age;
	}

	public GENDER getGender() {
		return gender;
	}

	public String getAdress() {
		return adress;
	}

	public Staff(String hoten, int age, GENDER gender, String adress) {
		Hoten = hoten;
		this.age = age;
		this.gender = gender;
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Staff [Hoten=" + Hoten + ", age=" + age + ", gender=" + gender + ", adress=" + adress + "]";
	}
	

}
