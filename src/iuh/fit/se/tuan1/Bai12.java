package iuh.fit.se.tuan1;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 2:51:06 PM
 */
public class Bai12 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			if(i%7 == 0) sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
