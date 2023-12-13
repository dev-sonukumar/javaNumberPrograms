package class_11_12;

import java.util.Scanner;

public class ProgramTwo {

	public static void main(String[] args) {

		// Take input from user and Remove the last digit ?

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		int result = num / 10;

		System.out.println("After Remove Last Digit of the Number is :- " + result);

	}

}
