package Basic20CodingQuestion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {65,67,23,56,67,43};
		int n= 67;
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid=(start + end-1)/2;
			if(arr[mid]==n) {
				System.out.println(mid);
			}
			if(arr[mid]<n) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
	}

}
