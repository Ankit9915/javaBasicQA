package sdetInterview;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println("Given String is:"+str);
		for(int i =0;i<str.length();i++) {
			boolean unique = true;
			for(int j =0;j<str.length();j++) {
				if(i!=j&& str.charAt(i)==str.charAt(j)) {
					unique = false;
					break;
				}
			}
			if(unique) {
				System.out.println("The first repeated character is:"+str.charAt(i));
				break;
			}
		}

	}

}
