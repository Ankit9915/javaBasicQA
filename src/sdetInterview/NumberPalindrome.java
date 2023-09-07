package sdetInterview;

public class NumberPalindrome {

	public void Isnumber(int n) {
		 int copyOfOriginal = n;
		    int reversedNumber = 0;
		    int remainder;
		while(n>0) {
			 remainder = n % 10;
			 reversedNumber = (reversedNumber * 10) + remainder;

			n = n /10;	
		}
		if(reversedNumber==copyOfOriginal) {
			System.out.println("true");
		}
		
	}
	public static void main(String[] args) {
		int n = 146451;
		NumberPalindrome np = new NumberPalindrome();
		np.Isnumber(n);
	}
}
