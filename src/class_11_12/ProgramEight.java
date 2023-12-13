package class_11_12;

import java.util.Scanner;

public class ProgramEight {

	public static void main(String[] args) {
		// Take input from user and print the factorial of the Number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number ");

		int num = sc.nextInt();

		int factorial = 1;
		for (int i = num; i >= 1; i--) {

			factorial = factorial * i;

		}
		System.out.println("Factorial of num is :- " + factorial);

	}

}
