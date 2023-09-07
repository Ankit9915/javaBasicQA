package Basic20CodingQuestion;
import java.util.*;
public class CommonElementTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names1[] = {"bob","alice","jhon","kiwi"};
		String names2[] = {"kiwi","ankit","moh"};
		Set<String> set = new HashSet<>();
		for(int i=0;i<names1.length;i++) {
			for(int j=0;j<names2.length;j++) {
				if(names1[i].equalsIgnoreCase(names2[j])) {
					set.add(names1[i]);
				}
			}
		}
		for(String name:set) {
			System.out.println(name);
		}

	}

}
