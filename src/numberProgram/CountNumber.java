package numberProgram;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		// Count of a Number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number - ");
		int num = sc.nextInt();

		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Numbers of Digit is - " + count);
	}

}
