package sdetInterview;

public class ReverseSentance {

	public static void main(String[] args) {
		String s ="hello i am ankit";
		String[] rev = s.split(" ");
		String ans = "";
		for(int i =rev.length-1;i>=0;i--) {
			ans+=rev[i]+" ";
		}

		System.out.println(ans);
	}

}
