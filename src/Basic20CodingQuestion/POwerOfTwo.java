package Basic20CodingQuestion;

public class POwerOfTwo {

	public static boolean powerTwo(int num) {
		while(num!=1) {
			if(num%2==0) {
				return true;
			}
			num=num/2;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=256;
		if(powerTwo(num)) {
			System.out.println("power of two");
		}
		else {
			System.out.println("not power of two");
		}
	}

}
