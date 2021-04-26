package com.vti.backent;

import java.time.LocalDate;

import com.vti.entity.PositionName;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

public class Exercise_1 {
	public void question_1() {
		System.out.println("========Exercise_1:==========");
		
		System.out.println("Question 1: a,");
		Department dep1 = new Department();
		dep1.ID = 1;
		dep1.name = "dep1";
		System.out.println(dep1.toString());
		
		System.out.println("Question 1: b,");
		Department dep2 = new Department("dep2");
		System.out.println(dep2.toString());
	}
	
	public void question_2() {
		System.out.println("Question 2: b,");
		Account acc1 = new Account(1,"google@gmail.com.vn","tungtd","Tung1", "Duy");
		System.out.println(acc1.toString());
		
		System.out.println("Question 2: c,");
		Position pos1 = new Position();
		pos1.ID=1;
		pos1.name = PositionName.DEV;
		
		Position pos2 = new Position();
		pos2.ID=2;
		pos2.name = PositionName.TEST;
		
		Account acc2 = new Account(2, "google2@gmail.com.vn", "tungtd2", "Tung2", "Duy", pos1,LocalDate.now());
		System.out.println(acc2.toString());
		
		System.out.println("Question 2: d,");
		Account acc3 = new Account(3, "google3@gmail.com.vn", "tungtd3", "Tung3", "Duy", pos2,LocalDate.of(2020, 03, 16));
		System.out.println(acc3.toString());
	}
	
	public void question3() {
		System.out.println("Question 3: b,");
		Position pos1 = new Position();
		pos1.ID=1;
		pos1.name = PositionName.DEV;
		Account acc2 = new Account(2, "google2@gmail.com.vn", "tungtd2", "Tung2", "Duy", pos1,LocalDate.now());
		Account acc1 = new Account(1,"google@gmail.com.vn","tungtd","Tung1", "Duy");
		Group grp1 = new Group("muahang", acc1, LocalDate.of(2019, 04, 16), new Account[] { acc1, acc2 });
		System.out.println(grp1.toString());
		
		System.out.println("Question 3: c,");
		Position pos2 = new Position();
		pos2.ID=2;
		pos2.name = PositionName.TEST;
		Account acc3 = new Account(2, "google2@gmail.com.vn", "tungtd2", "Tung2", "Duy", pos1,LocalDate.now());
		Account acc4 = new Account(4,null,"tungtd4",null, null);
		Group grp2 = new Group("muahang", acc4, LocalDate.of(2019, 04, 16), new Account[] { acc1, acc2 });
		System.out.println(grp2.toString());
	}
}
