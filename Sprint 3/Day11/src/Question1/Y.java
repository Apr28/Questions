package Question1;
public interface Y {

	//default method
	default void dance() {
		System.out.println("Default method of interface Y");
	}
	
	
	//static method
	public static void talk() {
		System.out.println("Static method of interface Y");
	}
	
	//abstract method
	public abstract void speak();
}
