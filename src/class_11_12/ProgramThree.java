package class_11_12;

import java.util.Scanner;

public class ProgramThree {

	public static void main(String[] args) {
		// Take input from user and Count the number of digits ?

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();

		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}

		System.out.println("Last Digit of the Number is :- " + count);

	}

}
