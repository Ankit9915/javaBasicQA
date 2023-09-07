package sdetInterview;
import java.util.*;
public class ReverseEachWordInSentance {

	public static void main(String[] args) {
		
		String s ="Hello i am ankit";
		Stack<Character> set = new Stack<Character>();
		for(int i =0;i<s.length();++i) {
			if(s.charAt(i)!=' ') {
				set.push(s.charAt(i));
			}else {
				while(set.empty()==false) {
					System.out.print(set.pop()+" ");
				}
				System.out.print(" ");
			}
		}
		while(set.empty()==false) {
			System.out.print(set.pop()+" ");
		}

	}

}
