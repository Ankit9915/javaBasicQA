package sdetInterview;

import java.util.Arrays;

public class SumofTwoArray {

	public void sumPair(int arr[],int n) {
		int res[] = new int[2];
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==n) {
					res[0]=arr[i];
					res[1]=arr[j];
				}
			}
			
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) {
		int arr[]= {1,6,3,8,9,};
		int  n = 17;
		SumofTwoArray sta = new SumofTwoArray();
		sta.sumPair(arr, n);
	}
}
