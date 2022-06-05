package Question1;
import java.util.Scanner;
public class Demo {

	
	public Hotel provideFood(int amount) {
		if(amount > 1000) {
			Hotel h = new TajHotel();
			return h;
		}
		else if(amount > 200 && amount < 1000){
			Hotel h = new RoadSideHotel();
			return h;
		}	
		else {
			return null;
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount: ");
		int userAmount = sc.nextInt();
		Demo d = new Demo();
		Hotel  h = d.provideFood(userAmount);
		
		if(h instanceof TajHotel) {
			TajHotel tj = (TajHotel) h;
			tj.welcomeDrink(); 

			h.chickenBiryani();
			h.masalaDosa();
		}
		else if(h instanceof RoadSideHotel) {
			h.chickenBiryani();
			h.masalaDosa();
		}
		else if(h == null) {
			System.out.println("Please Enter a valid amount");
		}
	}
}
