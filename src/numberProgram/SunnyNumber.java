package numberProgram;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		// Sunny Number
		/*
		 * number = 8 --> 8 + 1 = 9 ---> square root of 3 . // Number is Sunny Number
		 * 
		 * number = 11 --> 11 + 1 = 12 ---> not any perfect square root of any number .
		 * // Number is not a Sunny Number
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number to check Number is Sunny Number or not");
		int num = sc.nextInt();

		double next = num + 1;
		double sqrt = Math.sqrt(next);
		if ((sqrt - Math.floor(sqrt)) == 0) {
			System.out.println((int) sqrt + " is a sunny Number");

		} else {
			System.out.println((int) sqrt + " is Not a sunny Number");

		}

	}

}
