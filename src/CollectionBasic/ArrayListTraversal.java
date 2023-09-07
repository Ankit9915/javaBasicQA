package CollectionBasic;
import java.util.*;
public class ArrayListTraversal {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();

		l.add(23);
		l.add(34);
		l.add(65);
		l.add(43);
	for(Integer i: l) {
		System.out.println(i);
		}
	System.out.println("************************");
	Collections.sort(l,Collections.reverseOrder());
	Iterator it= l.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("****************");
 
	Collections.sort(l);
	Iterator i= l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	}

}
