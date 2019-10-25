package cinema;
public class Ticket extends Payment {
	private double _price;

	public double getPrice() {
		return this._price;
	}

	/**
	 * must do all the bullshit modifiers
	 */
	public void setPrice(double aPrice) {
		this._price = aPrice;
	}
}