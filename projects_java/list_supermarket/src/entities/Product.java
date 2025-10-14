package entities;

public class Product_make {
	private double price;
	private String names;
	private Product_make(double price, String names) {
		this.price = price;
		this.names = names;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	

}
