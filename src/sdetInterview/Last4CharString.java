package sdetInterview;

public class Last4CharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "geeksforgeeks";
		String lastFour ="";
		if(s.length()>4) {
			lastFour = s.substring(s.length()-4);
		}
		else {
			lastFour = s;
		}
		System.out.println(lastFour);
	}

}
