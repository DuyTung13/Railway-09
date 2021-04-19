package com.vti.frontent;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Mời nhập số thứ nhất: ");
		int number1= sc1.nextInt();
		System.out.println("Mời nhập số thứ hai: ");
		int number2 = sc1.nextInt();
		System.out.println("Tổng hai số là : "+Question1(number1,number2));
	}

	private static int Question1(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
		}
}
