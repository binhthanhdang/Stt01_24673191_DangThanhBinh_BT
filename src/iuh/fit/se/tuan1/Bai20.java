package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:35:14 PM
 */
public class Bai20 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("nhap chuoi ");
		String string = input.nextLine();
		
		int count = 0;
		char c;
		for(int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			if(Character.isDigit(c)) count++;
		}
		
		System.out.println(count);
		input.close();

	}

}
