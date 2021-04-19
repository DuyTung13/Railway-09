package com.vti.frontent;

import java.util.Scanner;

import com.vti.Account;
import com.vti.Position;
import com.vti.PositionName;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào ID: ");
		int id = sc.nextInt();
		System.out.println("Mời bạn nhập vào Email: ");
		String email = sc.next();
		
		System.out.println("ID bạn vừa nhập: "+ id + " Email: " + email);
		
		System.out.println("-- câu 5: Viết lệnh cho phép người dùng tạo account");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhập vào thông tin Account:");
		Account acc = new Account();
		System.out.println("Nhập ID: ");
		acc.ID = sc1.nextInt();
		System.out.println("Nhập Email:");
		acc.Email = sc1.next();
		System.out.println("Nhập FullName:");
		acc.FullName = sc1.next();
		System.out.println("Nhập UserName: ");
		acc.UserName = sc1.next();
		System.out.println("Nhập ID của Position tương ứng: 1.DEV, 2.TEST, 3.Scrum_Master, 4.PM");
		int posNum = sc1.nextInt();
		switch (posNum) {
		case 1: {
			Position pos1 = new Position();
			pos1.name = PositionName.DEV;
			acc.Position = pos1;
			break;
		}
		case 2:{
			Position pos2 = new Position();
			pos2.name = PositionName.TEST;
			acc.Position = pos2;
			break;
		}
		case 3:{
			Position pos3 = new Position();
			pos3.name = PositionName.Scrum_Master;
			acc.Position = pos3;
			break;
		}
		default:
			Position pos4 = new Position();
			pos4.name = PositionName.PM;
			acc.Position = pos4;
			break;
		}
//		System.out.println("Account mới nhập là :");
//		System.out.println("ID của nhân viên: "  + acc.ID);
//		System.out.println("Email của nhân viên: "+ acc.Email);
//		System.out.println("UserName của nhân viên: "+acc.UserName);
//		System.out.println("FullName của nhân viên: "+acc.FullName);
//		System.out.println("Position của nhân viên: "+acc.Position.name);
		System.out.println("Account mới nhập là: " +acc);
	}
}
