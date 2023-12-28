package numberProgram;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check spy number ?");

		int num = sc.nextInt();

		int copyNum = num;
		int sum = 0;
		int product = 1;

		while (num != 0) {
			int a = num % 10;
			sum = sum + a;
			product = product * a;
			num = num / 10;
		}

		if (sum == product) {
			System.out.println("Your Number is Spy Number - " + copyNum + " ✔️");

		} else {
			System.out.println("Your Number is Not a Spy Number - " + copyNum + " ❌");

		}

	}

}
