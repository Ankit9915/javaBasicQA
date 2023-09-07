package CollectionBasic;

import java.util.Comparator;

public class NameComparator implements Comparator<MoviesComparator> {

	@Override
	public int compare(MoviesComparator o1, MoviesComparator o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
