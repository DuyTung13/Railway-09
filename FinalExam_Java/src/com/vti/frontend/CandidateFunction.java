package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.backend.presentationlayer.CandidateController;
import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCadidate.GraduationRank;
import com.vti.ultis.ScannerUltis;

public class CandidateFunction {
	private CandidateController candidateController;

	public CandidateFunction() throws FileNotFoundException, IOException {
		candidateController = new CandidateController();
	}

	public static void getLoginCadidate()
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		CandidateController candidateController = new CandidateController();
		System.out.println(" Please enter Email : ");
		String email = ScannerUltis.inputString();
		System.out.println(" Please enter Password: ");
		String password = ScannerUltis.inputPassword();

		if (candidateController.loginCadidate(email, password)) {
			System.out.println(" Wellcom" + email + "đã đăng nhập hệ thống(^-^) ");
		} else {
			System.out.println(" Error Account");
			return;
		}

	}


	public static void createExperienceCandidate()
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

		CandidateController candidateController = new CandidateController();
		System.out.println("Nhập vào firstName:");
		String fistName = ScannerUltis.inputString();
		System.out.println("Nhập vào lastName:");
		String lastName = ScannerUltis.inputString();
		System.out.println("Nhập vào Phone:");
		String phone = ScannerUltis.inputPhoneNumber();
		System.out.println("Nhập vào Email:");
		String email = ScannerUltis.inputEmail();
		if (candidateController.isCadidateExist(email)) {
			System.out.println(" Account đã tồn tại trên hệ thống");
		}
		System.out.println("Nhập vào UserName:");
		String userName = ScannerUltis.inputString();
		System.out.println("Nhập vào PassWord:");
		String password = ScannerUltis.inputPassword();
		System.out.println("Nhập vào ExpInYear:");
		int expInYear = ScannerUltis.inputInt();
		System.out.println("Nhập vào ProSkill:");
		ProSkill proSkill = getproSkil();
		Boolean flag = candidateController.createExperienceCandidate(fistName, lastName, phone, email, userName,password, expInYear, proSkill);
		if (flag) {
			System.out.println(" You Created Successfully  Account with Email: " + email + "Password" + password);

			System.out.println(" Please change your password when you login firstly");
		} else {
			System.out.println(" Fail, Please check again");
		}
	}

	private static ProSkill getproSkil() {
		while (true) {
			System.out.println(" ===== Please choose ProSkill ======");
			System.out.format("+--------------------------------+%n");
			System.out.format("| 	 ProSkill Name           |%n");
			System.out.format("|           1. DEV               |%n");
			System.out.format("|           2. TEST              |%n");
			System.out.format("|           3. JAVA 		 |%n");
			System.out.format("|           4. SQL               |%n");
			System.out.format("+--------+-----------------------+%n");

			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				return ProSkill.DEV;
			case 2:
				return ProSkill.TEST;
			case 3:
				return ProSkill.JAVA;

			case 4:
				return ProSkill.SQL;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}

	public static void createFresherCandidate()
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		CandidateController candidateController = new CandidateController();
		System.out.println("Nhập vào firstName:");
		String fistName = ScannerUltis.inputString();
		System.out.println("Nhập vào lastName:");
		String lastName = ScannerUltis.inputString();
		System.out.println("Nhập vào Phone:");
		String phone = ScannerUltis.inputPhoneNumber();
		System.out.println("Nhập vào Email:");
		String email = ScannerUltis.inputEmail();

		if (candidateController.isCadidateExist(email)) {
			System.out.println(" Account đã tồn tại trên hệ thống");
		}
		System.out.println("Nhập vào UserName:");
		String userName = ScannerUltis.inputString();
		System.out.println("Nhập vào PassWord:");
		String password = ScannerUltis.inputPassword();
		System.out.println("Nhập vào GraduationRank:");
		GraduationRank graduationRank = getGraduationRank();
		Boolean flag1 = candidateController.createFresherCandidate(fistName, lastName, phone, email, userName, password,graduationRank);
		if (flag1) {
			System.out.println(" You Created Successfully  Account with Email: " + email + "Password" + password);

			System.out.println(" Please change your password when you login firstly");
		} else {
			System.out.println(" Fail, Please check again");
		}
	}

	private static GraduationRank getGraduationRank() {
		while (true) {
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                            Choose please                                 |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                         1. EXCELLENCE.                                   |%n");
			System.out.format("|                         2. GOOD .                                        |%n");
			System.out.format("|                         3. FAIR.                                         |%n");
			System.out.format("|                         4. POOR.                                         |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");

			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				return GraduationRank.EXCELLENCE;
			case 2:
				return GraduationRank.GOOD;
			case 3:
				return GraduationRank.FAIR;
			case 4:
				return GraduationRank.POOR;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}
	}

}
