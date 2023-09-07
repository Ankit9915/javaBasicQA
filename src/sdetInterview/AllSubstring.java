package sdetInterview;

public class AllSubstring {

	public static void main(String[] args) {
		//by using substringMethod
		String s = "abc";
		for(int i =0;i<s.length();i++) {
			for(int j= i+1;j<=s.length();j++) {
				System.out.println(s.substring(i, j));
			}
		}
		//using string builder
		String str ="Ankit";
		 for(int i =0;i<str.length();i++) {
			StringBuilder subString = new StringBuilder().append(str.charAt(i));
			System.out.println(subString);
			for(int j=i+1;j<str.length();j++) {
				subString.append(str.charAt(j));
				System.out.println(subString);
			}
		 }

	}

}
