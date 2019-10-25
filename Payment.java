package cinema;
public class Payment extends Ticket{
	private String tID;
	private MovieGoer moviegoer;
	// TID format
	//XXXYYYYMMDDhhmm (Y : year, M : month, D : day, h : hour, m : minutes, XXX : cinema code in letters). 
	public Payment(String genre, Showtime showtime, int age,MovieGoer moviegoer) {
		super(genre, showtime, age);
		String a = showtime.getDatetime();
		a += showtime.getCinema().getCinema_num();
		this.tID =a;
		this.moviegoer = moviegoer;
		
		// TODO Auto-generated constructor stub
	}
	public String get_tID() {
		return tID;
	}
	public MovieGoer getMoviegoer() {
		return moviegoer;
	}
	public void setMoviegoer(MovieGoer moviegoer) {
		this.moviegoer = moviegoer;
	}
	public String getAllInfo()
	{
		return ("Transaction ID: "+this.get_tID()+"\n "+ super.getShowtime().getAllInfo()+"\n");
	}
	
	public void buyTicket(int x, int y) {
		super.getShowtime().getCinema().changeSeatStatus(x-1, y-1);
		super.getShowtime().getMovie().increaseTicketSales();
	}
	
	
}