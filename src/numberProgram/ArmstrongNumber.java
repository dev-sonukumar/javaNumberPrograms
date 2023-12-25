package numberProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// ArmStrong Number
		/*
		 * 153 --> 1^3 + 5^3 + 3^3 = 153 // This is Armstrong Number
		 * 
		 * 123 --> 1^3 + 2^3 + 3^3 = 36 // This is Not a Armstrong Number
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number to check number is Armstrong or not ?");
		long num = sc.nextLong();

		long temp;
		long strong = 0;
		long copyNumOne = num;
		long copyNumTwo = num;

//		---- Start count of a number ----

		long count = 0;
		while (copyNumOne != 0) {
			copyNumOne = copyNumOne / 10;
			count++;
		}

//		---- End count of a number ---

		while (num != 0) {
			temp = num % 10;
			temp = (long) Math.pow(temp, count);
			strong = strong + temp;
			num = num / 10;
		}
		System.out.println("count of Numbers is - " + count);

		if (strong == copyNumTwo) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is Not a Armstrong");

		}
	}

}
