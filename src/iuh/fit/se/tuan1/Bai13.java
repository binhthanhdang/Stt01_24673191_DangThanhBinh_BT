package iuh.fit.se.tuan1;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 2:54:38 PM
 */
public class Bai13 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("tổng n " + sum);
    }
}

