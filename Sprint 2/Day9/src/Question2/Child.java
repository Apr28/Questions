package Question2;
import java.util.Scanner;
final class Child extends Parent{
	
	Child(int num){
		super(num);
	}
	
	@Override
	void method1() {
		System.out.println("Parent method-1 overridden inside Child");
		System.out.println(super.number);
	}
	
//	@Override
//	final void method2() {
//		//cannot be done as the method-2 is final type and final methods can't be overriden in Java. Hence it'd throw compile time error
//	}

	
	void method4() {
		System.out.println("Child class personal method-4 -");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			System.out.println("Enter number bw 1-10");
			int inputNum = sc.nextInt();
			
			if(inputNum >= 1 && inputNum <= 10) {
				Parent p = new Child(inputNum);
				p.method1();
				p.method2();
				p.method3();
				
				Child c = (Child) p; 
				c.method4();

			}
			else {
				System.out.println("Wrong Input");
			}
	
		}
}

