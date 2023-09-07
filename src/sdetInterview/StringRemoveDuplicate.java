package sdetInterview;

public class StringRemoveDuplicate {

	public void removeDuplicate(String str) {
		String nonstr = "";
		for(char ch:str.toCharArray()) {
			if(!nonstr.contains(String.valueOf(ch))) {
				nonstr+=ch;
			}
		}
		System.out.println(nonstr);
	}
	public static void main(String[] args) {
		String s = "manmohan";
		StringRemoveDuplicate srd = new StringRemoveDuplicate();
		srd.removeDuplicate(s);
	}
}
