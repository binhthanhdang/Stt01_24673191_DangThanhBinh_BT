package iuh.fit.se.tuan1;

/**
 * @description: My Introduction
 * @author: Dang Thanh Binh
 * @version: 1.0
 * @created: Sep 11, 2025 4:37:00 PM
 */
public class Bai28 {
	public static void main(String[] args) {
		int n = 9;


		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == n - 1 || j == 0 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");

		
		int i = 0;
		while (i < n) {
			int j = 0;
			while (j < n) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("\n");
		

		i = 0;
		do {
            int j = 0;
            do {
                if (i == j || i + j == n - 1 || i == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j < n);
            System.out.println();
            i++;
        } while (i < n);
	}
}
