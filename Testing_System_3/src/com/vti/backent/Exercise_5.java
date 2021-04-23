package com.vti.backent;

import com.vti.entity.Departments;

public class Exercise_5 {
	public void question_1() {
		
		Departments dep1 = new Departments();
		dep1.setId(1);
		dep1.setName("Sale");
		
		Departments dep2 = new Departments();
		dep2.setId(2);
		dep2.setName("Marketing");
		
		Departments dep3 = new Departments();
		dep3.setId(3);
		dep3.setName("filenance");
		
		Departments dep4 = new Departments();
		dep4.setId(4);
		dep4.setName("store");
		
		Departments dep5 = new Departments();
		dep5.setId(5);
		dep5.setName("logistic");
		
		System.out.println(dep1.toString());
	}
}
