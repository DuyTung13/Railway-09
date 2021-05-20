package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.ScannerUltis;
import com.vti.ultis.jdbcUltis;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		jdbcUltis jdbc = new jdbcUltis();
		jdbc.connnectionTestting();

		CandidateFunction candidateFunction = new CandidateFunction();

		while (true) {

			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                             Choose please                                |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|--------------------         1. Login .                        -----------|%n");
			System.out.format("|--------------------         2. Register.                      -----------|%n");
			System.out.format("|--------------------         3. Exist                          -----------|%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				candidateFunction.getLoginCadidate();
				break;
			case 2:
				getMenuRegister();
				break;
			case 3:
				return;
			default:
				System.out.println("Please Enter Again !!!!!!!!!!!!!:");
				break;
			}
		}
	}

	private static void getMenuRegister() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		while (true) {
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                               Choose please                              |%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|----------------        1. Create Experience Candidate           ---------|%n");
			System.out.format("|----------------        2. Create Fresher Candidate              ---------|%n");
			System.out.format("|----------------        3. Exist.                                ---------|%n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				CandidateFunction.createExperienceCandidate();
				break;
			case 2:
				CandidateFunction.createFresherCandidate();
				;
				break;
			case 3:
				return;
			default:
				System.out.println("Nhập lại:");
				break;
			}
		}

	}

}
