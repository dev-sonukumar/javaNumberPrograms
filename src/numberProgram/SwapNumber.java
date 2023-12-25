package numberProgram;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// Swap two Numbers

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number 1");
		int a = sc.nextInt();

		System.out.println("Enter Number 2");
		int b = sc.nextInt();

		System.out.println("Before swap");
		System.out.println("a - " + a + "\n" + "b - " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap");
		System.out.println("a - " + a + "\n" + "b - " + b);

	}

}
