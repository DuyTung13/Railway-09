package com.vti.entity;

public class NhanVien extends Staff {
	private String work;

	public NhanVien(String hoten, int age, GENDER gender, String adress, String work) {
		super(hoten, age, gender, adress);
		this.work = work;
	}

	@Override
	public String toString() {
		return super.toString() + " NhanVien [Công việc=" + work + "]";
	}

	@Override
	public void diLam() {
		// TODO Auto-generated method stub
		
	}
}
