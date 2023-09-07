package sdetInterview;

public class ReverseArray {

	public  void reverseArray(int a[],int n) {
		int b[] = new int[n];
		int j = n;
		for(int i = 0;i<n;i++) {
			b[j-1]=a[i];
			j=j-1;
		}
		for(int k =0;k<n;k++) {
			System.out.print(b[k]+" ");
		}
		
	}
	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		int arr[] = {4,76,23,5,98};
		ra.reverseArray(arr, arr.length);
	}
}
