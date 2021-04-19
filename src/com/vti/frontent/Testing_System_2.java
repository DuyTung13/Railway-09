package com.vti.frontent;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.Scanner;

import com.vti.Account;
import com.vti.Department;
import com.vti.Group;
import com.vti.Position;
import com.vti.PositionName;

public class Testing_System_2 {
	public static void main(String[] args) {
		
		Department dep1 = new Department();
		dep1.ID = 1;
		dep1.name = "sale";
		
		Department dep2 = new Department();
		dep2.ID = 2;
		dep2.name = "marketing";
		
		Position pos1 = new Position();
		pos1.ID = 1;
		pos1.name = PositionName.DEV;

		
		Position pos2 = new Position();
		pos2.ID = 2;
		pos2.name = PositionName.TEST;
		
		Account acc1 = new Account();
		acc1.ID = 1;
		acc1.Email = "emailtestupdate@viettel.com.vn";
		acc1.UserName = "phuong";
		acc1.FullName = "nguyễn đức phương";
		acc1.Department = dep2;
		acc1.Position = pos1;
		acc1.CreateDate = LocalDate.of(2020, 03, 16);
		
		Account acc2 = new Account();
		acc2.ID = 2;
		acc2.Email = "bocongthuong123@gmail.com";
		acc2.UserName = "thanh";
		acc2.FullName = "phạm thị thanh";
		acc2.Department = dep2;
		acc2.Position = pos2;
		acc2.CreateDate = LocalDate.of(2020, 04, 12);
		
		Group grp1 = new Group();
		grp1.ID = 1;
		grp1.name = "muahang";
		grp1.creator = acc1;
		grp1.CreateDate = LocalDate.of(2020, 03, 15);

		grp1.accounts = new Account[] { acc1, acc2 };
		
		System.out.println("-- câu 1:");
		if (acc2.Department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + acc2.Department.name);
		}
		
		System.out.println("-- câu 2:");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (acc2.groups.length == 1 || acc2.groups.length == 2) {
			System.out.println("Group của nhân viên này là: " + acc2.groups);
		} else if (acc2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (acc2.groups.length == 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		
		System.out.println("-- câu 4:");
		if ((acc1.Position.name).toString() =="DEV") {
			System.out.println("Đây là Developer");
		} else {
			System.out.println("Người này không phải là Developer");
		}
		
		System.out.println("-- câu 5:");
		if (grp1.accounts == null) {
			System.out.println("Group chưa có thành viên nào tham gia");
		}else {
			int coungAccInGroup = grp1.accounts.length;
			switch (coungAccInGroup) {
			case 1: {
				System.out.println("Nhóm có 1 thành viên");
				break;
			}
			case 2:{
				System.out.println("Nhóm có 2 thành viên");
				break;
			}
			case 3: {
				System.out.println("Nhóm có 3 thành viên");
			}
			}
		}
		
		System.out.println("-- câu 6: ");
		if (acc2.groups == null) {
			System.out.println("Account không tham gia Group nào");
		} else {
			int countGroupInAcc = acc2.groups.length;
			switch (countGroupInAcc) {
			case 1: {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			}
			case 2: {
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			}
			case 3: {
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group ");
				break;
			}
			case 4: {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}
			default : {
				System.out.println("Nhân viên này tham gia tất cả các nhóm");
				break;
			}
			}
		}
		
		System.out.println("-- câu 8:");
		Account [] accArray = {acc1, acc2};
		for (Account account : accArray) {
			System.out.println("AccountID: "+ account.ID+ " " + "Email: "+ account.Email+" "+ "Fullname: "+account.FullName+" "+"Department: "+account.Department.name);
		}
		
		System.out.println(" -- câu 9: In ra thông tin các phòng ban bao gồm: id và name");
		Department[] depArray = { dep1,dep2};
		for (Department department : depArray) {
			System.out.println("DepartmentID: "+department.ID+" "+"Department Name: "+ department.name);
		}
		
		System.out.println("-- câu 10:");
		Account [] accForArray = {acc1, acc2};
		for (int i = 0; i < accForArray.length; i++) {
			System.out.println("Thông tin Account " + (i + 1 ) + " là:");
			System.out.println("Email Account: " +accForArray[i].Email);
			System.out.println("FullName Account: "+ accForArray[i].FullName);
			System.out.println("Department Account: "+ accForArray[i].Department.name);
		}
		
		System.out.println("-- câu 11:");
		Department[] depForArray = { dep1,dep2};
		for (int i = 0; i < depForArray.length; i++) {
			System.out.println("Thông tin Department "+ (i+1)+ " là:");
			System.out.println("Department ID: " + depForArray[i].ID);
			System.out.println("Department Name: "+ depForArray[i].name);
		}
		
		System.out.println("-- câu 12: Chỉ in ra thông tin 2 department đầu tiên");
		Department[] depFor2Array = { dep1,dep2};
		for (int i = 0; i < 2; i++) { 	
			System.out.println("Thông tin Department "+ (i+1)+ " là:");
			System.out.println("Department ID: " + depFor2Array[i].ID);
			System.out.println("Department Name: "+ depFor2Array[i].name);
		}
		
		System.out.println("-- câu 13:In ra thông tin tất cả các account ngoại trừ account thứ 2");
		Account [] accForArray2 = {acc1, acc2};
		for (int i = 0; i < accForArray2.length; i++) {
			if (i !=1) {
			System.out.println("Thông tin Account " + (i + 1 ) + " là:");
			System.out.println("Email Account: " +accForArray2[i].Email);
			System.out.println("FullName Account: "+ accForArray2[i].FullName);
			System.out.println("Department Account: "+ accForArray2[i].Department.name);
		}
		}
		
		System.out.println("-- câu 14:In ra thông tin tất cả các account có id < 4");
		Account [] accForArray3 = {acc1, acc2};
		for (int i = 0; i < 4; i++) {
			System.out.println("Thông tin Account " + (i + 1 ) + " là:");
			System.out.println("Email Account: " +accForArray3[i].Email);
			System.out.println("FullName Account: "+ accForArray3[i].FullName);
			System.out.println("Department Account: "+ accForArray3[i].Department.name);
		}
		
		System.out.println("-- câu 15: In ra các số chẵn nhỏ hơn hoặc bằng 20");
		Number [] numArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int i = 0; i < numArray.length; i++) {
			if(i%2 == 0) {
				System.out.println("Ta có các số chẵn là : "+i);
			}
		}
		
		System.out.println("-- câu 16: WHILE in ra thông tin Account");
		Account [] accArray2 = {acc1, acc2};
		int i = 0;
		while (i<accArray2.length) {
			System.out.println("Thông tin Account " + (i + 1 ) + " là:");
			System.out.println("Email Account: " +accArray2[i].Email);
			System.out.println("FullName Account: "+ accArray2[i].FullName);
			System.out.println("Department Account: "+ accArray2[i].Department.name);
			i++;
		}
		
		System.out.println(" -- câu 17: Do WHILE in ra thông tin Account");
		Account [] accArray3 = {acc1, acc2};
		int j=0;
		do {
			System.out.println("Thông tin Account " + (j + 1 ) + " là:");
			System.out.println("Email Account: " +accArray3[j].Email);
			System.out.println("FullName Account: "+ accArray3[j].FullName);
			System.out.println("Department Account: "+ accArray3[j].Department.name);
			j++;
		} while (j<accArray3.length);
		
		System.out.println("-- Exercise 4:");
		System.out.println("-- câu 1: In ra một số nguyên ngẫu nhiên");
		Random random = new Random();
		int n = random.nextInt();
		if (n< 0) {
		System.out.println("Số nguyên ngẫu nhiên là âm : "+ n);
		}else {
			System.out.println("Số nguyên ngẫu nhiên là dương : "+ n);
		}
		
		System.out.println("-- câu 2: In ngẫu nhiên ra 1 số thực");
		Random random1 = new Random();
		double m = random1.nextDouble();
		if (m< 0) {
			System.out.println("Số thực ngẫu nhiên là âm : "+ m);
			}else {
				System.out.println("Số thực ngẫu nhiên là dương : "+ m);
			}
		
		System.out.println("-- câu 4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995");
		int start = (int) LocalDate.of(1995,Month.JULY,24).toEpochDay();
		int end =(int) LocalDate.of(1995,Month.DECEMBER,20).toEpochDay();
		long randomDate = start + random.nextInt(end - start);
		LocalDate randomDay = LocalDate.ofEpochDay(randomDate);
		System.out.println(randomDay);
		
		System.out.println("-- Exercise 4:");
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
			Position pos3 = new Position();
			pos3.name = PositionName.DEV;
			acc.Position = pos3;
			break;
		}
		case 2:{
			Position pos4 = new Position();
			pos4.name = PositionName.TEST;
			acc.Position = pos4;
			break;
		}
		case 3:{
			Position pos5 = new Position();
			pos5.name = PositionName.Scrum_Master;
			acc.Position = pos5;
			break;
		}
		default:
			Position pos6 = new Position();
			pos6.name = PositionName.PM;
			acc.Position = pos6;
			break;
		}
		System.out.println("Account mới nhập là: " +acc);
	}

}
