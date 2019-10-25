package cinema;

public class Seat {

	private int x;
	private int y;
	private boolean occupied_status = false;
	
	public Seat(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int[] getPosition() {
		int [] arr = new int[2];
		arr[0] = x;
		arr[1] = y;
		return arr;
	}

	/**
	 * 
	 * @param position
	 */
	// think this no need
	/*
	public void setPosition(int[] position) {
		this.position = position;
	}*/

	public boolean getOccupied_status() {
		return this.occupied_status;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 * @param occupied_status
	 */
	public void setOccupied_status(boolean occupied_status) {
		this.occupied_status = occupied_status;
	}

}