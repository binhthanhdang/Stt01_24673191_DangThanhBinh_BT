package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:39:01 PM
 */
public class Bai21 {

	public static void main(String[] args) {
		String string = "Bai Tap Mon Lap Trinh Java";
		
		String[] newString = string.split(" ");
		
		for (String x : newString) {
			System.out.println(x);
		}
		
	}

}
