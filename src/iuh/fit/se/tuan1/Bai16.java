package iuh.fit.se.tuan1;

 /**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 3:09:01 PM
 */
public class Bai16 {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        if (a == 0) {
            if (b == 0) {
                System.out.println("vô số nghiệm.");
            } else {
                System.out.println("vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }
}

