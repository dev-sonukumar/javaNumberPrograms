package numberProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Factorial Of a Number

		/*
		 * Number is 5 , then 5! = 5x4x3x2x1 , factorial of 5 is 120.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number - ");

		int num = sc.nextInt();
		int factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a Number is - " + factorial);
	}

}
