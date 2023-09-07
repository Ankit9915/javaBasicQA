package sdetInterview;


import java.util.*;

public class DuplicateAndMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] ={3,4,2,5,3};
		 Map<Integer, Boolean> numberMap
         = new HashMap<>();

     int max = arr.length;

     for (Integer i : arr) {

         if (numberMap.get(i) == null) {
             numberMap.put(i, true);
         }
         else {
             System.out.println("Repeating = " + i);
         }
     }
     for (int i = 1; i <= max; i++) {
         if (numberMap.get(i) == null) {
             System.out.println("Missing = " + i);
         }
     }
	}

}
