package Question3;
public class DynamicPolymorphism {

	//Dynamic Polymorphism :: 
	//1. A.k.a Method overriding or Runtime Polymorphism
	//2. Poly means multiple and morphism means 'form'. Technically in Java we use same method in multiple different way to achieve our different task. This done with methods. So, in this type of polymorphism methods are overriden inside child class, possible due to inheritance. The implementation are changed inside child class but the signature remains the same. 
	//3. It is also called as Runtime Polymorphism because, in method overriding same method appears multiple times each with different implementations. So, to whom exactly to call is decided at the runtime of the program. Hence called as Runtime Polymorphism.
	
	public static void main(String[] args) {
		Animal a = new Cub();
		a.run(); //Grandchild class run() method will be executed. 
	}
	
}


//In the below code illustration, the method eat() has been appeared 3 times and each time it has same signature but different implementation. It has been overriden inside the child classes 'Cheetah' and 'Tiger'.

class Animal{
	void run() {
		System.out.println("Animal is running");
	}
}

class Cheetah extends Animal{
	@Override 
	void run() {
		System.out.println("Cheetah runs @ speed of 80-130km/h");
	}
}

class Cub extends Cheetah{
	@Override 
	void run() {
		System.out.println("Baby cheetah is learning to run fast");
	}
}


