package Question2;
public class Demo {
	
	Demo(){
		this(3.14f);
		System.out.println("Inside Demo() Constructor");
	}
	Demo(String s){
		System.out.println("Inside Demo(String s) constructor");
	}
	
	Demo(int i){
		this("Alexa");
		System.out.println("Inside Demo(int i) constructor");
	}
	
	Demo(float f){
		this(29);
		System.out.println("Inside Demo(float f) constructor");
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
	}

}
