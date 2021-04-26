package com.vti.entity;

public abstract class QLTL {
	private int matailieu;
	private String tennhasanxuat;
	private String sobanphathanh;
	
	public void setMatailieu(int matailieu) {
		this.matailieu = matailieu;
	}

	public void setTennhasanxuat(String tennhasanxuat) {
		this.tennhasanxuat = tennhasanxuat;
	}

	public void setSobanphathanh(String sobanphathanh) {
		this.sobanphathanh = sobanphathanh;
	}

	public int getMatailieu() {
		return matailieu;
	}

	public String getTennhasanxuat() {
		return tennhasanxuat;
	}

	public String getSobanphathanh() {
		return sobanphathanh;
	}

	public QLTL(int matailieu, String tennhasanxuat, String sobanphathanh) {
		this.matailieu = matailieu;
		this.tennhasanxuat = tennhasanxuat;
		this.sobanphathanh = sobanphathanh;
	}

	@Override
	public String toString() {
		return "QLTL [matailieu=" + matailieu + ", tennhasanxuat=" + tennhasanxuat + ", sobanphathanh=" + sobanphathanh
				+ "]";
	}
}
