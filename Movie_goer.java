package cinema;

import java.util.ArrayList;

public class MovieGoer {
	private String name;
	private long mobileNumber;
	private String email;
	private int age;
	private ArrayList<Payment> bookingHistory;
	
	public MovieGoer(String name, long mobileNumber, String email, int age) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.age = age;
		this.bookingHistory = new ArrayList<Payment>();
	}
	public void addBookinghistory(Payment s) {
		bookingHistory.add(s);
	}
	public String getBookinghistory()
	{
		String a = "";
		for(int i = 0; i<bookingHistory.size();i++)
		{
			a += bookingHistory.get(i).getAllInfo();
			a += "| \n";
		}
		return a;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Payment> getBookingHistory() {
		return bookingHistory;
	}

	public void setBookingHistory(ArrayList<Payment> bookingHistory) {
		this.bookingHistory = bookingHistory;
	}
	
	
	

}
