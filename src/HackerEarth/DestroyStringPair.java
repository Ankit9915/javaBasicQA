package HackerEarth;
import java.util.*;
public class DestroyStringPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcbbce";
	Stack<Character> s = new Stack<>();
	int i;
	s.push(str.charAt(0));
	for( i=1;i<str.length();i++) {
		if(s.peek()==str.charAt(i)) {
			s.pop();
			continue;
		}
		s.push(str.charAt(i));
	}
	StringBuffer sb = new StringBuffer();
	while(!s.isEmpty()) {
		sb.append(s.pop());
	}
System.out.println(sb.reverse().toString());
}
}