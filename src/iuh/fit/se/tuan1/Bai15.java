package iuh.fit.se.tuan1;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:06:02 PM
 */
public class Bai15 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = min;

        for (int i = 1; i < args.length; i++) {
            int val = Integer.parseInt(args[i]);
            if (val < min) min = val;
            if (val > max) max = val;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
