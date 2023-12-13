package class_11_12;

public class ProgramTen {

	public static void main(String[] args) {
		// Take input from user and swap both number without variable?

		int a = 10;
		int b = 20;
		System.out.println("Before Swap - " + a + " , " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap - " + a + " , " + b);

	}

}
