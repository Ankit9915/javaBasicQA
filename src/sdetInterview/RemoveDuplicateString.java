package sdetInterview;

import java.util.Arrays;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String s = "javatpoint";
		char[] c = s.toCharArray();
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (c[i] == c[j]) {
					break;
				}
			}
			if (j == i) {
				c[index++] = c[i];
			}
		}

		System.out.println(String.valueOf(Arrays.copyOf(c, index)));
	}

}
