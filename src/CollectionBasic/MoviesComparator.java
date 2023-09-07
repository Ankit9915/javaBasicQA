package CollectionBasic;

public class MoviesComparator implements Comparable<MoviesComparator> {

	private double rating;
	private String name; 
	private int year;
	
	@Override
	public int compareTo(MoviesComparator o) {
		return this.year-o.year;
	}

	public MoviesComparator(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}	
	
}
