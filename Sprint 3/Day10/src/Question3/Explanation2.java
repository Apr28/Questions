package Question3;
public class Explanation2 {

	public static void main(String[] args) {		
		//Basic inteface decalation ------>
			Contracts c1 = new Implemented();
			c1.implementIt();
			
			System.out.println(c1.writeAllNames("John Doe"));
			// c1.contractSigning(); //not alowed like this coz they do not participate in Inheritance
			Contracts.provideDetails();
			c1.contractAgreement();  //Allowed using the child reference
	}
}

//CONCEPTS RELATED TO INTERFACE ------>
/*
 	1. IS-A Relationship is required in Interface to achieve Abstraction.
	2. The data memebers are by-default 'public static final' typed. 
	3. Data memebers do not participates in Inheritance and belongs to the interface itself not childs 0f interface. 
	
	4. We can still call the data memebers of Interface using Object reference of child classes. 
	
	5. How to access the data memebers : 
		a. Using Interface Name 
		b. Child class reference 
		c. Interface reference {referring child class object}
	
	6. The methods are only abstract and by default are 'public abstract' typed
	
	7. They are implemented not extended, as they act like a contract which an implemeting entity needs to implements it or provide the full defintion of methods.
	
	8. Main method can also be declared inside interface.
	
	9. Class implenting interface need to override all the abstract methods of interface. The Abstract classes are free from this rule. They might override or leave it. 
	
	
	10. We can also have 'static typed' and 'default typed' methods. 
		=> Prior in java 1.8 or before we can't do it. So suppose if we need to add one more method inside it then it should also be implemented by all the classes implementing the interface. What if we have 1000s of classes. Then its not feasible. Hence static and default typed were created to solve such issues.  
		a. static typed do not participate in the IS-A relationship and can only be accessed using Interface name and can't be overriden.
		b. The default one can also not be overriden. But they can be accessed using Child reference.
*/


//BASIC CODING DEMONSTRATION ------>
interface Contracts{
	
	void implementIt();
	String writeAllNames(String name);
	

	//static method
	static void provideDetails() {
		System.out.println("Client must provide all details like mob, aadhar...");
	}
	
	//default method
	default void contractAgreement() {
		System.out.println("Contract must be agreed by the client");
	}
}


class Implemented implements Contracts{
	@Override
	public void implementIt() {
		System.out.println("implementIt() method got implemented inside a concrete class");
	}

	@Override
	public String writeAllNames(String name) {
		
		if(!(name.equals("Dummy"))) {
			return name;
		}
		else {
			return "Not appropiate name";
		}
	}
}
















