package numberProgram;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		// Tech Number
		/*
		 * Number = 3025 --> 30 + 25 = 55 --> 55*55 --> 3025
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1000 to 9999 to find Tech Number ");

		int num = sc.nextInt();
		int copyNum = num;

		int a = num % 100;
		num = num / 100;

		int b = num % 100;

		num = num / 100;

		int tech = (int) Math.pow((a + b), 2);

		if (copyNum == tech) {
			System.out.println("Your Number is Tech Number - " + tech + " ✔️");
		} else {
			System.out.println("Your Number is Not a Tech Number - " + tech + " ❌");

		}
	}

}
