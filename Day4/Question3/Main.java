
//QUESTION NUMBER -- 3

package Question3;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		System.out.println("Is from NIT ? (true/false) :");
		boolean input = sc.nextBoolean();
		
		Student s = Student.getStudent(input); 
		if(s.getCollName() == null) {
			System.out.println("Name: " +s.getName()+ "\nRoll: " +s.getRoll()+ "\nAddress: " +s.getAddress());
		}
		else {
		
			System.out.println("Name: " +s.getName()+ "\nRoll: " +s.getRoll()+ "\nAddress: " +s.getAddress()+"\nCollege Name: " +s.getCollName());
			
		}
	}
}
