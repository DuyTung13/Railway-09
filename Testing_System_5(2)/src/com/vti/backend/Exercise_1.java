package com.vti.backend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.entity.INews;
import com.vti.entity.News;
import com.vti.entity.Student_Ex1_Ques2;
import com.vti.entity.TuyenSinh;

public class Exercise_1 {
	private Scanner sc;
	private ArrayList<News> newsList;
	private TuyenSinh ts;

	public Exercise_1() {
		sc = new Scanner(System.in);
		newsList = new ArrayList<News>();
		ts = new TuyenSinh();
	}

	public void question_1() {
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                 =====");
			System.out.println("=====            1. Insert News.                                 =====");
			System.out.println("=====            2. View list News.                              =====");
			System.out.println("=====            3. Average rate.                                =====");
			System.out.println("=====            4. Exit                                         =====");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("=====          Insert News          =====");
				System.out.println("Nhập Title: ");
				String title = sc.next();
				System.out.println("Nhập PublishDate: ");
				String publishdate = sc.next();
				System.out.println("Nhập Author: ");
				String author = sc.next();
				System.out.println("Nhập Content: ");
				String content = sc.next();
				System.out.println("Nhập đánh giá 1: ");
				int dg1 = sc.nextInt();
				System.out.println("Nhập đánh giá 2: ");
				int dg2 = sc.nextInt();
				System.out.println("Nhập đánh giá 3: ");
				int dg3 = sc.nextInt();
				int[] danhgia = { dg1, dg2, dg3 };
				News news = new News(title, publishdate, author, content, danhgia);
				newsList.add(news);
				break;
			case 2:
				System.out.println("Show News: ");
				for (News showNews : newsList) {
					showNews.Display();
				}
				break;
			case 3:
				System.out.println("Trung bình đánh giá: ");
				for (News CalNews : newsList) {
					System.out.println("ID: " + CalNews.getId() + " AverageRate: " + CalNews.Calculate());
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

	public void question_2() {
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                 =====");
			System.out.println("===== 1. Thêm mới thí sinh.                                      =====");
			System.out.println("===== 2. Hiển thị thông tin của thí sinh và khối của thì sinh.   =====");
			System.out.println("===== 3. Tìm kiếm theo số báo danh.                              =====");
			System.out.println("===== 4. Exit                                                    =====");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				ts.addStudent();
				break;
			case 2:
				ts.showStudent();
				break;
			case 3:
				ts.searchStudent();
				break;
			case 4:
				return;
			}
		}
	}
}
