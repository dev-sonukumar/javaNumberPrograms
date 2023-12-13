package class_11_12;

import java.util.Scanner;

public class ProgramOne {

	public static void main(String[] args) {

		// Take input from user and Extract the Number ?

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		int result = num % 10;

		System.out.println("Last Digit of the Number is :- " + result);

	}

}
