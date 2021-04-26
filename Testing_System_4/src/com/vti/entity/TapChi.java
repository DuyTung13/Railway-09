package com.vti.entity;

import java.time.LocalDate;

public class TapChi extends QLTL {
	private String sophathanh;
	private LocalDate thangphathanh;

	public TapChi(int matailieu, String tennhasanxuat, String sobanphathanh, String sophathanh, LocalDate thangphathanh) {
		super(matailieu, tennhasanxuat, sobanphathanh);
		this.sophathanh = sophathanh;
		this.thangphathanh = thangphathanh;
	}

	@Override
	public String toString() {
		return "TapChi"+super.getMatailieu()+" Tên nhà sản xuất: "+super.getTennhasanxuat()+" Số bản phát hành: "+super.getSobanphathanh()+ " Số phát hành: " + sophathanh + " Tháng phát hành: " + thangphathanh;
	}
	
	

}
