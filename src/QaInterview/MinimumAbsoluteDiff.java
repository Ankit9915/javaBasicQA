package QaInterview;

import java.util.Arrays;

public class MinimumAbsoluteDiff {

	public static void main(String[] args) {
		int arr[] = {1,5,6,8,10};
	int res[] = new int[2];
		int diff = Integer.MAX_VALUE;
		for(int i =0;i<arr.length-1;i++){
			
				for(int j =i+1;j<arr.length;j++) {
					if(Math.abs((arr[i]-arr[j]))< diff) {
						
						diff=Math.abs((arr[i]-arr[j]));
						res[0]=arr[i];
						res[1]=arr[j];
				}
			}
		}
		System.out.println(diff);
		System.out.println(Arrays.toString(res));
 
		
		
	}

}
