package com.vti.entity;

public class Worker extends Staff {
	private String rank;

	public Worker(String hoten, int age, GENDER gender, String adress, String rank) {
		super(hoten, age, gender, adress);
		this.rank = rank;

	}

	@Override
	public String toString() {
		return super.toString() + " Worker [Cấp bậc=" + rank + "]";
	}

	@Override
	public void diLam() {
		
	}
}
