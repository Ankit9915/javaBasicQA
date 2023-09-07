package Basic20CodingQuestion;

public class ReverseString {
	public static boolean checker(String str) {
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		if(str.equals(rev)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abba";
		if(checker(str)) {
		System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		

	}

}
