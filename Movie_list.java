package cinema;



public class Movie_list {
	private Movie[] movieShowing;
	private Movie[] movieComingSoon;

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

	/**
	 * sort  by sales
	 * implement comparator somewhere and compareTo
	 */
	public void sortSales(Comparable[] list) {
		int min;
		Comparable temp;
		for(int i = 0; i<list.length;i++)
		{
			min = i;
			if(list[i].compareTo(list[min]) <0)
			{
				min = i;
			}
			temp = list[min];
			list[min] = list[i];
			list[i] = temp;
		}
	}
	public Movie[] sortRatings(Movie[] a)
	{
		Movie temp;
		// arrange according to CustomerID
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j].getOverall_rating() < a[j - 1].getOverall_rating()) {
					temp = a[j - 1].copy();
					a[j - 1] = a[j].copy();
					a[j] = temp;

				} else
					break;
			}
		}
		return a;
	}


}
