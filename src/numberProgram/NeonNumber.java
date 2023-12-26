package numberProgram;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// Neon Number
		/*
		 * num -9 --> 9^9 = 81, 8+1 = 9 //Number is Neon Number
		 * 
		 * num -8 --> 8^8 = 64, 6+4 = 10 // Number is not Neon Number
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number to check Number is Neon Number is Not ? ");
		int num = sc.nextInt();

		int squar = (int) Math.pow(num, 2);

//		int copyNumber = num;
		int sum = 0;
		int sq = 0;

		while (squar != 0) {
			sq = squar % 10;
			sum = sum + sq;
			squar = squar / 10;
		}

		if (num == sum) {
			System.out.println(sum + " Number is a Neon Number");
		} else {
			System.out.println(sum + " Number is Not a Neon Number");
		}
	}

}
