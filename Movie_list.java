package cinema;

import java.util.ArrayList;

public class Movie_list {
	private Movie[] movieShowing;
	private Movie[] movieComingSoon;
	private ArrayList<Movie> movie_list;
	
	public Movie_list()
	{
		movie_list = new ArrayList<Movie>();
	}
	public Movie[] getMovieShowing() {
		return this.movieShowing;
	}

	public void setMovieShowing(Movie[] aMovieShowing) {
		this.movieShowing = aMovieShowing;
	}

	public Movie[] getMovieComingSoon() {
		return this.movieComingSoon;
	}

	public void setMovieComingSoon(Movie[] aMovieComingSoon) {
		this.movieComingSoon = aMovieComingSoon;
	}
	public void addMovieToList(Movie movie) {
		movie_list.add(movie);
	}
	/**
	 * sort  by sales
	 * implement comparator somewhere and compareTo
	 */
	public void sortSales() {
		int min;
		Movie temp;
		for(int i = 0; i<movie_list.size();i++)
		{
			min = i;
			if(movie_list.get(i).compareTo(movie_list.get(min)) <0)
			{
				min = i;
			}
			temp = movie_list.get(min);
			movie_list.set(min, movie_list.get(i));
			movie_list.set(i, temp);
		}
	}
	public void sortRatings()
	{
		Movie temp;
		// arrange according to CustomerID
		for (int i = 1; i < movie_list.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (movie_list.get(j).getOverall_rating() < movie_list.get(j-1).getOverall_rating()) {
					temp = movie_list.get(j-1).copy();
					movie_list.set(j-1, movie_list.get(j).copy());
					movie_list.set(j, temp);

				} else
					break;
			}
		}
		
	}
	
	public void printMovieList() {
		System.out.println("List of ratings and reviews:");
		for(int i = 0; i< movie_list.size();i++)
		{
			System.out.println(movie_list.get(i).getTitle() + " | Ratings: "+ movie_list.get(i).getOverall_rating());
		}
	}


}
