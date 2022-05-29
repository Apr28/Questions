package Question1;
import java.util.Scanner;
public class Student {

	private int roll; 
	private String name;
	private int marks;
	private char grade;
	
	Student(){
		
	}
	
	
	public  void displayDetails(Student s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- Student Details ----"); 
		
		System.out.println("Enter Name: "); 
		String studName = sc.nextLine();
		
		System.out.println("Enter Roll: ");
		int studRoll = sc.nextInt();
		
		System.out.println("Enter Marks: ");
		int studMarks = sc.nextInt();
		
		s.setName(studName);
		s.setRoll(studRoll);
		s.setMarks(studMarks);
				
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


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}






