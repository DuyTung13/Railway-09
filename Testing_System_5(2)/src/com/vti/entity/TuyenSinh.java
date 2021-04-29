package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
	private Scanner sc;
	private ArrayList<Student_Ex1_Ques2> studentList;
	
	public TuyenSinh() {
		sc = new Scanner(System.in);
		studentList = new ArrayList<Student_Ex1_Ques2>();
	}

	@Override
	public void addStudent() {
		System.out.println("Thêm mới thí sinh: ");
		System.out.println("Nhập họ tên thí sinh: ");
		String hoten = sc.next();
		System.out.println("Nhập Địa chỉ thí sinh: ");
		String diachi =sc.next();
		System.out.println("Nhập mức độ ưu tiên của thí sinh: ");
		String mucdouutien = sc.next();
		System.out.println("Nhập khối của thí sinh: A,B,C");
		String khoi = sc.next();
		Student_Ex1_Ques2 stu = new Student_Ex1_Ques2(hoten, diachi, mucdouutien,new Khoi(khoi));
		studentList.add(stu);
	}

	@Override
	public void showStudent() {
		System.out.println("Hiển thị thông tin thí sinh: ");
		for(Student_Ex1_Ques2 showStudent :studentList) {
			System.out.println(showStudent.toString());
		}
	}

	@Override
	public void searchStudent() {
		System.out.println("Nhập số báo danh của thí sinh cần tìm kiếm: ");
		int sobaodanh = sc.nextInt();
		for(Student_Ex1_Ques2 searchStudent :studentList){
			if (searchStudent.getSobaodanh() == sobaodanh) {
				System.out.println(searchStudent.toString());
			}
		}
	}

}
