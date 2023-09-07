package Basic20CodingQuestion;

public class GcdLcm {
	public static int gcd(int a,int b) {
		int gcd =1;
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	public static int lcm(int a,int b) {
		int res = a * b / gcd(a,b);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=51;
		int b=6;
				
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
				
	}

}
