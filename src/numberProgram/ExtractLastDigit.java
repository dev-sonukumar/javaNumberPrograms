package numberProgram;

import java.util.Scanner;

public class ExtractLastDigit {

	public static void main(String[] args) {
		// Extract last digit of any Numbers.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number ");
		int num = sc.nextInt();

		int lastDigit = num % 10;
		System.out.println("Last Digit of Number is - " + lastDigit);

	}

}
