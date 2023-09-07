package sdetInterview;

public class Fibnocci {

	public void fib(int n) {
		int a =0;
		int b=1;
		int temp =0;
		for(int i=0;i<n;i++) {
			System.out.println(a);
			temp= a +b;
			a= b;
			b= temp;
		}
	}
	//using recursion
	int fibo(int num) {
		if(num==1||num==2) {
			return 1;
		}
		return fibo(num-1)+ fibo(num-2);
	}
	public static void main(String[] args) {
		int n = 10;
		Fibnocci fb = new Fibnocci();
		fb.fib(n);
		fb.fibo(n);
	}
}
