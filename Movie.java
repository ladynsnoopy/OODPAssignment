package cinema;
import java.util.ArrayList;
import java.util.Arrays;
public class Movie{
	private String genre;
	private String showing_status;
	private String synopsis;
	private String[] director;
	private String[] cast;
	private double overall_rating; 
	private ArrayList<Review> past_reviews; // I changed this to arraylist so it is easier to add new reviews
	private String title;
	private int ticketSales; 
	private ArrayList<Showtime> showtimes;// I changed this to arraylist so it is easier to add new showtimes
	
	


	
	public Movie(String genre, String showing_status, String synopsis, String[] director, String[] cast, String title) {
		super();
		this.genre = genre;
		this.showing_status = showing_status;
		this.synopsis = synopsis;
		this.director = director;
		this.cast = cast;
		this.overall_rating = 0;  // give later
		this.past_reviews = new ArrayList<Review>();
		this.title = title;
		this.ticketSales = 0;  // initial ticket sales = 0
		this.showtimes = new ArrayList<Showtime>(); ;  // give later
	}
	

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getShowing_status() {
		return showing_status;
	}

	public void setShowing_status(String showing_status) {
		this.showing_status = showing_status;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String[] getDirector() {
		return director;
	}

	public void setDirector(String[] director) {
		this.director = director;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public double getOverall_rating() {
		return overall_rating;
	}

	public void setOverall_rating(double overall_rating) {
		this.overall_rating = overall_rating;
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getTicketSales() {
		return ticketSales;
	}


	public void setTicketSales(int ticketSales) {
		this.ticketSales = ticketSales;
	}
	public void increaseTicketSales()
	{
		ticketSales++;
	}

	public void addShowtimes(Showtime s) {
		showtimes.add(s);
	}
	public String getShowtimes()
	{
		String a = "";
		for(int i = 0; i<showtimes.size();i++)
		{
			a += showtimes.get(i).getAllInfo();
			a += "| ";
		}
		return a;
	}
	public void add_review(Review r) {
		past_reviews.add(r);
	}
	public String getReviews()
	{
		String a = "";
		for(int i = 0; i<past_reviews.size();i++)
		{
			a += past_reviews.get(i).getAllinfo();
			a += "| ";
		}
		return a;
	}
    // function to get all the info associated with the movie
	@Override
	public String toString() {
		return "MovieInfo: \ngenre=" + genre + ", showing_status=" + showing_status + ", synopsis=" + synopsis + ",\ndirector="
				+ Arrays.toString(director) + ", cast=" + Arrays.toString(cast) + ",\noverall_rating=" + overall_rating
				+  ", title=" + title + ", ticketSales=" + ticketSales+ ",\npast_reviews=" + getReviews()+ ",\nshowtimes=" +getShowtimes();
	}
	

}