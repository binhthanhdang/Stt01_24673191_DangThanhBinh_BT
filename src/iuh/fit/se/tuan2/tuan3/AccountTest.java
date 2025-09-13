package iuh.fit.se.tuan2.tuan3;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 5:48:05 PM
 */
public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        AccountList list = new AccountList();
        int choice;
        do {
            System.out.println("1. Thêm tài khoản");
            System.out.println("2. Số TK hiện có");
            System.out.println("3. In thông tin tất cả TK");
            System.out.println("4. Nạp tiền vào TK");
            System.out.println("5. Rút tiền");
            System.out.println("6. Chuyển tiền");
            System.out.println("7. Đáo hạn (cộng lãi cho 1 TK)");
            System.out.println("8. Xóa TK theo số TK");
            System.out.println("9. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Số tài khoản: ");
                    long sotk = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Tên tài khoản: ");
                    String ten = sc.nextLine();
                    System.out.print("Số tiền: ");
                    double tien = sc.nextDouble();
                    sc.nextLine();
                    Account a = new Account(sotk, ten, tien);
                    if (list.add(a)) System.out.println("Thêm thành công.");
                    else System.out.println("Thêm thất bại (trùng hoặc đầy).");
                    break;

                case 2:
                    System.out.println("Số TK hiện có: " + list.size());
                    break;

                case 3:
                    list.printAll();
                    break;

                case 4:
                    System.out.print("Số TK nhận nạp: ");
                    long tknap = sc.nextLong();
                    sc.nextLine();
                    Account accNap = list.findByNumber(tknap);
                    if (accNap == null) {
                        System.out.println("Không tìm thấy TK.");
                    } else {
                        System.out.print("Số tiền nạp: ");
                        double amt = sc.nextDouble();
                        sc.nextLine();
                        if (accNap.napTien(amt)) System.out.println("Nạp OK.");
                        else System.out.println("Nạp thất bại: " + accNap.getTrangThai());
                    }
                    break;

                case 5:
                    System.out.print("Số TK rút: ");
                    long tkrut = sc.nextLong();
                    sc.nextLine();
                    Account accRut = list.findByNumber(tkrut);
                    if (accRut == null) {
                        System.out.println("Không tìm thấy TK.");
                    } else {
                        System.out.print("Số tiền rút: ");
                        double amtR = sc.nextDouble();
                        sc.nextLine();
                        if (accRut.rutTien(amtR)) System.out.println("Rút OK.");
                        else System.out.println("Rút thất bại: " + accRut.getTrangThai());
                    }
                    break;

                case 6:
                    System.out.print("Số TK nguồn: ");
                    long tkFrom = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Số TK đích: ");
                    long tkTo = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Số tiền chuyển: ");
                    double amtC = sc.nextDouble();
                    sc.nextLine();
                    Account from = list.findByNumber(tkFrom);
                    Account to = list.findByNumber(tkTo);
                    if (from == null || to == null) {
                        System.out.println("Không tìm thấy 1 trong 2 tài khoản.");
                    } else {
                        if (from.chuyenTien(to, amtC)) System.out.println("Chuyển tiền thành công.");
                        else System.out.println("Chuyển thất bại: " + from.getTrangThai());
                    }
                    break;

                case 7:
                    System.out.print("Số TK đáo hạn: ");
                    long tkDH = sc.nextLong();
                    sc.nextLine();
                    Account accDH = list.findByNumber(tkDH);
                    if (accDH == null) System.out.println("Không tìm thấy TK.");
                    else {
                        accDH.daoHan();
                        System.out.println("Đáo hạn xong: " + accDH.getTrangThai());
                    }
                    break;

                case 8:
                    System.out.print("Số TK cần xóa: ");
                    long tkDel = sc.nextLong();
                    sc.nextLine();
                    if (list.removeByNumber(tkDel)) System.out.println("Xóa thành công.");
                    else System.out.println("Xóa thất bại (không tìm thấy).");
                    break;

                case 9:
                    System.out.println("Kết thúc chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
            System.out.println();
        } while (choice != 9);

        sc.close();

	}

}
