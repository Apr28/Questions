package Question3;
import java.util.Scanner;
public class IPL {

	public void homeTeamStadium(Stadium stadium) {
		
		switch(stadium) {
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This the the home ground of Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This the home ground of RCB");
			break;
	}
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		IPL i = new IPL();
		
		System.out.println("Enter Stadium name: ");
		String input_stadium = sc.next();
		
		Stadium stadium =  Stadium.valueOf(input_stadium);
		i.homeTeamStadium(stadium);

	}
}
