package cinema;
public class Showtime  { // I CHANGED SHOWTIME, it no longer inherits from Movie, UPDATE UML DIAGRAM

	private String datetime;
	private String title;
	private Cinema cinema; // We need to create a new cinema object for every showtime
	private boolean isHoliday;
	private boolean isWeekend;
	private Movie movie;

	public Showtime(String datetime, String title, Cinema cinema, boolean isHoliday, boolean isWeekend, Movie movie) {
		this.datetime = datetime;
		this.title = title;
		this.cinema = cinema;
		this.isHoliday = isHoliday;
		this.isWeekend = isWeekend;
		this.movie = movie;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	public boolean isHoliday() {
		return isHoliday;
	}
	public void setHoliday(boolean isHoliday) {
		this.isHoliday = isHoliday;
	}
	public boolean isWeekend() {
		return isWeekend;
	}
	public void setWeekend(boolean isWeekend) {
		this.isWeekend = isWeekend;
	}
	// function to get all info about showtimes except isHoliday and isWeekend
	public String getAllInfo() {
		return "[datetime=" + datetime + ", title=" + title + ", cinema=" + cinema.getCinema_num() + "]";
	}

	
	

	

}