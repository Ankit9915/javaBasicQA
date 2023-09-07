package sdetInterview;

public class FirstLetterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="ankitSingh";
		char first = s.charAt(0);
		char last = s.charAt(s.length()-1);
		System.out.println(first);
		System.out.println(last);
		String str = "hello i am ankit singh";
		char[] c = str.toCharArray();
		for(int i =0;i<c.length;i++) {
			if(c[i]!=' '&&(i==0 || c[i-1]==' ')) {
				System.out.println(c[i]);
				
			}
		}
	}

}
