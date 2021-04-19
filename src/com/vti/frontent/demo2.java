package com.vti.frontent;

import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {
		System.out.println("Câu 8:Viết chương trình thực hiện theo flow");
		Scanner sc = new Scanner(System.in);
		int choose;
		while (true) {
		System.out.println("Chọn 1.Tạo Account        2.Tạo Position");
		choose = sc.nextInt();
		if (choose == 1 || choose == 2) {
			switch (choose) {
			case 1: {
				System.out.println("Menu Account");
				break;
			}
			case 2: {
				System.out.println("Menu Position");
				break;
			}
			}return;
		}else {
				System.out.println("Nhập lại:");
			}
		}
	}
}