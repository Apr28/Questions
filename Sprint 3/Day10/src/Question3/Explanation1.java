
//Explanation OF ABSTRACT CLASS

package Question3;
public class Explanation1 {

	public static void main(String[] args) {
		Animal a1 = new Dog("German Shephard");
		a1.makeNoise();
		Dog d1 = (Dog) a1;  //Down casting to access the Dog class personal members. 
		d1.legs();

	}

}

/*
 ABSTRACT CLASS - 
 	1. DEFINITION : The classes which contains 'abstract' keyword are called as Abstract classes.
	
	2. NEED : To achieve Abstraction
	
	3. REAL PRUPOSE : To achieve Abstraction.
	
	4. All the Properties associated with Abstract class :: 
		1. Abstract class can have concrete and abstract typed methods as well. 
		
		2. Objects of them can't be created. Why? Then in that case, the properties of them would be directly accessed using object and hence no abstraction can be achieved. 
		More technically, the parent isn't a type eg: Animal. But Dog, Cat is. Hence we should not create the object of Parent class we should stop user from doing so. Hence abstract keyword is the solution
		
		3. Empty abstract class is 100% fine i.e an abstract class without any internal codes. 
		4. It can extends the concrete class. 
		
		5. Rest all the concepts of a concrete class applies to them e.g: Parent class object reference referring child class object, Down casting of that reference, etc, they also can have main method. 
		
		6. Since field members arent't overriden in the Inheritance or IS_A relationship hence they can't be made abstract typed. 

		7. Inheritance in case of Abstract class : Multiple inheritance is not possible just like concrete class. Because Abstract class still has 'concrete methods' and they will create a state of ambiguity for JavaC in case methods have same name in diff abstract classes inherited by one class. 
		
		8. Like a concrete class it can also have final members like variables and methods. The final methods can't be overriden inside the child classes.
		
		9. abstract and final, abstract and static can't live together
		10. abstract keyword is a modifier in itself and an Abstract class can never have other modifiers except public. 
		
			
		11. Abstract class can also constructor. User are allowed to define the constructor of it.

*/
abstract class Animal{
	int legs = 4; 

	//Constructor of abstract class
	Animal(String name){
		System.out.println(name + " is of Animal type");
	}
	
	//Abstract methods 
	abstract void makeNoise();
	
	
	//Concrete methods
	void totalLegs(String name) {
		System.out.println(name + " has " + this.legs + " legs");
	}
	
	
	//Final method :: it can't be overriden in the subclasses.
	final void isAnimal() {
		System.out.println("Is an animal");
	}
	

}


class Dog extends Animal{

	Dog(String typ){
		super(typ);
	}
	
	@Override
	//Compulsory to override or provide full implementation
	//Define in Dog's way
	void makeNoise() {
		System.out.println("Dogs bark....");
	}
	

	void legs() {
		super.totalLegs("Dog");
	}
	
}