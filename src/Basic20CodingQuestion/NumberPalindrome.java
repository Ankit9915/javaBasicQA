package Basic20CodingQuestion;

public class NumberPalindrome {

	public static boolean palindrome(int num) {
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (sum == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1222;
		if (palindrome(n)) {
			System.out.println(n + " isPalidrome");
		} else {
			System.out.println(n + " is not a Palindrome");
		}

	}

}
