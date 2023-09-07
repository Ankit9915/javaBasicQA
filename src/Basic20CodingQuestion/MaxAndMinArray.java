package Basic20CodingQuestion;

public class MaxAndMinArray {
	public static int Maximum(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int Minnimum(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {45,12,76,23,1,3};
	System.out.println(Maximum(arr));
		System.out.println(Minnimum(arr));
	}

}
