package cinema;

public class TesterforMovie {
	public static String CS = "Coming Soon";
	public static String P = "Preview";
	public static String NS = "Now Showing";
	public static String Plat = "Platinum Movie Suite";
	public static String N = "Normal";
	public static Seat[] generateSeatsArray(int row, int col)
	{
		Seat[] arr = new Seat[row*col];
		int count = 0;
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<col;j++)
			{
				arr[count] = new Seat(i,j);
				count++;
			}
				
		}
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cinema Platinum = new Cinema(1,generateSeatsArray(2,2),2,2,Plat);
		Platinum.createSeatingPlan();
		Platinum.printCinema();
		Movie starwars = new Movie("Comedy",NS,"A story about people laughing", new String[]{"Bob Tan","Max Wong"},new String[]{"Jennifer Lawerence","Lady gaga"},"Star Wars");
		MovieGoer JunTeng = new MovieGoer("Jun Teng",945678392,"JT003@gmail.com", 20);
		MovieGoer John = new MovieGoer("John",94284822,"john@gmail.com", 22);
		MovieGoer Mary = new MovieGoer("Mary",93364125,"mary66@gmail.com", 81);
		Review starwarsR1 = new Review(5,"Super entertaining show with good acting", JunTeng); // assume any moviegoer can just insert review first 
		Review starwarsR2 = new Review(3,"boring show",John);
		Review starwarsR3 = new Review(4,"Interesting movie with good visuals",Mary);
		starwars.add_review(starwarsR1);
		starwars.add_review(starwarsR2);
		starwars.add_review(starwarsR3);
		Cinema normal = new Cinema(2,generateSeatsArray(5,5),5,5,N);
		normal.createSeatingPlan();
		normal.printCinema();
		Cinema normal2 = new Cinema(2,generateSeatsArray(5,5),5,5,N);
		Showtime starswarsS1 = new Showtime("2310191130","Star Wars",Platinum,false,false);
		Showtime starswarsS2 = new Showtime("2310191430","Star Wars",normal,false,false); // need to make a new cinema object for every showtime
		Showtime starswarsS3 = new Showtime("2310191800","Star Wars",normal2,false,false);
		starwars.addShowtimes(starswarsS1);
		starwars.addShowtimes(starswarsS2);
		starwars.addShowtimes(starswarsS3);
		System.out.println(starwars);
		Payment p1 = new Payment("3D",starswarsS1,JunTeng.getAge(),JunTeng);
		p1.setPrice();
		JunTeng.addBookinghistory(p1);
		System.out.println(JunTeng.getBookinghistory());
		
	}

}
