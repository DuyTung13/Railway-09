package com.vti.backent;

import com.vti.entity.Circle;
import com.vti.entity.Student;

public class Exercise_4 {
	public void question_1() {
		System.out.println("Question 1: b,");
		Student stu = new Student("Duy Tung", "Ha Noi", 0);
		System.out.println(stu.toString());
		
		System.out.println("Question 1: c,");
		Student stu1 = new Student(1, "Duy Tung 1", "Ha Noi 1", 8);
		System.out.println(stu1.toString());
		
		System.out.println("Question 1: d,");
		Student stu2 = new Student(1, "Duy Tung 2", "Ha Noi 1", 7,3);
		System.out.println(stu2.toString());
		
		System.out.println("Question 1: e,");
		Student stu3 = new Student(1, "Duy Tung 3", "Ha Noi 1", 9);
		if (stu3.getDiemhocluc() <=4.0) {
			System.out.println("Tên: "+stu3.getName()+ " Học lực: Yếu ");
		} else if(stu3.getDiemhocluc()> 4.0 && stu3.getDiemhocluc()<= 6.0) {
			System.out.println("Tên: "+stu3.getName()+ " Học lực: Trung Bình ");
		} else if (stu3.getDiemhocluc()> 6.0 && stu3.getDiemhocluc()< 8.0){
			System.out.println("Tên: "+stu3.getName()+ " Học lực: Khá ");
		} else if (stu3.getDiemhocluc()>= 8.0) {
			System.out.println("Tên: "+stu3.getName()+ " Học lực: Giỏi ");
		}
	}
	
	public void question_2() {
		Circle cir1 = new Circle();
		System.out.println("Cirle 1 has radius: "+cir1.getRadius() +" has color: "+cir1.getColor());
		
		Circle cir2 = new Circle(8.0);
		System.out.println("Cirle 2 has radius: "+cir2.getRadius() +" has color: "+cir2.getColor());
	}
}
