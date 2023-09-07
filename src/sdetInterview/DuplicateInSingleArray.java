package sdetInterview;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class DuplicateInSingleArray {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 4, 5, 6, 7, 8};
		int[] common = findCommonElements(array);
		System.out.println("Common Elements :");
         for(int element:common) {
        	 System.out.println(element+" ");
         }
	}
         public static int[] findCommonElements(int[] array) {
        	 HashSet<Integer> set = new HashSet<>();
        	 List<Integer> list = new ArrayList<>();
        	 for(int i : array) {
        		 if(!set.add(i)) {
        			 list.add(i); 
        		 }	 
         }
        	 int[] res = new int[list.size()];
        	 for(int i =0;i<res.length;i++) {
        		 res[i]=list.get(i);
        	 }
        	 return res;
		
	}

	

}
