package numberProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime Number or not

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number to check Number is Prime or not ? ");
		int num = sc.nextInt();

		boolean prime = true;
		if (num == 2) {
			System.out.println(num + " is Prime");
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}

		}

		if (prime == true) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is Not a Prime Number");
		}

	}
}
