package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:56:33 PM
 */
public class Bai23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("nhap a ");
		int a = input.nextInt();
		System.out.print("nhap b ");
		int b = input.nextInt();
		
		System.out.println("USCLN = " + gcd(a, b));
		input.close();
		
	}

	public static int gcd(int a, int b) {
		int temp;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return Math.abs(a);
	}

}
