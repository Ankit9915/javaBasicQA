package CollectionBasic;

public class MovieComparable implements Comparable<MovieComparable>{

	private double rating;
	private String name; 
	private int year;
	
	@Override
	public int compareTo(MovieComparable o) {
		return this.year-o.year;
	}

	public MovieComparable(double rating, String name, int year) {
		super();
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
