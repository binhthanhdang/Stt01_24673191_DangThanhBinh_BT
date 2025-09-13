package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 4:26:03 PM
 */
public class Bai27 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("nhap n ");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
            System.out.print(Fibonaci(i) + " ");
        }
		
		input.close();

	}
	
	public static int Fibonaci(int n) { 
		if(n == 1 || n == 2) return 1;
		
		return Fibonaci(n - 1) + Fibonaci(n - 2);
	}

}
