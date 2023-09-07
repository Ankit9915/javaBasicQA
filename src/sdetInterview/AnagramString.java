package sdetInterview;

import java.util.Arrays;

public class AnagramString {


	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		int n1 = s1.length();
		int n2 = s2.length();
		
		if(n1==n2) {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			 Arrays.sort(arr1);
		      Arrays.sort(arr2);
		      boolean result = Arrays.equals(arr1, arr2);
		      if(result) {
		          System.out.println(s1 + " and " + s2 + " are anagram.");
		        }
		        else {
		          System.out.println(s1 + " and " + s2 + " are not anagram.");
		        }
		      }
		      else {
		        System.out.println(s1 + " and " + s2 + " are not anagram.");
		      }
			
	}
}
