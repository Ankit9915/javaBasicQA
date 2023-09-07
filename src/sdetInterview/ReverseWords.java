package sdetInterview;

public class ReverseWords {

	public void reverseWords(String str) {
		StringBuilder reverseWords = new StringBuilder();
		String[] words = str.split(" ");
		for(int i = words.length-1;i>=0;i--) {
			reverseWords.append(words[i] + " ");
			
		}
		System.out.println( reverseWords.toString().trim());
	}
	public static void main(String[] args) {
		String str = "i am ankit singh";
		ReverseWords rw = new ReverseWords();
		rw.reverseWords(str);
	}
}
