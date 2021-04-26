package com.vti.entity;

public class Engineer extends Staff {
	private String nganhdaotao;

	public Engineer(String hoten, int age, GENDER gender, String adress, String nganhdaotao) {
		super(hoten, age, gender, adress);
		this.nganhdaotao = nganhdaotao;
	}

	@Override
	public String toString() {
		return super.toString() + " Engineer [Ngành đào tạo=" + nganhdaotao + "]";
	}

	@Override
	public void diLam() {
		// TODO Auto-generated method stub
		
	}
}
