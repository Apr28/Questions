package Question1;
public class Main {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.age = 25;
		e.phoneNumber = "1234567890";
		e.address = "KKM Sarani, Bidhannagar, Kolkata";
		e.salary = 32000.525;
		System.out.println("<---------- Employee details -------->");
		System.out.println("Age : "+e.age + "\nPhone Number : "+e.phoneNumber+ "\nAddress : "+e.address);
		e.printSalary();
		
		System.out.println();
		
		
		Manager m = new Manager();
		m.age = 35;
		m.phoneNumber = "0987654321";
		m.address = "RK Puram, New Delh";
		m.salary = 58000.945;
		System.out.println("<---------- Manager details -------->");
		System.out.println("Age : "+m.age + "\nPhone Number : "+m.phoneNumber+ "\nAddress : "+m.address);
		m.printSalary();

	}
}
