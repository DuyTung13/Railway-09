package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Ex2_Ques2 extends Person {
	private int masinhvien;
	private float diemtrungbinh;
	private String email;
	
	public int COUNT=0;
	
	private Scanner sc;
	private ArrayList<Student_Ex2_Ques2> stuList;
	
	public Student_Ex2_Ques2() {
		sc = new Scanner(System.in);
		stuList = new ArrayList<Student_Ex2_Ques2>();
	}

	public Student_Ex2_Ques2(	float diemtrungbinh, String email) {
		COUNT++;
		this.masinhvien = COUNT;
		this.diemtrungbinh = diemtrungbinh;
		this.email = email;
	}
	
	@Override
	public void inputInfor() {
		System.out.println("Nhập thông tin Student: ");
		System.out.println("Nhập Điểm Trung Bình: ");
		float diemtrungbinh = sc.nextFloat();
		System.out.println("Nhập Email: ");
		String email = sc.next();
		Student_Ex2_Ques2 stu = new Student_Ex2_Ques2(diemtrungbinh, email);
		stuList.add(stu);
	}
	
	@Override
	public String showInfo() {
		return "Student: Mã Sinh viên: "+masinhvien+" Điểm trung bình: "+diemtrungbinh+" Email: "+email;
	}

	public float getDiemtrungbinh() {
		return diemtrungbinh;
	}

	public int getMasinhvien() {
		return masinhvien;
	}
	
	
}
