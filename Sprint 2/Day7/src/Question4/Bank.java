package Question4;
public class Bank {

	String branchName; 
	String IfscCode; 
	
	void displayDetails() {
		System.out.println(this.branchName);
		System.out.println(this.IfscCode);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis Bank");
	}
	
	public void setBranchName(String brName) {
		this.branchName = brName;
	}
	public void setIfscCode(String ifscCode) {
		this.IfscCode = ifscCode;
	}
}


class AxisBank extends Bank{
	double rateOfInterest;
	
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
	@Override
	void displayDetails() {
		System.out.println(this.branchName);
		System.out.println(this.IfscCode);
		System.out.println(this.rateOfInterest);
	}

}


class ICICIbank extends Bank{
	double rateOfInterest;
	
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	void displayDetails() {
		System.out.println(this.branchName);
		System.out.println(this.IfscCode);
		System.out.println(this.rateOfInterest);
	}
}

