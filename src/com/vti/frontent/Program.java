package com.vti.frontent;

import java.time.LocalDate;
import com.vti.Account;
import com.vti.Department;
import com.vti.Group;
import com.vti.Position;
import com.vti.PositionName;

public class Program {
	public static void main(String[] args) {
		Department dep1 = new Department();
		dep1.DepartmentID = 1;
		dep1.DepartmentName = "sale";

		Department dep2 = new Department();
		dep2.DepartmentID = 2;
		dep2.DepartmentName = "marketing";

		Department dep3 = new Department();
		dep3.DepartmentID = 3;
		dep3.DepartmentName = "filenance";

		Department dep4 = new Department();
		dep4.DepartmentID = 4;
		dep4.DepartmentName = "store";

		Department dep5 = new Department();
		dep5.DepartmentID = 5;
		dep5.DepartmentName = "logistic";

		Position pos1 = new Position();
		pos1.PositionID = 1;
		pos1.PositionName = PositionName.DEV;

		Position pos2 = new Position();
		pos2.PositionID = 2;
		pos2.PositionName = PositionName.Test;

		Position pos3 = new Position();
		pos3.PositionID = 3;
		pos3.PositionName = PositionName.Scrum_Master;

		Position pos4 = new Position();
		pos4.PositionID = 4;
		pos4.PositionName = PositionName.PM;

		Account acc1 = new Account();
		acc1.AccountID = 1;
		acc1.Email = "emailtestupdate@viettel.com.vn";
		acc1.UserName = "phuong";
		acc1.FullName = "nguyễn đức phương";
		acc1.Department = dep2;
		acc1.Position = pos1;
		acc1.CreateDate = LocalDate.of(2020, 03, 16);

		Group grp6 = new Group();
		grp6.GroupID = 4;
		grp6.GroupName = "xuatnhapkhau";
		grp6.CreatorID = acc1;
		grp6.CreateDate = LocalDate.of(2019, 12, 18);

		Group grp7 = new Group();
		grp7.GroupID = 5;
		grp7.GroupName = "thitruong";
		grp7.CreatorID = acc1;
		grp7.CreateDate = LocalDate.of(2019, 12, 18);

		Account acc2 = new Account();
		acc2.AccountID = 2;
		acc2.Email = "bocongthuong123@gmail.com";
		acc2.UserName = "thanh";
		acc2.FullName = "phạm thị thanh";
		acc2.Department = dep2;
		acc2.Position = pos2;
		acc2.CreateDate = LocalDate.of(2020, 04, 12);

//		acc2.group = new Group[] {grp6,grp7};

		Account acc3 = new Account();
		acc3.AccountID = 3;
		acc3.Email = "botaichinh123@gmail.com";
		acc3.UserName = "nam";
		acc3.FullName = "hoàng mạnh nam";
		acc3.Department = dep3;
		acc3.Position = pos3;
		acc3.CreateDate = LocalDate.of(2020, 03, 28);

		Account acc4 = new Account();
		acc4.AccountID = 4;
		acc4.Email = "bonongnghiep123@gmail.com";
		acc4.UserName = "ngoc";
		acc4.FullName = "vũ thị ngọc";
		acc4.Department = dep4;
		acc4.Position = pos4;
		acc4.CreateDate = LocalDate.of(2020, 07, 02);

		Account acc5 = new Account();
		acc5.AccountID = 5;
		acc5.Email = "loc.nguyenba@vti.com.vn";
		acc5.UserName = "hung";
		acc5.FullName = "Nguyễn Bá Lộc";
		acc5.Department = dep5;
		acc5.Position = pos1;
		acc5.CreateDate = LocalDate.of(2020, 11, 02);

		Group grp1 = new Group();
		grp1.GroupID = 1;
		grp1.GroupName = "muahang";
		grp1.CreatorID = acc1;
		grp1.CreateDate = LocalDate.of(2020, 03, 15);

		grp1.account = new Account[] { acc1, acc2 };

		Group grp2 = new Group();
		grp2.GroupID = 2;
		grp2.GroupName = "banhang";
		grp2.CreatorID = acc2;
		grp2.CreateDate = LocalDate.of(2020, 10, 15);

		Group grp3 = new Group();
		grp3.GroupID = 3;
		grp3.GroupName = "ketoan";
		grp3.CreatorID = acc3;
		grp3.CreateDate = LocalDate.of(2020, 12, 18);

		Group grp4 = new Group();
		grp4.GroupID = 4;
		grp4.GroupName = "xuatnhapkhau";
		grp4.CreatorID = acc4;
		grp4.CreateDate = LocalDate.of(2019, 12, 18);

		grp4.account = new Account[] { acc4, acc5 };

		Group grp5 = new Group();
		grp5.GroupID = 5;
		grp5.GroupName = "thitruong";
		grp5.CreatorID = acc5;
		grp5.CreateDate = LocalDate.of(2019, 12, 18);

//		System.out.println("Phòng số 1:");
//		System.out.println("ID: " + dep1.DepartmentID);
//		System.out.println("Name: "+ dep1.DepartmentName);
//		
//		System.out.println("Position 1:");
//		System.out.println("ID: " + pos1.PositionID);
//		System.out.println("Name: "+ pos1.PositionName);
//		
//		System.out.println("Account số 1:");
//		System.out.println("ID: " + acc1.AccountID);
//		System.out.println("Email: "+ acc1.Email);
//		System.out.println("Username: "+ acc1.UserName);
//		System.out.println("Fullname: "+ acc1.FullName);
//		System.out.println("Phòng số: "+ acc1.Department.DepartmentID);
//		System.out.println("Position: "+ acc1.Position.PositionID);
//		System.out.println("Ngày tạo: "+ acc1.CreateDate);
//		
//		System.out.println("Group số 1:");
//		System.out.println("ID: "+grp1.GroupID);
//		System.out.println("Name: "+grp1.GroupName);
//		System.out.println("Người tạo: "+ grp1.CreatorID.AccountID);

		// câu 1:
		if (acc2.Department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + acc2.Department.DepartmentName);
		}

		// câu 2:
		if (acc2.group == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (acc2.group.length == 1 || acc2.group.length == 2) {
			System.out.println("Group của nhân viên này là: " + acc2.group);
		} else if (acc2.group.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else if (acc2.group.length == 4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

		// câu 4:
		if (acc1.Position.PositionName.equals("DEV")) {
			System.out.println("Đây là Developer");
		}else {
			System.out.println("Người này không phải là Developer");
		}
	}
}
