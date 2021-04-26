package com.vti.entity;

public class Sach extends QLTL {
	private String tentacgia;
	private int sotrang;

	public Sach(int matailieu, String tennhasanxuat, String sobanphathanh, String tentacgia, int sotrang) {
		super(matailieu, tennhasanxuat, sobanphathanh);
		this.tentacgia = tentacgia;
		this.sotrang = sotrang;
	}

	@Override
	public String toString() {
		return "Sach"+super.getMatailieu()+" Tên nhà sản xuất: "+super.getTennhasanxuat()+" Số bản phát hành: "+super.getSobanphathanh()+ " Tên Tác giả: " + tentacgia + " Số Trang: " + sotrang;
	}
	
	
}
