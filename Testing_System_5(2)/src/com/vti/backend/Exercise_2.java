package com.vti.backend;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.vti.entity.Student_Ex1_Ques2;
import com.vti.entity.Student_Ex2_Ques1;
import com.vti.entity.Student_Ex2_Ques2;

public class Exercise_2 {
	private Scanner sc;
	private ArrayList<Student_Ex2_Ques1> StudentList;
	private Random random;
	private Student_Ex2_Ques2 hs;
	private ArrayList<Student_Ex2_Ques2> stuList;

	
	public Exercise_2() {
		sc = new Scanner(System.in);
		StudentList = new ArrayList<Student_Ex2_Ques1>();
		random = new Random();
		hs = new Student_Ex2_Ques2();
		stuList = new ArrayList<Student_Ex2_Ques2>();
	}
		
	public void question_1() {
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                 =====");
			System.out.println("=====            1. Thêm mới học sinh.                           =====");
			System.out.println("=====            2. Hiển thị thông tin học sinh.                 =====");
			System.out.println("=====            3. Gọi một đi học bài.                          =====");
			System.out.println("=====            4. Gọi một nhóm đi dọn vệ sinh                  =====");
			System.out.println("=====            5. Gọi cả lớp đi điểm danh                      =====");
			System.out.println("=====            6. Tạo random 10 học sinh.                      =====");
			System.out.println("=====            7. Thoát khỏi chương trình                      =====");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Question_1: a,");
				System.out.println("Nhập Tên học sinh: ");
				String name = sc.next();
				System.out.println("Nhập nhóm: ");
				int group = sc.nextInt();
				Student_Ex2_Ques1 stu = new Student_Ex2_Ques1(name, group);
				StudentList.add(stu);
				break;
			case 2:
				System.out.println("Hiển thị thông tin sinh viên:");
				for (Student_Ex2_Ques1 showStudent : StudentList) {
					System.out.println(showStudent.toString());
				}
				break;
			case 3:
				System.out.println("Nhập nhóm: ");
				int grouphocbai = sc.nextInt();
				System.out.println("Gọi nhóm: "+grouphocbai+" đi học bài.");
				for (Student_Ex2_Ques1 callGroup : StudentList) {
					if(callGroup.getGroup() == grouphocbai) {
					callGroup.HocBai();
				}
				}
				break;
			case 4:
				System.out.println("Nhập nhóm: ");
				int groupvs = sc.nextInt();
				System.out.println("Gọi nhóm: "+groupvs+" đi học bài.");
				for (Student_Ex2_Ques1 callGroup : StudentList) {
					if(callGroup.getGroup() == groupvs) {
					callGroup.DiDonVeSinh();
					}
				}
				break;
			case 5:
				System.out.println("Gọi cả lớp điểm danh: ");
				for(Student_Ex2_Ques1 showStudent : StudentList) {
					showStudent.DiemDanh();
				}
				break;
			case 6:
				System.out.println("Tạo random 10 học sinh: ");
				for (int i =0 ; i<10 ; i++) {
					Student_Ex2_Ques1 sturandom = new Student_Ex2_Ques1("HS"+(i+1),random.nextInt(3)+1);
					StudentList.add(sturandom);
				}
				break;
			case 7:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
	}
	}
	
	public void question_2() {
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                 =====");
			System.out.println("=====            1. Thêm mới học sinh.                           =====");
			System.out.println("=====            2. Hiển thị thông tin học sinh.                 =====");
			System.out.println("=====            3. Xem học sinh có được học hổng.               =====");
			System.out.println("=====            4. Thoát khỏi chương trình                      =====");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Thêm mới học sinh: ");
				hs.inputInfor();
				break;
			case 2:
				System.out.println("Hiển thị thông tin học sinh: ");
				System.out.println(hs.showInfo());
				break;
			case 3:
				System.out.println("Xem học sinh được học bổng: ");
				for (Student_Ex2_Ques2 showhshocbong : stuList) {
					if (showhshocbong.getDiemtrungbinh() >=8.0) {
						System.out.println("Sinh viên"+showhshocbong.getMasinhvien()+" có điểm trung bình: "+showhshocbong.getDiemtrungbinh()+" dành được học bổng");
					}
				}
				break;
			case 4:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
	}
				
			}
	}

