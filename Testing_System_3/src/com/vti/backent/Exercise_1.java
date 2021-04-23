package com.vti.backent;

import java.util.Scanner;

public class Exercise_1 {
	
	public void question_1() {
		System.out.println("Question 1:");
		float luong1;
		float luong2;
		luong1 = (float) 5240.5;
		luong2 = (float) 10970.055;
		System.out.println("Lương Account 1: "+luong1+" Và Lương Account 2: "+luong2);
		
		int soluong1;
		int soluong2;
		soluong1 = (int) luong1;
		soluong2 = (int) luong2;
		System.out.println("Lương Account 1 kiểu INT: "+soluong1+ " Và Lương Account 2 kiểu INT: "+soluong2);
	}
	
	public void question_2() {
		System.out.println("Question 2:");
		int min = 0;
		int max = 99999;
		int sorandom = (int) (Math.random() * max)+min;
		System.out.println("Số ngẫu nhiên có 5 chữ số: "+sorandom);
	}
	
	public void question_3() {
		System.out.println("Question 3:");
		int min = 0;
		int max = 99999;
		int sorandom = (int) (Math.random() * max)+min;
		String soduoi = String.valueOf(sorandom);
		System.out.println("2 số cuối của số ngẫu nhiên có 5 chữ số:" + soduoi.substring(3));
	}
	
	public void question_4() {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập số a: ");
		a = sc.nextInt();
		System.out.println("Mời nhập số b: ");
		b = sc.nextInt();
		System.out.println("Thương của a/b: "+ (float)a / (float) b);
		sc.close();
	}

}
