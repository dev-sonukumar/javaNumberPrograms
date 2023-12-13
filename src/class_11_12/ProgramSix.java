package class_11_12;

public class ProgramSix {

	public static void main(String[] args) {

		int num = 1234;
		int reverse = 0;
		int reminder;
		while (num != 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		System.out.println(reverse);

		int remove = reverse / 10;

		// -----------------

		int newNum = remove;
		int rev = 0;
		int rem;
		while (newNum != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			newNum = newNum / 10;
		}

		System.out.println(newNum);

	}

}
