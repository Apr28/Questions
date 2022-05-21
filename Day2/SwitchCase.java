package Day2;
public class SwitchCase {
	
	static void doOps(String cityname) {
		switch (cityname) {
		case "Mumbai" : 
			System.out.println("Financial city"); 
			break;
		case "Kolkata" :
			System.out.println("City of Joy");
			break;
		case "Delhi" : 
			System.out.println("Capital of the Country");
			break;
		case "Bangalore" :
			System.out.println("Cyber city");
			break;
		default: 
			System.out.println("May be other Indian city");
		}
	}

	public static void main(String[] args) {
		
		doOps("Kolkata");
		doOps("Delhi");
	
	}
}
