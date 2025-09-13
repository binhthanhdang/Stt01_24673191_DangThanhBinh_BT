package iuh.fit.se.tuan1;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 2:38:14 PM
 */
public class Bai10 {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        int sum = 0;
        while (count < 10) {
        	sum += i;
        	count++;
        	i += 2;
        }
        System.out.println(sum);
    }
}

