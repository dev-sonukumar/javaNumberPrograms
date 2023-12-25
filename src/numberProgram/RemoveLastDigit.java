package numberProgram;

import java.util.Scanner;

public class RemoveLastDigit {

	public static void main(String[] args) {
		// Remove last Digit of a Number

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number");
		int num = sc.nextInt();

		int removedLastDigit = num / 10;

		System.out.println("After last digit Removed - " + removedLastDigit);

	}

}
