package sdetInterview;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		
		int arr[] = {3,78,9,76,2,43,105};
		
		//Selection sort
		for(int i =0;i<arr.length;i++) {
			int minIndex= i;
			int min=arr[i];
			for(int j =i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min = arr[j];
					minIndex=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println(Arrays.toString(arr));
		//Bubble sort
		int a[] = {54,76,23,1,6,4,87};
		int temp = 0;
		for(int i =0;i<a.length;i++) {
			for(int j=1;j<a.length-1;j++) {
				if(a[j-1]>a[j]) {
					temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	
	

	}

}
