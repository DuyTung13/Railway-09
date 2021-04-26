package com.vti.entity;

import java.time.LocalDate;

public class Bao extends QLTL {
	private LocalDate ngayphathanh;

	public Bao(int matailieu, String tennhasanxuat, String sobanphathanh, LocalDate ngayphathanh) {
		super(matailieu, tennhasanxuat, sobanphathanh);
		this.ngayphathanh = ngayphathanh;
	}

	@Override
	public String toString() {
		return "Bao"+super.getMatailieu()+" Tên nhà sản xuất: "+super.getTennhasanxuat()+" Số bản phát hành: "+super.getSobanphathanh()+ "  Ngày phát hành: " + ngayphathanh;
	}
	
	
}
