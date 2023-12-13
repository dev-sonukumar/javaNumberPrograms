package class_11_12;

import java.util.Scanner;

public class ProgramSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				System.out.println("Factor " + i);
				sum = sum + i;
			}
		}

		System.out.println("Sum of Factor is : - " + sum);

	}

}
