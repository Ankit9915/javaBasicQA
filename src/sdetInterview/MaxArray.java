package sdetInterview;

public class MaxArray {

	public void maxArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	public void minArray(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		int arr[] = {4,8,5,31,2,1};
		MaxArray ma = new MaxArray();
		ma.maxArray(arr);
		ma.minArray(arr);
	}
}
