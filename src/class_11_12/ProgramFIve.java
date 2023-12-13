package class_11_12;

public class ProgramFIve {

	public static void main(String[] args) {
		// Take input from user and Check this Number is palindrome or not ?

		int num = 1458;
		int result = num;
		int remender;
		int reverse = 0;

		while (num > 0) {
			remender = num % 10;
			reverse = reverse * 10 + remender;
			num = num / 10;
		}

		if (result == reverse) {
			System.out.println("Number is Plandrom - " + reverse);
		} else {
			System.out.println("Number is not a palindrom - " + reverse);
		}

	}

}
