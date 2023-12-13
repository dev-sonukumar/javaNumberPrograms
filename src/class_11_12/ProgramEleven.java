package class_11_12;

import java.util.Scanner;

public class ProgramEleven {

	public static void main(String[] args) {
		// take a input from user and write fibonacci sequence

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number : - ");
		int num = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);

		for (int i = 2; i <= num; i++) {
			int c = a + b;
			a = b;
			b = c;

			System.out.println(c);
		}

	}

}
