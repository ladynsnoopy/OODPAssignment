package cinema;
public class Ticket { // TICKET NO LONGER INHERITS SHOWTIME
	private double price;
	private String genre;
	private Showtime showtime;
	private int age;
	public Ticket(String genre, Showtime showtime, int age) {
		this.price = 9.00; // standard price
		this.genre = genre;
		this.showtime = showtime;
		this.age = age;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Showtime getShowtime() {
		return showtime;
	}

	public void setShowtime(Showtime showtime) {
		this.showtime = showtime;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public double getPrice() {
		return this.price;
	}

	/**
	 * must do all the bullshit modifiers
	 */
	// rmb to call setPrice after creating Ticket object
	public void setPrice() {
		// follow actual pricing of cathay
		//MOVIES (WEEKEND)/ HOLS child or adult ==> 13
		// ATMOS MOVIES (CHILD OR ADULT 14.00)
		//MOVIES (WEEKDAY) ==> 9 but student ==> 7 but elderly 5
		// 3D MOVIES ==> 16.00 no matter what
		// PLATINUM (MON - THU) ==> 28.00
		// PLATINUM (FRI, WEEKEND and blockbuster) ==> 38.00
		if(showtime.getCinema().getCinemaClass().equals("Platinum Movie Suite"))
		{
			if(showtime.isHoliday()|| showtime.isWeekend())
			{
				price = 38.00; 
			}
			else
				price = 28.00;
		}
		else
		{
			if(genre.equals("3D"))
				price = 16.00;
			else if(genre.equals("ATMOS"))
				price = 14.00;
			else
			{
				if(showtime.isHoliday()|| showtime.isWeekend())
					price = 13.00;
				else
				{
					if(age <= 18) // student
						price = 7.00;
					else if(age >= 60)
						price = 5.00;
				}
			}
		}
		
	}
}
