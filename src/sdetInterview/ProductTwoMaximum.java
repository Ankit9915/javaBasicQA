package sdetInterview;

import java.util.Arrays;

public class ProductTwoMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,8,3,7,1,56};
		int res[]= new int[2];
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]*arr[j]>max) {
					max = arr[i]*arr[j];
					res[0]=arr[i];
					res[1]=arr[j];
				}
			}
		}
		System.out.println(max);
		System.out.println(Arrays.toString(res));
	}

}
