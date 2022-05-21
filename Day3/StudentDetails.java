package Day3;
public class StudentDetails {

	String name;
	int roll;
	int marks; 
	
	void displayStudentDetails() {
		System.out.println("Roll is : "+roll+"\nName is : "+name+"\nMark is : "+marks);
	}
	
	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();
		s1.name = "Aman Kumar";
		s1.roll = 20; 
		s1.marks = 91;
		s1.displayStudentDetails();
		
		System.out.println("\n");
		
		StudentDetails s2 = new StudentDetails();
		s2.name = "Suraj Singh";
		s2.roll = 50; 
		s2.marks = 78;
		s2.displayStudentDetails();
		
		s1 = null;
		s2 = null;		
	}
	
	
}
