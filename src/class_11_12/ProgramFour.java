package class_11_12;

import java.util.Scanner;

public class ProgramFour {

	public static void main(String[] args) {
		// Take input from user and Reverse a Number?
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number : ");
		int num = sc.nextInt();

		int result = num;
		int remender;
		int reverse = 0;

		while (num > 0) {
			remender = num % 10;
			reverse = reverse * 10 + remender;
			num = num / 10;
		}

		System.out.println("Reverse Number is - " + reverse);

	}

}
