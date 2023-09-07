package Basic20CodingQuestion;

public class ArrayReverse {
	public static int[] reverseTwoPointer(int[] arr) {
		int start =0;
		int end = arr.length-1;
		
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	    
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {34,56,23,12,4};
		int res[] =reverseTwoPointer(arr);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		
		
		
	}

}
