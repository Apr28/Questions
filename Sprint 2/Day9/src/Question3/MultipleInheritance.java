package Question3;
public class MultipleInheritance {

	//Why is Multiple Inheritance not supported in Java at class Level? 
	 // Answer - Due to Diamond problem or in short we can state of ambiguity or conflicts arises in doing so. How ? See the codes below; 
	
	
	public static void main(String[] args) {
		C obj = new C();
		// obj.func(); <-- This will create a state of ambiguity/conflicts for the JavaC because there is two methods of the same name which are inherited from class A and class B respectively inside the class C. So, JavaC will get confuse regarding which 'func() method' to call for the Object of class C.
	}
}


class A{
	void func() {
		System.out.println("Class A method");
	}
}

class B {
	void func() {
		System.out.println("Class B method");
	}
}

//Below code is not possible as it's not allowed in Java at class level. 
//But suppose it'd have been allowed. 
class C extends A, B{
	
}