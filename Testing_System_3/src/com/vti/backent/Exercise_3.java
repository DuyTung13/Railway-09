package com.vti.backent;

public class Exercise_3 {
	public void question_1() {
		Integer luong = 5000 ;
		System.out.println("Lương theo dạng thập phân: "+(float)luong);
	}
	
	public void question_2() {
		String so ="1234567";
		int chuyendoi = Integer.parseInt(so);
		System.out.println("Chuyển đổi String sang dạng Integer: "+ chuyendoi);
	}
	
	public void question_3() {
		Integer so = 1234567;
		String chuyendoi = String.valueOf(so);
		System.out.println("Chuyển đổi Integer sang dạng String: "+chuyendoi);
	}

}
