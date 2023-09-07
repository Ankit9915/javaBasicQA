package sdetInterview;

public class ReverseString {
	public void Reverse(String s) {
		StringBuilder reverse = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse.append(String.valueOf(s.charAt(i)));

		}
		System.out.println(reverse.toString());

	}
	//using recursion
	public String rev(String input) {
		if(input.isEmpty()) {
			System.out.println("String is Empty");
			return input;
		}
		return rev(input.substring(1))+input.charAt(0);
			
		
	}

	public static void main(String args[]) {

		String s = "Ankit";
		ReverseString rv = new ReverseString();
		rv.Reverse(s);
		rv.rev("ankit");
		
	}
}
