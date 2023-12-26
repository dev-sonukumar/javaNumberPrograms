package numberProgram;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// Automorphic Number
		/*
		 * number - 76 --> 76 x 76 = 5776 // here last two digit is same as number ,
		 * Automorphic number - 23 --> 23 x 23 = 529 // here last two digit is not same
		 * as number , Not Automorphic
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check Number is automorphic or not ?");

		int num = sc.nextInt();
		int sqr = (int) Math.pow(num, 2);

		if (num < 0 && num >= 9) {
			int ext = sqr % 10;

			if (num == ext) {
				System.out.println(ext + " is a Automorphic Number");
			} else {
				System.out.println(ext + " is Not a Automorphic Number");

			}
		} else {

			int ext = sqr % 100;

			if (num == ext) {
				System.out.println(ext + " is a Automorphic Number");
			} else {
				System.out.println(ext + " is Not a Automorphic Number");

			}

		}

	}

}
