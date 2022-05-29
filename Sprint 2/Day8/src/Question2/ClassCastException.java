package Question2;
public class ClassCastException {

	public static void main(String[] args) {
		Bird b = new Sparrow();
		Sparrow s = (Sparrow) b;  //Casting from Bird to Sparrow
		s.noise(); //The personal method Sparrow can be called using Super class (Bird) reference. This is possible due to casting parent reference in Child class object which is allowed because of Inheritance.
		
		Person p = (Person) b; //Trying to cast from Bird to Person. It is not allowed and compile time error saying "Can't cast from Bird to Person". And on executing the program, it get's abnormally ends with 'ClassCastException'
	}
}


class Bird{
	void eat() {
		System.out.println("Bird is eating");
	}
}

class Sparrow extends Bird{
	//above method will be inherited here inside Sparrow class
	void noise() {
		System.out.println("Sparrow is making noise");
	}
}


class Person{
	//This class is not involved inside the above Inheritance.
	void eat() {
		System.out.println("Person is eating");
	}
}