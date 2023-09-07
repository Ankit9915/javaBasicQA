package CollectionBasic;

import java.util.Comparator;

public class RatingComparator implements Comparator<MoviesComparator> {

	@Override
	public int compare(MoviesComparator o1, MoviesComparator o2) {
		if(o1.getRating()<o2.getRating()) 
			return -1;
		if(o1.getRating()>o2.getRating())
		return 1;
		else
			return 0;
	}

}
