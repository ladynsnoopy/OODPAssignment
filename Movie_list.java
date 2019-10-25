package cinema;
public class Movie_list {
	private Movie[] _movieShowing;
	private Movie[] _movieComingSoon;
	public Movie _unnamed_Movie_;

	public Movie[] getMovieShowing() {
		return this._movieShowing;
	}

	public void setMovieShowing(Movie[] aMovieShowing) {
		this._movieShowing = aMovieShowing;
	}

	public Movie[] getMovieComingSoon() {
		return this._movieComingSoon;
	}

	public void setMovieComingSoon(Movie[] aMovieComingSoon) {
		this._movieComingSoon = aMovieComingSoon;
	}

	/**
	 * sort  by sales
	 * implement comparator somewhere and compareTo
	 */
	public void sortSales() {
		throw new UnsupportedOperationException();
	}

	public void sortMovies() {
		throw new UnsupportedOperationException();
	}
}