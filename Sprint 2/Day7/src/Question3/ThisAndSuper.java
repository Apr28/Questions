package Question3;
public class ThisAndSuper {
	
	//EXPLAIN THE USE OF 'this' AND 'super' KEYWORDS IN JAVA WITH EXAMPLES
	//'this' keyword is utilize to refer the current object while 'super' keyword is utilize to call the parent class constructor from child class constructor, or methods. 
	
	public static void main(String[] args) {
		Person p  = new Student("Rahul");
		p.details();
		
	}

}

class Person {
	long mob = 1234567L;
	String name; 
	
	Person(String perName){
		this.name = perName;
	}
	
	void details() {}
}


class Student extends Person {
	int fee = 400;
	Student(String nm){
		super(nm); //it will call the Parent class constructor
	}
	
	@Override
	void details() {
		System.out.println("Mobile Number : "+super.mob); //with the help of super keyword we can access the parent class members from the child class.
		
		//this keyword below is referring to the current object of Student class. And the data of 'name' and 'fee' member will be accessed for that particular object. 
		System.out.println("Student name : "+this.name); 
		System.out.println("Student fee : "+this.fee); 
	}
}

