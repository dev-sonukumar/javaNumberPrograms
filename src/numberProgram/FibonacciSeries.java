package numberProgram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series
		/*
		 * adding last two digits 0 1 1 2 3
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number - ");
		int num = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 3; i <= num; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

}
