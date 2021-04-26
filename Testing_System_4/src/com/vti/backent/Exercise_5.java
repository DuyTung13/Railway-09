package com.vti.backent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vti.entity.Bao;
import com.vti.entity.Engineer;
import com.vti.entity.HighSchoolStudent;
import com.vti.entity.NhanVien;
import com.vti.entity.QLTL;
import com.vti.entity.Sach;
import com.vti.entity.Staff;
import com.vti.entity.TapChi;
import com.vti.entity.Staff.GENDER;
import com.vti.entity.Worker;

public class Exercise_5 {
	private Scanner sc;
	private ArrayList<Staff> staffList;
	private ArrayList<QLTL> QTTLList;

	public Exercise_5() {
		sc = new Scanner(System.in);
		staffList = new ArrayList<Staff>();
		QTTLList = new ArrayList<QLTL>();
	}

	public void question_1() {

	}

	public void question_2() {
		System.out.println("=====      Question 2:        ======");
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                 =====");
			System.out.println("=====            1. Thêm mới cán bộ.                            ===== ");
			System.out.println("=====            2. Tìm kiếm theo họ tên.                        =====");
			System.out.println("===              3. Hiện thị thông tin về danh sách các cán bộ.    ===");
			System.out.println("===              4. Nhập vào tên của cán bộ và delete cán bộ đó    ===");
			System.out.println("===              5. Thống kê các cán bộ.                           ===");
			System.out.println("===              6. Thoát khỏi chương trình.                       ===");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				addStaff();
				break;

			case 2:
				SearchStaff();
				break;
			case 3:
				ShowStaff();
				break;
			case 4:
				DeleteStaff();
				break;
			case 5:
				ThongkeStaff();
			case 6:
				return;

			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}
	}

	private void ThongkeStaff() {
		System.out.println("=======================================================================");
		System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                  =====");
		System.out.println("=====            1. Thống kê Worker.                             ===== ");
		System.out.println("=====            2. Thống kê Engineer.                            =====");
		System.out.println("===              3. Thống kê Nhân viên.                             ===");
		System.out.println("===              4. Thoát khỏi chương trình thống kê cán bộ         ===");
		System.out.println("=======================================================================");
		int menuChoose = sc.nextInt();
		switch (menuChoose) {
		case 1:
			ThongkeWorker();
			break;

		case 2:
			ThongkeEngineer();
			break;
		case 3:
			ThongkeNhanvien();
			break;
		
		case 4:
			return;
			
		default:
			System.out.println("Lựa chọn đúng số trên menu");
			break;
		}
	}
private void ThongkeNhanvien() {
	System.out.println("Thống kê các Nhanvien");
	for (Staff staff : staffList) {
		if (staff instanceof NhanVien) {
			System.out.println(staff.toString());
		}
	}
	}

private void ThongkeEngineer() {
	System.out.println("Thống kê các Engineer");
	for (Staff staff : staffList) {
		if (staff instanceof Engineer) {
			System.out.println(staff.toString());
		}
	}
	}

private void ThongkeWorker() {
	System.out.println("Thống kê các Worker");
	for (Staff staff : staffList) {
		if (staff instanceof Worker) {
			System.out.println(staff.toString());
		}
	}
		
	}
		
	private void DeleteStaff() {
		System.out.println("Nhập tên cần xóa thông tin: ");
		String deleteName = sc.next();
		Iterator<Staff> iterator = staffList.iterator();
		while (iterator.hasNext()) {
			Staff staff = (Staff) iterator.next();
			if (staff.getHoten().equals(deleteName)) {
				iterator.remove();
			}
		}
		System.out.println("Danh sách thông tin của các cán bộ: ");
		for (Staff staff : staffList) {
			System.out.println(staff);
		}
	}

	private void ShowStaff() {
		System.out.println("Danh sách thông tin của các cán bộ: ");
		for (Staff staff : staffList) {
			System.out.println(staff);
		}
	}

	private void SearchStaff() {
		
	}

	private void addStaff() {
		while (true) {
			System.out.println("=======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                  =====");
			System.out.println("=====            1. Thêm mới Worker.                             ===== ");
			System.out.println("=====            2. Thêm mới Engineer.                            =====");
			System.out.println("===              3. Thêm mới Nhân viên.                             ===");
			System.out.println("===              4. Thoát khỏi chương trình thêm mới cán bộ         ===");
			System.out.println("=======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				addWorker();
				break;

			case 2:
				AddEnginner();
				break;
			case 3:
				addNhanvien();
				break;
			
			case 4:
				return;
				
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}
	}

	private void addNhanvien() {
		System.out.println("=====            Thêm mới Nhân Viên:          ======");
		System.out.println("Nhập tên của nhân viên: ");
		String NameNV = sc.next();
		System.out.println("Nhập tuổi của nhân viên: ");
		int AgeNV = sc.nextInt();
		System.out.println("Chọn giới tính của nhân viên");
		System.out.println("=======================================================================");
		System.out.println("=====        Lựa chọn giưới tính của nhân viên                    =====");
		System.out.println("=====            1. Male.                                        ===== ");
		System.out.println("=====            2. Female.                                       =====");
		System.out.println("===              3. Unknow.                                         ===");
		System.out.println("=======================================================================");
		int menuChooseGenderNV = sc.nextInt();
		GENDER genderNameNV = null;
		switch (menuChooseGenderNV) {
		case 1:
			System.out.println("Giới tinh của nhân viên là :Male");
			genderNameNV = GENDER.MALE;
			break;
		case 2:
			System.out.println("Giới tinh của nhân viên là :Female");
			genderNameNV = GENDER.FEMALE;
			break;
		case 3:
			System.out.println("Giới tinh của nhân viên là :Unknow");
			genderNameNV = GENDER.UNKNOW;
			break;
		}
		System.out.println("Nhập địa chỉ của nhân viên:");
		String AddressNV = sc.next();
		System.out.println("Nhập công viên của nhân viên:");
		String CongviecNV = sc.next();
		Staff nhanvien = new NhanVien(NameNV, AgeNV, genderNameNV, AddressNV, CongviecNV);
		staffList.add(nhanvien);
	}

	private void AddEnginner() {
		System.out.println("=====            Thêm mới Enginner:          ======");
		System.out.println("Nhập tên của kỹ sư: ");
		String NameEnginner = sc.next();
		System.out.println("Nhập tuổi của kỹ sư: ");
		int AgeEnginner = sc.nextInt();
		System.out.println("Chọn giới tính của kỹ sư");
		System.out.println("=======================================================================");
		System.out.println("=====        Lựa chọn giới tính của Enginner                     =====");
		System.out.println("=====            1. Male.                                        ===== ");
		System.out.println("=====            2. Female.                                       =====");
		System.out.println("===              3. Unknow.                                         ===");
		System.out.println("=======================================================================");
		int menuChooseGenderEnginner = sc.nextInt();
		GENDER genderNameEnginner = null;
		switch (menuChooseGenderEnginner) {
		case 1:
			System.out.println("Giới tính của Enginner là :Male");
			genderNameEnginner = GENDER.MALE;
			break;
		case 2:
			System.out.println("Giới tính của Enginner là :Female");
			genderNameEnginner = GENDER.FEMALE;
			break;
		case 3:
			System.out.println("Giới tính của Enginner là :Unknow");
			genderNameEnginner = GENDER.UNKNOW;
			break;
		}
		System.out.println("Nhập địa chỉ của kỹ sư:");
		String AddressEnginner = sc.next();
		System.out.println("Nhập ngành đạo tạo của kỹ sư:");
		String DaotaoEnginner = sc.next();
		Staff enginner = new Engineer(NameEnginner, AgeEnginner, genderNameEnginner, AddressEnginner, DaotaoEnginner);
		staffList.add(enginner);
	}

	private void addWorker() {
		System.out.println("=====            Thêm mới Worker:          ======");
		System.out.println("Nhập tên của công nhân: ");
		String NameWorker = sc.next();
		System.out.println("Nhập tuổi của công nhân: ");
		int AgeWorker = sc.nextInt();
		System.out.println("Chọn giới tính của công nhân");
		System.out.println("=======================================================================");
		System.out.println("=====        Lựa chọn giới tính của công nhân                    =====");
		System.out.println("=====            1. Male.                                        ===== ");
		System.out.println("=====            2. Female.                                       =====");
		System.out.println("===              3. Unknow.                                         ===");
		System.out.println("=======================================================================");
		int menuChooseGenderWorker = sc.nextInt();
		GENDER genderNameWorker = null;
		switch (menuChooseGenderWorker) {
		case 1:
			System.out.println("Giới tính của công nhân là: Male");
			genderNameWorker = GENDER.MALE;
			break;
		case 2:
			System.out.println("Giới tính của công nhân là:Female");
			genderNameWorker = GENDER.FEMALE;
			break;
		case 3:
			System.out.println("Giới tính của công nhân là:Unknow");
			genderNameWorker = GENDER.UNKNOW;
			break;
		}
		System.out.println("Nhập địa chỉ của công nhân:");
		String AddressWorker = sc.next();
		System.out.println("Nhập rank của công nhân:");
		int RankWorker = sc.nextInt();
		Staff worker = new Worker(NameWorker, AgeWorker, genderNameWorker, AddressWorker, AddressWorker);
		staffList.add(worker);
	}
	
	public void question_3() {
		HighSchoolStudent hss = new HighSchoolStudent("Nam", 1, "Chuyên Văn", "Đại học công nghệ");
		System.out.println("Thông tin sinh viên: "+hss.toString());
	}
	
	public void question_4() {
		System.out.println("=====      Question 4:        ======");
		while (true) {
			System.out.println("======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                 =====");
			System.out.println("=====            1. Thêm mới tài liệu.                           =====");
			System.out.println("=====            2. Xóa tài liệu theo mã tài liệu.               =====");
			System.out.println("=====            3. Hiển thị thông tin của tài liệu.             =====");
			System.out.println("=====            4. Tìm kiếm tài liệu theo loại.                 =====");
			System.out.println("=====            5. Thoát khỏi chương trình.                     =====");
			System.out.println("======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				addTaiLieu();
				break;
			case 2:
				deleteTaiLieu();
				break;
			case 3:
				showTaiLieu();
				break;
			case 4:
				searchTaiLieu();
				break;
			case 5:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
	}
}
	}

	private void searchTaiLieu() {
		while (true) {
			System.out.println("=======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                  =====");
			System.out.println("=====            1. Tìm kiếm Sách.                                =====");
			System.out.println("=====            2. Tìm kiếm Tạp Chí.                             =====");
			System.out.println("=====            3. Tìm kiếm Báo.                                 =====");
			System.out.println("=====            4. Thoát khỏi chương trình Tìm kiếm tài liệu.    =====");
			System.out.println("=======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				searchSach();
				break;
			case 2:
				searchTapChi();
				break;
			case 3:
				searchBao();
				break;
			case 4:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}
	}

	private void searchBao() {
		for (QLTL qltl :QTTLList) {
			if (qltl instanceof Bao) {
				System.out.println("Nhập mã Báo để tìm kiếm:");
				int mabao = sc.nextInt();
				if (qltl.getMatailieu() == mabao) {
					System.out.println(qltl);
				}
			}
		}
	}

	private void searchTapChi() {
		for (QLTL qltl : QTTLList) {
			if (qltl instanceof TapChi) {
				System.out.println("Nhập mã Tạp chí để tìm kiếm: ");
				int matapchi = sc.nextInt();
				if (qltl.getMatailieu() == matapchi) {
					System.out.println(qltl);
				}
			}
		}
	}

	private void searchSach() {
		for (QLTL qltl : QTTLList) {
			if (qltl instanceof Sach) {
				System.out.println("Nhập mã Sách để tìm kiếm: ");
				int masach = sc.nextInt();
				if (qltl.getMatailieu() == masach) {
					System.out.println(qltl);
				}
			}
		}
	}

	private void showTaiLieu() {
		System.out.println("Danh sách thông tin tài liệu: ");
		for (QLTL qltl : QTTLList) {
			System.out.println(qltl);
		}
	}

	private void deleteTaiLieu() {
		System.out.println("Nhập mã tài liệu cần xóa: ");
		int matailieu = sc.nextInt();
		Iterator<QLTL> iterator  = QTTLList.iterator();
		while(iterator.hasNext()) {
			QLTL qltl  = (QLTL) iterator.next();
			if (qltl.getMatailieu() == matailieu) {
				iterator.remove();
			}
		}
	}

	private void addTaiLieu() {
		while (true) {
			System.out.println("=======================================================================");
			System.out.println("=====        Lựa chọn chức năng bạn muốn sử dụng                  =====");
			System.out.println("=====            1. Thêm mới Sách.                                =====");
			System.out.println("=====            2. Thêm mới Tạp Chí.                             =====");
			System.out.println("=====            3. Thêm mới Báo.                                 =====");
			System.out.println("=====            4. Thoát khỏi chương trình thêm mới tài liệu.    =====");
			System.out.println("=======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				addSach();
				break;
			case 2:
				addTapChi();
				break;
			case 3:
				addBao();
				break;
			case 4:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
	}
		}
	}

	private void addBao() {
		System.out.println("Nhập mã ID của Báo: ");
		int id = sc.nextInt();
		System.out.println("Nhập tên nhà sản xuất: ");
		String tennhasanxuat = sc.next();
		System.out.println("Nhập số bản phát hành: ");
		String sobanphathanh = sc.next();
		System.out.println("Nhập ngày phát hành của Báo: ");
		int day = sc.nextInt();
		LocalDate ngayphathanh = LocalDate.ofEpochDay(day);
		QLTL bao = new Bao(id, tennhasanxuat, sobanphathanh, ngayphathanh);
		QTTLList.add(bao);
	}

	private void addTapChi() {
		System.out.println("Nhập mã ID của Tạp Chí: ");
		int id = sc.nextInt();
		System.out.println("Nhập tên nhà sản xuất: ");
		String tennhasanxuat = sc.next();
		System.out.println("Nhập số bản phát hành: ");
		String sobanphathanh = sc.next();
		System.out.println("Nhập số phát hành của Tạp Chí: ");
		String sophathanh = sc.next();
		System.out.println("Nhập ngày phát hành của Tạp chí");
		int day = sc.nextInt();
		System.out.println("Nhập tháng phát hành của Tạp Chí: ");
		int month = sc.nextInt();
		System.out.println("Nhập năm phát hành của Tạp Chí: ");
		int year = sc.nextInt();
		LocalDate thangphathanh = LocalDate.of(day, month, year);
		QLTL tapchi = new TapChi(id, tennhasanxuat, sobanphathanh, sophathanh, thangphathanh);
		QTTLList.add(tapchi);
	}

	private void addSach() {
		System.out.println("Nhập mã ID của Sách:");
		int id = sc.nextInt();
		System.out.println("Nhập tên nhà sản xuất: ");
		String tennhasanxuat = sc.next();
		System.out.println("Nhập số bản phát hành: ");
		String sobanphathanh = sc.next();
		System.out.println("Nhập tên tác giả: ");
		String tentacgia = sc.next();
		System.out.println("Nhập số trang: ");
		int sotrang = sc.nextInt();
		QLTL sach = new Sach(id, tennhasanxuat, sobanphathanh, tentacgia, sotrang);
		QTTLList.add(sach);
	}
}