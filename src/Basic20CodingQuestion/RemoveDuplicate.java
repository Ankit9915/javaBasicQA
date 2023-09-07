package Basic20CodingQuestion;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Great responsibility	";
		Set<Character> set = new HashSet<>();
		StringBuilder  builder = new StringBuilder();
		for(char c:s.toCharArray()) {
			if(set.add(c)) {
				builder.append(c);
			}
		}
		System.out.println(builder.toString());
	
		//print duplicate character
		char[] s1=s.toCharArray();
		int count;
		for(int i=0;i<s1.length;i++) {
			count =1;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i]==s1[j]&&s1[i]!=' ') {
					count++;
					s1[j]='0';
				}
			}
			if(count>1&&s1[i]!='0') {
				System.out.println(s1[i]);
			}
		}
		
	}

}
