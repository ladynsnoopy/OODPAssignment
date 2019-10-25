package cinema;
public class Movie_goer {
	private String _name;
	private long _mobileNumber;
	private String _email;
	private Payment[] _bookingHistory;
	private int _age;
	public Payment _unnamed_Payment_;

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public long getMobileNumber() {
		return this._mobileNumber;
	}

	public Payment[] getBookingHistory() {
		return this._bookingHistory;
	}

	public void setBookingHistory(Payment[] aBookingHistory) {
		this._bookingHistory = aBookingHistory;
	}

	public void setCinema(Cinema aCinema) {
		throw new UnsupportedOperationException();
	}

	public int getAge() {
		return this._age;
	}

	public void setAge(int aAge) {
		this._age = aAge;
	}

	public void setMobileNumber(long aMobileNumber) {
		this._mobileNumber = aMobileNumber;
	}
}