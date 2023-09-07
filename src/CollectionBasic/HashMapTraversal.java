package CollectionBasic;
import java.util.*;
import java.util.Map.Entry;
public class HashMapTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(1, 69);
		map.put(2,65);
		map.put(3, null);
		map.put(4, 70);
		
		//using keyset
		for(Integer key:map.keySet()) {
			System.out.println("key"+key+"value"+map.get(key));
		}
		//using entrySet 
     Set<Map.Entry<Integer,Integer>> ent =	map.entrySet();
	 Iterator itr = ent.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	}

}
