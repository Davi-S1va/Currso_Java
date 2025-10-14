package util;

public class Interface_bank {
	
	private int acoutnum;
	public String titular;
	private double valueinacout;
	
	
	public Interface_bank(int accoutnum, String titular, double valuinacout) {
		this.acoutnum = accoutnum;
		this.titular=titular;
		this.valueinacout = valuinacout;
		
	}

	public int getAcoutnum() {
		return acoutnum;
	}

	public void setAcoutnum(int acoutnum) {
		this.acoutnum = acoutnum;
	}

	public String gettitular() {
		return titular;
	}

	public void settitular(String titular) {
		this.titular= titular;
	}
	
	
	
	
	
	
	
	public double getValueinacout() {
		return valueinacout;
	}

	
	public void addvalue(double valueinacout) {
		this.valueinacout+=valueinacout;
	
	}
	
	public void removevalue(double valueinacout) {
		
		this.valueinacout-=(valueinacout+5.0);
		;
		
	}
	
	public String toString() {
		return "Account:"+acoutnum+","+" Holder:"+titular+","+" Blance: R$"+valueinacout;
	}
	
	
	
	
	
	

}
