package sdetInterview;

import java.util.Arrays;

public class MaximumAbsDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,3,7,8,87,25};
		int max = Integer.MIN_VALUE;
		int res[]=new int[2];
		for(int i =0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if (Math.abs((arr[i]-arr[j]))>max) {
					max= (Math.abs(arr[i]-arr[j]));
					res[0]=arr[i];
					res[1]=arr[j];
				}
			}
		}
		System.out.println(max);
		System.out.println(Arrays.toString(res));
	}

}
