package sdetInterview;

public class StringPallinDrome {

	public void palindromeString(String str) {
		int j = str.length()-1;
		for(int i =0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(j-i)) {
				System.out.println("false");
			}
		}
		System.out.println("true");
	}
	public static void main(String args[]) {
		String s = "radar";
		StringPallinDrome spd = new StringPallinDrome();
		spd.palindromeString(s);
	}
}
