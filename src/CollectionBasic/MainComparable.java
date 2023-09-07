package CollectionBasic;
import java.util.*;
public class MainComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MovieComparable> list = new ArrayList<MovieComparable>();
        list.add(new MovieComparable(8.3, "Force Awakens", 2015));
        list.add(new MovieComparable(8.7, "Star Wars", 1977));
        list.add(new MovieComparable(8.8, "Empire Strikes Back", 1980));
        list.add(new MovieComparable(8.4, "Return of the Jedi", 1983));
        Collections.sort(list);
        System.out.println("Movies After Sorting");
        for(MovieComparable m:list) {
        	System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
        }
	}

}
