package hackerRank;
import java.util.*;
public class JavaBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{()[}]";
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{'|| str.charAt(i)=='['||str.charAt(i)=='(') {
				st.push(str.charAt(i));
			}else {
				if(st.empty()) {
					st.push(str.charAt(i));
					break;
				}
				char c = st.pop();
				if(str.charAt(i)=='{'&&c!='}'||str.charAt(i)=='{'&&c!='}'||str.charAt(i)=='('&&c!=')') {
					break;
				}
			}
		}
		if(st.empty()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
