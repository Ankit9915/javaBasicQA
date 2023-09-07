package sdetInterview;

import java.util.*;

public class BalancedStringStack {

	public static boolean checker(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			}

			if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				if (st.isEmpty()) {
					return false;
				}

				Character top = st.pop();

				if ((top == '(' && s.charAt(i) != ')') || (top == '{' && s.charAt(i) != '}')
						|| (top == '[' && s.charAt(i) != ']')) {

					return false;
				}
			}
		}

		return st.isEmpty();
	}

	public static void main(String[] args) {
		String s = "{}()";
		if (checker(s)) {
			System.out.println("Balanced");
		} else {
			System.out.println("UnBalanced");
		}
	}
}
