package com.vti.backent;

import java.time.LocalDate;
import java.util.Iterator;

import com.vti.entity.Account;

public class Exercise_2 {
	
	public void question_1() {
		Account[] accounts = new Account[5];
			for (int i=0 ; i<5; i++) {
				Account acc = new Account();
				acc.setEmail("Email " +(i+1));
				acc.setUserName("UserName "+(i+1));
				acc.setFullName("FullName "+(i+1));
				acc.setCreateDate(LocalDate.now());
				
				accounts[i]=acc;
			}
			for (Account acc : accounts) {
				System.out.println("Email Account: " +acc.getEmail());
				System.out.println("UserName Account: "+acc.getUserName());
				System.out.println("FullName Account: "+acc.getFullName());
				System.out.println("CreateDate Account: "+acc.getCreateDate());
			}
	}
}
