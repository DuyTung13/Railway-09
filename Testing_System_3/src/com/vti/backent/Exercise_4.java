package com.vti.backent;

import java.util.Scanner;

public class Exercise_4 {
	public void question_1() {
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi String: ");
		str1 = sc.next();
		System.out.println("Đếm chuỗi String vừa nhập: " +str1.length());
		sc.close();
	}
	
	public void question_2() {
		String str1;
		String str2;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nhập chuỗi String 1:");
		str1 = sc2.next();
		System.out.println("Nhập chuỗi String 2:");
		str2 = sc2.next();
		System.out.println("Nối chuỗi String 1 và String 2: " +str1.concat(str2));
		sc2.close();
	}
	
	public void question_3() {
		String str1;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Nhập chuỗi Tên:");
		str1 = sc3.next();
		System.out.println("Tên viết hoa chữ cái đầu: " + str1.substring(0,1).toUpperCase() +str1.substring(1).toLowerCase());
		sc3.close();
	}
	
	public void question_4() {
		String str1;
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Nhập chuỗi Tên:");
		str1 = sc4.next();
		for (int i = 0; i < str1.length(); i++) {
			System.out.println("Ký tự thứ "+i+ " là: " + str1.charAt(i));
		}
		sc4.close();
	}
	
	public void question_5() {
		String str1;
		String str2;
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Nhập chuỗi Họ:");
		str1 = sc5.next();
		System.out.println("Nhập chuỗi Tên:");
		str2 = sc5.next();
		System.out.println("Họ tên đầy đủ: "+ str1.concat(str2));
		sc5.close();
	}
	
	public void question_8() {
		String [] grp = {"Đang học JAVA","DEV","Không còn học JAVA","TEST"};
		for (String grpjava : grp) {
			if(grpjava.contains("JAVA"))
			{
				System.out.println(grpjava);
			}
		}
	}
	
	public void question_9() {
		String [] grp = {"Đang học JAVA","DEV","Không còn học JAVA","TEST","JAVA"};
		for (String grpjava : grp) {
			if(grpjava.equals("JAVA"))
			{
				System.out.println(grpjava);
			}
		}
	}
}
