package sdetInterview;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 153;
		int temp=n;
		int sum=0;
		while(n>0) {
			int r = n%10;
			sum+= r*r*r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}else {
			System.out.println("not a armstrong");
		}
	}

}
