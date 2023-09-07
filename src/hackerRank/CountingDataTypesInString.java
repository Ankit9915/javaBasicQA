package hackerRank;
import java.util.Scanner;
public class CountingDataTypesInString {

	public void CountDataTypes(String sentence) {
		String[] words = sentence.split("\\s+");
		int stringCount=0;
		int intCount =0;
		int doubleCount =0;
		int floatCount = 0;
		for(String word: words) {
			if(isString(word)) {
				stringCount++;
			}else if(isInteger(word)) {
				intCount++;
			}else if(isDouble(word)){
				doubleCount++;
			}else if(isFloat(word)) {
				floatCount++;
			}
		}
		System.out.println("string "+stringCount);
		System.out.println("Integer "+intCount);
	    System.out.println("Double "+doubleCount);
	    System.out.println("float "+floatCount);
	}
	private boolean isString(String word) {
		for(char c:word.toCharArray()) {
			if(!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}
	private boolean isInteger(String word) {
		try {
			Integer.parseInt(word);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	private boolean isDouble(String word) {
		try {
			Double.parseDouble(word);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	private boolean isFloat(String word) {
		try {
			Float.parseFloat(word);
			return true;
		}catch(NumberFormatException e) {
		return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		CountingDataTypesInString obj = new CountingDataTypesInString();
		obj.CountDataTypes(sentence);
	}
}
