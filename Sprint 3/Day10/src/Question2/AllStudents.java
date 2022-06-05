package Question2;
import java.util.Scanner;
public class AllStudents {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//<------ Sciene Student Details -------> //
		System.out.println("Sciene Student Details --------- ");
		System.out.println("Enter name: ");
		String studName1 = sc.next();
		System.out.println("Enter Address: ");
		String studAddress1 = sc.next();
		System.out.println("Enter Physics marks: ");
		int phyMarks = sc.nextInt();
		System.out.println("Enter Chemistry marks: ");
		int chemMarks = sc.nextInt();
		System.out.println("Enter Maths marks: ");
		int mathMarks = sc.nextInt();
		ScienceStudent s = new ScienceStudent(studName1, studAddress1, phyMarks, chemMarks, mathMarks);
		System.out.println("Name : "+ s.getName() + "\nAddress : "+ s.getAddress() + "\nPhysics marks : "+s.getPhisicsMarks() + "\nChem marks : "+s.getChemistryMarks() + "\nMaths Maths : "+s.getMathsMarks() + "\nObtained Percentage : "+s.getPercentage()+"%");
		System.out.println("--------------------\n");
		
	
		
		//<------ History Student Details -------> //
		System.out.println("History Student Details --------- ");
		System.out.println("Enter name: ");
		String studName2 = sc.next();
		System.out.println("Enter Address: ");
		String studAddress2 = sc.next();
		System.out.println("Enter History marks: ");
		int histMarks = sc.nextInt();
		System.out.println("Enter Chemistry marks: ");
		int civicsMarks = sc.nextInt();
	
		HistoryStudent hs = new HistoryStudent(studName2, studAddress2, histMarks, civicsMarks);
		System.out.println("Name : "+ hs.getName() + "\nAddress : "+ hs.getAddress() + "\nHistory marks : "+hs.getHistoryMarks() + "\nCivics marks : "+hs.getCivicsMarks() + "\nObtained Percentage : "+hs.getPercentage()+"%");
	}
}















