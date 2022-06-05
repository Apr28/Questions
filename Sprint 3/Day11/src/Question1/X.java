package Question1;
public interface X {

	//default method
	public default void sleep() {
		System.out.println("Default method");
	}
	
	
	//static method
	public static void eat() {
		System.out.println("Static method of interface X");
	}
	
	//abstract method
	public abstract void run();
}

