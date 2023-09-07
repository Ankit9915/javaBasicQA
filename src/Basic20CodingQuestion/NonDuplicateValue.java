package Basic20CodingQuestion;

import java.util.*;

public class NonDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 2, 3, 2, 4, 5, 4, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]) && map.get(arr[i]) == 1) {
				System.out.println(arr[i]);	
			}
		}

	}

}
