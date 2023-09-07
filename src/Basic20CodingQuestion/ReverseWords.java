package Basic20CodingQuestion;

public class ReverseWords {
	public static void reverseSentence(String str) {
		StringBuilder buffer = new StringBuilder();
		String words[] = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--) {
			buffer.append(words[i] + " ");
		}
		System.out.println(buffer.toString());
	}

	public static void reverseWord(String str) {
		String rev = " ";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " i am java hello am i";
		String s = "ankit";
		reverseSentence(str);
		reverseWord(s);

	}

}
