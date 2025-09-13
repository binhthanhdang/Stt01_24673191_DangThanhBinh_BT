package iuh.fit.se.tuan1;

import java.util.Scanner;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 4:45:41 PM
 */
public class Bai29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap M ");
        int M = input.nextInt();

        
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        
        for (int i = M; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= M - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= M - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == M) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}
