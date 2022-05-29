package Question4;
import java.util.Scanner;
public class Demo {

	public static Bank getBank(String Bank) {
		
		if(Bank.equalsIgnoreCase("axis")) {
			AxisBank ax = new AxisBank();
			return ax;
		}
		else if(Bank.equalsIgnoreCase("icici")) {
			ICICIbank ic = new ICICIbank();
			return ic;
		}
		
		else {
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Bank name: ");
		String input = sc.next();
		
		Bank b = getBank(input);
		
		if(b instanceof AxisBank) {
			b.setBranchName("RK Puram, Delhi");
			b.setIfscCode("AX-00234567");
			
			AxisBank axb = (AxisBank) b;
			axb.setRateOfInterest(10.15);
			
			b.displayDetails();
			b.getCreditCard();
		}
		else if(b instanceof ICICIbank){
			b.setBranchName("Santa Cruz, Mumbai");
			b.setIfscCode("IC-00087654");
			
			ICICIbank icb = (ICICIbank) b;
			icb.setRateOfInterest(9.65);
			
			b.displayDetails();
		}
		else {
			System.out.println("Error! 404 Bank not found");
		}
	}
}
