package HackerEarth;
import java.util.*;
public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//total number of kids
		int n =5;
		//number of candies kids have
		int arr[] = {2,3,5,1,3};
		//Extra Candies 
		int extra = 3;
		//output is [1,1,1,0,1]
		ArrayList<Integer> list = new ArrayList<>();
		int max=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(extra+arr[i]>=max) {
				list.add(1);
			}
			else
				list.add(0);
		}
		System.out.println(list);

}
}
