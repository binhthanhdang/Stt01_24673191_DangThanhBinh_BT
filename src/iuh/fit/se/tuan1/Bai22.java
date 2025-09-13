package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:46:15 PM
 */
public class Bai22 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("nhap n ");
		int n = input.nextInt();
		
		if(isPrime(n)) System.out.println(n + " là số nguyên tố");
		else System.out.println(n + " không phải số nguyên tố");
		input.close();

	}
	
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		
		int i = 2;
		while(i <= Math.sqrt(n)) {
			if(n % i == 0) return false;
			i++;
		}
		return true;
	}
}
