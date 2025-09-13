package iuh.fit.se.tuan2.tuan3;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 2:56:18 PM
 */
public class VehicleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tieuDe = String.format("%-15s | %-15s | %-15s | %-30s | %-30s", "tên chủ xe", "loại xe", "dung tích", "trị giá", "thuế phải nộp");
		
        Vehicle[] dsXe = new Vehicle[3];
        int n;

        do {
            System.out.println("1. thêm xe");
            System.out.println("2. xuất bảng thuế");
            System.out.println("3. thoát");
            System.out.print("nhâpj lựa chọn: ");
            n = input.nextInt();
            input.nextLine();

            switch(n) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("xe thứ " + (i + 1));
                        System.out.print("nhập tên chủ xe: ");
                        String tenChu = input.nextLine();
                        System.out.print("nhập loại xe: ");
                        String loaiXe = input.nextLine();
                        System.out.print("nhập dung tích: ");
                        int dungTich = input.nextInt();
                        System.out.print("Trị giá: ");
                        double triGia = input.nextDouble();
                        input.nextLine();
                        dsXe[i] = new Vehicle(tenChu, loaiXe, dungTich, triGia);
                    }
                    break;

                case 2:
                    System.out.println(tieuDe);
                    for (Vehicle v : dsXe) {
                        System.out.println(v);
                    }
                    break;
                case 3:
                	System.out.println("thoát chương trình");
                	break;
            }

        } while (n != 3);

	}

}
