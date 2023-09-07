package CollectionBasic;
import java.util.*;
import java.util.Map.Entry;
public class HashMapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		 
		    // Adding Key and Value pairs to HashMap
		    hashmap.put(22,"A");
		    hashmap.put(55,"B");
		    hashmap.put(33,"Z");
		    hashmap.put(44,"M");
		    hashmap.put(99,"I");
		    hashmap.put(88,"X");
		 
		    System.out.println("Before Sorting:");
		    Set set = hashmap.entrySet();
		    Iterator iterator = set.iterator();
		    while(iterator.hasNext()) {
		        Map.Entry pair = (Map.Entry)iterator.next();
		        System.out.print(pair.getKey() + ": ");
		        System.out.println(pair.getValue());
		    }
		    System.out.println("After Sorting");
		    Map<Integer,String> map = new TreeMap<>(hashmap);
		    Set set1 = map.entrySet();
		    Iterator iterator1 = set1.iterator();
		    while(iterator1.hasNext()) {
		        Map.Entry pair1 = (Map.Entry)iterator1.next();
		        System.out.print(pair1.getKey() + ": ");
		        System.out.println(pair1.getValue());
		    }
		   //Sort By using Values 
		    System.out.println("Sorting By Values");
		   Set<Entry<Integer,String>> ss=  hashmap.entrySet();
		   List <Entry<Integer,String>> list = new ArrayList<>(ss);
		   Collections.sort(list, new Comparator <Entry<Integer,String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			   
		   });
		   for(Map.Entry<Integer, String> res : list) {
			   System.out.println(res.getKey()+": "+res.getValue());
		   }
	}
	

}
