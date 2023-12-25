package numberProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Check Number is Palindrome or not.
		/*
		 * If number = 121, After reverse number = 121, this is Palindrome
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number - ");
		int num = sc.nextInt();
		int copyNum = num;

		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}

		if (copyNum == reverse) {
			System.out.println("Number is Palindrome - " + reverse);
		} else {
			System.out.println("Number is Not Palindrome - " + reverse);

		}
	}

}
