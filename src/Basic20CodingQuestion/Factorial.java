package Basic20CodingQuestion;

import java.math.BigInteger;

public class Factorial {
	public static BigInteger fact(int num) {
		BigInteger fact = BigInteger.ONE;
		for (int i = num; i > 0; i--) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 80;
		System.out.println(fact(num));
	}

}
