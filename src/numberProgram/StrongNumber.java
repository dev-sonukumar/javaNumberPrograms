package numberProgram;

import java.util.Scanner;

public class StrongNumber {

	static int factorial(int y) {
		int f = 1;
		for (int i = y; i >= 1; i--) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		// Strong Number , Peterson Number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number - ");

		int num = sc.nextInt();

		int temp;
		int strong = 0;
		int copy = num;

		while (num != 0) {
			temp = num % 10;

			int x = factorial(temp);
			strong = strong + x;

			num = num / 10;
		}

		if (copy == strong) {
			System.out.println("Number is Strong Number- " + strong);
		} else {
			System.out.println("Number is Not a Strong Number- " + strong);
		}
	}

}
