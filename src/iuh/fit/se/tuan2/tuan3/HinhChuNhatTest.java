package iuh.fit.se.tuan2.tuan3;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 12, 2025 1:25:39 PM
 */
public class HinhChuNhatTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("nhập chiều dài: ");
		double dai = input.nextDouble();
		System.out.print("nhập chiều rộng: ");
		double rong = input.nextDouble();
		
		HinhChuNhat h1 = null;
		String tieuDe = String.format("%-10s | %-10s | %-10s | %-10s", "Chiều Dài", "Chiều Rộng", "Diện Tích", "Chu Vi");
		
		 try {
	            h1 = new HinhChuNhat(dai, rong);
	            System.out.println(tieuDe);
	            System.out.println(h1);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        } finally {
	        	input.close();
	        }
	
	}

}
