package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 4:14:02 PM
 */
public class Bai25 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("nhap n ");
		int n = input.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(isPrime(i)) sum += i;
		}
		
		System.out.println("tổng n nguyên tố " + sum);
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
