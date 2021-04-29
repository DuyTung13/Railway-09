package com.vti.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	private String ten;
	private String gioitinh;
	private LocalDate ngaysinh;
	private String diachi;
	
	private Scanner sc;
	private ArrayList<Person> personList;
	
	public Person() {
		sc = new Scanner(System.in);
		personList = new ArrayList<Person>();
	}
	
	public void inputInfor() {
		System.out.println("Nhập thông tin cảu Person: ");
		System.out.println("Nhập tên của Person: ");
		String ten = sc.next();
		System.out.println("Nhập giới tính của Person:Male,Female,UNKNOW");
		String gioitinh = sc.next();
		System.out.println("Nhập ngày sinh của Person: ");
		LocalDate ngaysinh = LocalDate.parse(sc.next());
		System.out.println("Nhập vào địa chỉ của Person: ");
		String diachi = sc.next();
		Person per = new Person(ten, gioitinh, ngaysinh, diachi);
		personList.add(per);
	}
	
	public String showInfo() {
		return "Person: Tên: "+ten+" Giới tính:  "+gioitinh+" Ngày sinh: "+ngaysinh+" Địa chỉ: "+diachi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Person(String ten, String gioitinh, LocalDate ngaysinh, String diachi) {
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}
}
