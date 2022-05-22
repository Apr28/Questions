package Question1;
public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Aman");
		s1.setRoll(10);
		s1.setAge(21);
		s1.setMarks(0);
		
		if(s1.getMarks() == 0 || s1.getAge() == 0) {
			System.out.println("Name : "+s1.getName()+ "\nRoll : "+s1.getRoll());
		}
		else {
			System.out.println("Name : "+s1.getName()+ "\nRoll : "+s1.getRoll()+ "\nAge : "+s1.getAge()+"\nMarks : "+s1.getMarks());
		}
		
		System.out.println("\n");

		Student s2 = new Student(19, "Rahul", 450, 24);
	}
}
