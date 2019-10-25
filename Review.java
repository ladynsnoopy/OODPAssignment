package cinema;
public class Review {

	private int rating;
	private String review;
	//private Movie_goer moive_goer;
	private MovieGoer Movie_goerID; 
	

	public Review(int rating, String review,MovieGoer moive_goer) {
		super();
		this.rating = rating;
		this.review = review;
		this.Movie_goerID = moive_goer;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getReview() {
		return review;
	}


	public void setReview(String review) {
		this.review = review;
	}


	public MovieGoer getMovie_goerID() {
		return Movie_goerID;
	}


	public void setMovie_goerID(MovieGoer movie_goerID) {
		Movie_goerID = movie_goerID;
	}

   // function to get all info associated with the review
	public String getAllinfo() {
		return "[rating=" + rating + ", review=" + review + ", Movie_goerID=" + Movie_goerID.getName() + "]";
	}
	

	

}