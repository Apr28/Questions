package Question1;
import java.util.Scanner;
public class Student {

	private int roll; 
	private String name;
	private int marks;
	private char grade;
	
	Student(){
		
	}
	
	Student(String nm, int rll, int mrks){
		this.name = nm;
		this.roll = rll;
		this.marks = mrks;
	}
	
	public static void displayDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- Student Details ----"); 
		
		System.out.println("Enter Name: "); 
		String studName = sc.nextLine();
		
		System.out.println("Enter Roll: ");
		int studRoll = sc.nextInt();
		
		System.out.println("Enter Marks: ");
		int studMarks = sc.nextInt();
		
		Student s = new Student(studName, studRoll, studMarks);
				
		System.out.println(s.toString());
		System.out.println("Grade is : "+ s.calculateGrade(studMarks));
	}
	
	private char calculateGrade(int studentMarks) {
		if(studentMarks >= 500) {
			this.grade = 'A';
		}
		else if(studentMarks >= 400 && studentMarks < 500) {
			this.grade = 'B';
		}
		else if(studentMarks < 400){
			this.grade = 'C';
		}
		
		return this.grade;
	}
	
	@Override
	public String toString() {
		return "Name : "+this.name + "\n" + "Roll no. : "+this.roll + "\n" + "Marks : "+this.marks;
	}
	
	
}






