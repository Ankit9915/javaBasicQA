package Basic20CodingQuestion;
import java.util.*;
public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "mozammil";
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1 );
			}
			else
				map.put(s.charAt(i), 1);
		}
		for(Map.Entry<Character, Integer> entryset: map.entrySet()) {
			System.out.println(entryset.getKey()+":"+entryset.getValue());
		}
	}

}
