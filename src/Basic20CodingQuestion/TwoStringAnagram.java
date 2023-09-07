package Basic20CodingQuestion;

import java.util.Arrays;

public class TwoStringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="silent";
		String s2 = "lient";
		int n1 = s1.length();
		int n2 =s2.length();
		if(n1==n2) {
			char arr1[]=s1.toCharArray();
			char arr2[]=s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean result = Arrays.equals(arr1, arr2);
			if(result) {
				System.out.println("anagram");
			}else {
				System.out.println("Not anagram");
			}
		}else
			System.out.println("Not anagram");

	}

}
