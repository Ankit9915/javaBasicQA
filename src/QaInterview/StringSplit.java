package QaInterview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello123world!?@";
		String[] substrings = splitByTransition(s);

        for (String substring : substrings) {
            System.out.println(substring);
        }
    }

    public static String[] splitByTransition(String input) {
        Pattern pattern = Pattern.compile("([a-zA-Z]+|[^a-zA-Z]+)");
        Matcher matcher = pattern.matcher(input);

        java.util.List<String> substrings = new java.util.ArrayList<>();
        while (matcher.find()) {
            substrings.add(matcher.group());
        }

        return substrings.toArray(new String[0]);
	}

}
