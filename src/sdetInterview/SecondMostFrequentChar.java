package sdetInterview;

public class SecondMostFrequentChar {

	static final int  No_Of_chars = 256;
	static char getChar(String str) {
		int count[] = new int[No_Of_chars];
		for(int i=0;i<str.length();i++) 
			(count[str.charAt(i)])++;
		
		int first = 0,second = 0;
		for(int i=0;i<No_Of_chars;i++) {
			if(count[i]>count[first]) {
				second = first;
				first = i;
			}
			else if(count[i]>count[second] && count[i]!=count[first]) {
				second = i;
			}
		}
		return (char)second ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeks";
	      char res = getChar(str);
	      if (res != '\0')
	         System.out.println("Second most frequent char"+
	                                       " is " + res);
	      else
	         System.out.println("No second most frequent"+
	                                       "character");
	}

}
