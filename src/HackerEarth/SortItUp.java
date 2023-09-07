package HackerEarth;

import java.util.Arrays;

public class SortItUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,0,1,0,2};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
