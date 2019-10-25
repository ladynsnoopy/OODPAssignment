package cinema;

public class Cinema {

	private int cinema_num;
	private Seat[] listOfSeats;
	private boolean[][] seatingplan;
	private int num_row;
	private int num_col;
	private String cinemaClass;
	
	public Cinema(int cinema_num, Seat[] seat_arr,int num_row, int num_col, String a)
	{
		this.cinema_num = cinema_num;
		listOfSeats = seat_arr;
		this.num_row = num_row;
		this.num_col= num_col;
		cinemaClass = a;
		seatingplan = new boolean[num_row][num_col];
	}

	public int getNum_row() {
		return num_row;
	}

	public void setNum_row(int num_row) {
		this.num_row = num_row;
	}

	public int getNum_col() {
		return num_col;
	}

	public void setNum_col(int num_col) {
		this.num_col = num_col;
	}

	public int getCinema_num() {
		return cinema_num;
	}

	public void setCinema_num(int cinema_num) {
		this.cinema_num = cinema_num;
	}

	public Seat[] getlistOfSeats() {
		return listOfSeats;
	}

	public void setlistOfSeats(Seat[] listOfSeats) {
		this.listOfSeats = listOfSeats;
	}


	public String getCinemaClass() {
		return cinemaClass;
	}

	public void setCinemaClass(String cinemaClass) {
		this.cinemaClass = cinemaClass;
	}
	//This creates a 2D array of seats where if a seat is occupied, it will be set to true.
	//Every time a seat is booked, will have to run it again to get an accurate seating plan.
	//TODO before print of seating plan, must run this every time.

	
	public void createSeatingPlan() {
		for(int i=0;i<4;i++) {
			seatingplan[listOfSeats[i].getX()][listOfSeats[i].getY()]=listOfSeats[i].getOccupied_status();
		}
	}
	
	public void printCinema()
	{
		System.out.println("Cinema: "+this.getCinema_num());
		System.out.println("--------------SCREEN--------------");
		System.out.print("   ");
		for (int i=0;i<num_col;i++) {
			System.out.print((i+1) + " ");
		}
		System.out.println();
		for(int j=0;j<num_row;j++) {
			System.out.print((j+1) + "  ");
			for(int k=0;k<num_col;k++) {
				if(seatingplan[j][k] == true)
					System.out.print("X ");
				else 
					System.out.print("O ");
			}
			System.out.println();
		}
	}
	
	public void changeSeatStatus(int xCoor, int yCoor) {
		int totalSeatNum = num_row*num_col;
		for (int i=0;i<(totalSeatNum);i++) {
			if(!listOfSeats[i].getOccupied_status() && listOfSeats[i].getX()==xCoor && listOfSeats[i].getY()==yCoor) {
				listOfSeats[i].setOccupied_status(true);
				return;
			}
		}
		System.out.println("ERROR: this seat is taken");
	}

}