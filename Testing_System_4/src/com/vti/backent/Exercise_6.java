package com.vti.backent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.entity.Contacts;
import com.vti.entity.Staff;
import com.vti.entity.VietnamesePhone;

public class Exercise_6 {
	private Scanner sc;
	
	public Exercise_6() {
		sc = new Scanner(System.in);
	}
	
	public void question_1() {
		VietnamesePhone vnphone = new VietnamesePhone();
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                 =====");
			System.out.println("=====            1. Thêm mới Contact.                           ===== ");
			System.out.println("=====            2. Remove Contact.                              =====");
			System.out.println("===              3. Update Contact.                                ===");
			System.out.println("===              4. Search Contact                                 ===");
			System.out.println("===              5. Show Contact                                   ===");
			System.out.println("===              6. Thoát khỏi chương trình.                       ===");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("=====            Thêm mới Contact:          ======");
				System.out.println("Nhập tên của contact: ");
				String name = sc.next();
				System.out.println("Nhập số của contact: ");
				String number = sc.next();
				vnphone.insertContact(name, number);
				break;

			case 2:
				System.out.println("Nhập tên của contact cần xóa: ");
				String remove =sc.next();
				vnphone.removeContact(remove);
				break;
			case 3:
				System.out.println("Nhập tên của contact cần update: ");
				String name1 = sc.next();
				System.out.println("Nhập số mới của contact cần update: ");
				String newphone = sc.next();
				vnphone.updateContact(name1, newphone);
				System.out.println("Kết quả: ");
				vnphone.searchContact(name1);
				break;
			case 4:
				System.out.println("Nhập tên của contact cần search: ");
				String searchname = sc.next();
				vnphone.searchContact(searchname);
				break;
			case 5:
				System.out.println("Danh sách thông tin của các contact: ");
				vnphone.printContact();
				break;
			case 6:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}
	}
	
	public void question_2() {
		System.out.println("Question_2: a,");
		System.out.println("Nhập tên User: ");
		String username = sc.next();
		System.out.println("Nhập salary: ");
		Double salary = sc.nextDouble();
		System.out.println("User vừa nhập là: " + username.toString()+ " Salary vừa nhập là: "+salary.byteValue());
		sc.close();
	}
	
	public void question_3() {
		
	}
}
