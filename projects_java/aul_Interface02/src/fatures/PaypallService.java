package fatures;

public class PaypallService {
	
	public double interest(double amount, int months) {
		double value = amount + (amount * 0.01 * months); 
		return value;
	}
	
	
	public double paymentFee(double amount) {
		double impost = (amount * 0.02) + amount;
		
		return impost;
	}

}
