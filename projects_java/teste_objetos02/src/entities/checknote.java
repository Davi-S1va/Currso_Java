package entities;

public class checknote {
	
	public String name;
	public double noteone;
	public double notetwo;
	public double notethree;
	
	public double totalyear() {
		return noteone+notetwo+notethree;
	}
	

	
	public String toString() {
		if(totalyear() < 60.0) {
			double noterest=60.0-totalyear();
			return "FAILED"+
					"\nMISSIG "+ noterest+" POINTS";	}
		else {
			return"PASS";}
		}
	
	}
	
		
		
	





