package CollectionBasic;
import java.util.*;
public class TreeMapTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> t= new TreeMap<>();
		t.put(1, "as");
		t.put(4, "love");
		t.put(3, "hate");
		t.put(2, "no gain");
		Set<Map.Entry<Integer, String>> m =  t.entrySet();
		for(Map.Entry<Integer, String> mo : m) {
			System.out.println(mo.getKey()+": "+mo.getValue());
		}
	}

}
