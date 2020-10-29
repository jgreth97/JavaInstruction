package business;

import java.util.List;

public class MovieCollection {

	private String Movie;
	private String filteredMovies;
	private String lowRatings;
	private String highRatings;
	private String averageRating;
	
	public MovieCollection(String movie, String filteredMovies, String lowRatings, String highRatings,
			String averageRating) {
		super();
		Movie = movie;
		this.filteredMovies = filteredMovies;
		this.lowRatings = lowRatings;
		this.highRatings = highRatings;
		this.averageRating = averageRating;
	}

	public String getMovie() {
		return Movie;
	}

	public void setMovie(String movie) {
		Movie = movie;
	}

	public String getFilteredMovies() {
		return filteredMovies;
	}

	public void setFilteredMovies(String filteredMovies) {
		this.filteredMovies = filteredMovies;
	}

	public String getLowRatings() {
		return lowRatings;
	}

	public void setLowRatings(String lowRatings) {
		this.lowRatings = lowRatings;
	}

	public String getHighRatings() {
		return highRatings;
	}

	public void setHighRatings(String highRatings) {
		this.highRatings = highRatings;
	}

	public String getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "MovieCollection [Movie=" + Movie + ", filteredMovies=" + filteredMovies + ", lowRatings=" + lowRatings
				+ ", highRatings=" + highRatings + ", averageRating=" + averageRating + "]";
	}
	
	
	
}
