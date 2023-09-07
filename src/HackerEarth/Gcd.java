package HackerEarth;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6;
		int b = 10;
		int gcd=1;
		for(int i=1;i<=a&&i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		
		//Using Euclid's Algorithm
		
		System.out.println(findGcd(a,b));
	}

	static int findGcd(int a,int b) {
		int r=0;
		int x;
		int y;
		x=a>b?a:b;
		y=a<b?a:b;
		r=b;
		while(x%y!=0) {
			r=x%y;
			x=y;
			y=r;
		}
		return r;
	}
}
