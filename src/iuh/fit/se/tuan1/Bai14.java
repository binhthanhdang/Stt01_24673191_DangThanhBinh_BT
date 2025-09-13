package iuh.fit.se.tuan1;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:02:39 PM
 */
public class Bai14 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;

        if (n % 2 == 0) {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("tổng lẻ " + sum);
        } else {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("tổng chẵn " + sum);
        }
    }
}

