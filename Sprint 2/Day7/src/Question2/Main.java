package Question2;
public class Main {
	
	public static void main(String[] args) {
		
		DayScholar d1 = new DayScholar();
		d1.setStudId(91);
		d1.setExamFee(3200.15);
		d1.setTransportFee(405.67);
		d1.setStudName("Aman Kumar");
		System.out.println("<------ Student 1 (DayScholar) ------>");
		d1.displayDetails();
		System.out.println("Total fee to pay : " + d1.payFee());
		System.out.println("\n");
		
		
		
		
		
		DayScholar d2 = new DayScholar(101, "Sunil Kumar", 3200.15, 145.65);
		System.out.println("<------ Student 2 (DayScholar) ------>");
		d2.displayDetails();
		System.out.println("Total fee to pay : " + d2.payFee());
		System.out.println("\n");
		
		Hosteller h1 = new Hosteller();
		Hosteller h2 = new Hosteller();
	}

	
}
