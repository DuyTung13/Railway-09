package com.vti.entity;

public class Student_Ex2_Ques1 implements IStudent {
	private int id;
	private String name;
	private int group;

	
	public static int COUNT = 0;
	
	public int getGroup() {
		return group;
	}

	@Override
	public void DiemDanh() {
		System.out.println("Học sinh: "+name+" điểm danh.");
		
	}

	@Override
	public void HocBai() {
		System.out.println("Học sinh: "+name+" đang học bài.");
		
	}

	@Override
	public void DiDonVeSinh() {
		System.out.println("Học sinh: "+name+" đi dọn vệ sinh");
	}

	public Student_Ex2_Ques1(String name, int group) {
		COUNT++;
		this.id = COUNT;
		this.name = name;
		this.group = group;
	}

	@Override
	public String toString() {
		return "Học Sinh: ID: " + id + ", Tên: " + name + ", Group: " + group ;
	}
	
}
