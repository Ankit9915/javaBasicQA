package sdetInterview;

public class PanagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The quick Brown fox jumps over a Lazy Dog";
		s = s.replaceAll("", "").toLowerCase();
		String res = "";
		for(char i ='a';i<='z';i++) {
			if(s.indexOf(i)!=-1) {
				res=res+i;
			}
		}
		if(res.length()==26) {
			System.out.println("Anagram");
		}else {
		System.out.println("not a Anagram");
		}
	}

}
