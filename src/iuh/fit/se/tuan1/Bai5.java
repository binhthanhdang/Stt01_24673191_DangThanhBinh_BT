package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 1:37:06 PM
 */
public class Bai5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("nhap ten: ");
		String name = input.nextLine();
		
		System.out.println("Hello " + name);
		
		input.close();
	}
}
