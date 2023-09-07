package sdetInterview;

import java.util.Arrays;

public class MoveNegativeAtFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {6,7,2,-6,-8,7};
		int j=0;
		int temp;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
