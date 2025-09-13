package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:27:52 PM
 */
public class Bai19 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("nhap chuoi ");
		String string = input.nextLine();
		
		int count = 0;
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == 'a') count++;
		}
		
		System.out.println(count);
		input.close();
	}

}
