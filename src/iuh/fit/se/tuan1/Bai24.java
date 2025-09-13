package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 4:03:54 PM
 */
public class Bai24 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("nhap n ");
		int n = input.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) sum += i;
		
		System.out.println("tổng n " + sum);
		input.close();

	}

}
