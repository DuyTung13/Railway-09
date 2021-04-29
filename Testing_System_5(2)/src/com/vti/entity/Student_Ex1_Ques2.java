package com.vti.entity;

public class Student_Ex1_Ques2 {
	private int sobaodanh;
	private String hoten;
	private String diachi;
	private String mucuutien;
	private Khoi khoi;
	
	public static int COUNT = 0;

	public int getSobaodanh() {
		return sobaodanh;
	}

	public String getHoten() {
		return hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public String getMucuutien() {
		return mucuutien;
	}

	public Student_Ex1_Ques2(String hoten, String diachi, String mucuutien,Khoi khoi) {
		COUNT++;
		this.sobaodanh = COUNT;
		this.hoten = hoten;
		this.diachi = diachi;
		this.mucuutien = mucuutien;
		this.khoi =khoi;
	}

	@Override
	public String toString() {
		return "Thí Sinh: Số Báo danh: " + sobaodanh + ", Họ và Tên: " + hoten + ", Địa chỉ: " + diachi + ", Mức ưu tiên: "
				+ mucuutien + ", Khối: " + khoi.getSubject() + "]";
	}

}
