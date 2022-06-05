package Question2;
import java.util.Scanner;
import java.util.regex.*;
public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(Pattern.matches("[a-zA-Z\\s]{3,8}", name) && Pattern.matches("[0-9]{12}", aadharCard) && Pattern.matches("[6789]{1}[0-9]{9}", mobileNum)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo d = new Demo();
	
		System.out.println("Enter your Name: ");
		String user_name = sc.nextLine();
		System.out.println("Enter your mob no. : ");
		String user_mob = sc.next();
		System.out.println("Enter your Aadhar no. : ");
		String user_aadhar = sc.next();
		
		if(d.validate(user_name, user_mob, user_aadhar)) {
			Citizen c = new Citizen();
			c.setName(user_name);
			c.setAadharNumber(user_aadhar);
			c.setMobileNumber(user_mob);
			
			System.out.println("Person Name : " + c.getName());
			System.out.println("Person Mobile : " + c.getMobileNumber());
			System.out.println("Person Addhar : " + c.getAadharNumber());

		}
		else {
			System.out.println("Wrong Inputs");
		}
		
	}
}
