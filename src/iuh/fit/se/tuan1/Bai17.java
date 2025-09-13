package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:13:42 PM
 */
public class Bai17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("nhap so nguyen ");
		int n = input.nextInt();
		
		if(n == 0) System.out.println("zero");
		else if(n%2 != 0) System.out.println("odd");
		else System.out.println("even");
		
		input.close();
	}

}
