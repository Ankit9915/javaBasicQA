package CollectionBasic;
import java.util.*;
public class MainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MoviesComparator> list = new ArrayList<MoviesComparator>();
        list.add(new MoviesComparator(8.3, "Force Awakens", 2015));
        list.add(new MoviesComparator(8.7, "Star Wars", 1977));
        list.add(
            new MoviesComparator(8.8, "Empire Strikes Back", 1980));
        list.add(
            new MoviesComparator(8.4, "Return of the Jedi", 1983));
        System.out.println("Sorting by Rating");
        RatingComparator rc = new RatingComparator();
        Collections.sort(list, rc);
        for(MoviesComparator mc:list) {
        	System.out.println(mc.getName()+" "+mc.getYear()+" "+mc.getRating());
        }
        System.out.println("Sorting By name");
        NameComparator nc = new NameComparator();
        Collections.sort(list, nc);
        for(MoviesComparator mc: list) {
        	System.out.println(mc.getName()+" "+mc.getYear()+" "+mc.getRating());
        }
        System.out.println("Sorting By Year");
        Collections.sort(list);
        for(MoviesComparator mc:list) {
        	System.out.println(mc.getName()+" "+mc.getYear()+" "+mc.getRating());
        }
	}

}
