package CollectionBasic;
import java.util.*;
public class HashSetTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		Iterator<Integer> itr =s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
