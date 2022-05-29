package Question4;
public class Main {
	public static void main(String[] args) {
		
		Animal [] a = new Animal [3];
		a[0] = new Dog();
		a[0].eat();
		a[0].walk();
		a[0].makeNoise();
		
		System.out.println("----------- \n");
		
		a[1] = new Cat();
		a[1].eat();
		a[1].walk();
		a[1].makeNoise();
		
		System.out.println("-----------\n");
		
		a[2] = new Tiger();
		a[2].eat();
		a[2].walk();
		a[2].makeNoise();

	}

}
