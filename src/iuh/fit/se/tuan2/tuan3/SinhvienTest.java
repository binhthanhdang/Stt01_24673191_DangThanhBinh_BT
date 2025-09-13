package iuh.fit.se.tuan2.tuan3;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 2:06:54 PM
 */
public class SinhvienTest {

	public static void main(String[] args) {
		Sinhvien sv1 = new Sinhvien(24673191, "Đặng Thanh Bình", 7, 6);
		Sinhvien sv2 = new Sinhvien(24681861, "Nguyễn Minh Quốc", 6, 7);
		Sinhvien sv3 = new Sinhvien();
		
		Scanner input = new Scanner(System.in);
		System.out.print("nhập mã sinh viên: ");
		int maSV = input.nextInt();
		sv3.setMaSV(maSV);
		input.nextLine();
		System.out.print("nhập họ tên: ");
		String hoTen = input.nextLine();
		sv3.setHoTen(hoTen);
		System.out.print("nhập điểm lý thuyết: ");
		float diemLT = input.nextFloat();
		sv3.setDiemLT(diemLT);
		System.out.print("nhập điểm thực hành: ");
		float diemTH = input.nextFloat();
		sv3.setDiemTH(diemTH);
		
		String tieuDe = String.format("%-15s | %-20s | %-20s | %-20s | %-10s", "mã sinh viên", "họ tên", "điểm lý thuyết", "điểm thực hành", "điểm trung bình");
		
		System.out.println(tieuDe);
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
		input.close();
	}

}
