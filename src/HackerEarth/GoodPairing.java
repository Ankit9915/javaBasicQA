package HackerEarth;
import java.util.*;
public class GoodPairing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		int arr[] = {1,2,3,1,1,3};
		//output is 4 because (0,3),(0,4),(3,4),(3,5)
		int result =0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],1);
			}else 
				map.put(arr[i], map.get(arr[i])+1);	
		}
		for(Map.Entry elements: map.entrySet()) {
			int freq=(int) elements.getValue();
			result = result + (freq*(freq-1)/2);
		}
		System.out.println(result);
	}

}
