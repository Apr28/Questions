package Question2;
import java.util.Scanner;
public class Parent {

	final int number;
	
	Parent(int num){
		this.number = num;
	}
	
	
	void method1() {
		System.out.println("Parent method - 1");
	}
	
	
	final void method2() {
		System.out.println("Parent method - 2 of final type");
	}
	
	
	void method3() {
		System.out.println("Parent method - 3");
	}
}


