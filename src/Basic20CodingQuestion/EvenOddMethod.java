package Basic20CodingQuestion;

public class EvenOddMethod {

	public static boolean evenOdd(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =523;
		if(evenOdd(num)) {
			System.out.println(num+" is even");
		}
		System.out.println(num+" is odd");
	}

}
