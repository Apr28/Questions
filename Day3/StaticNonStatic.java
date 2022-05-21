package Day3;
public class StaticNonStatic {	
	
	/* STATIC VARIABLE */
	static int marks;  //uninitialized static variable
	static String name = "Rahul"; 
	
	
	/* NON STATIC VARIABLE */
	long mob;  //uninitialized instance variable
	int age = 30;  //initialised instance variable
	
	
	public static void main(String[] args) {
		
		/* LOCAL VARIABLE */
		int a; //allowed but can't be utilised without initialization.
		System.out.println(a); //compile time error
		
		

		StaticNonStatic s1 = new StaticNonStatic();
		System.out.println(s1.mob); // 0
		System.out.println(s1.age); // 30
		
		//Differne copies for the same insance variables
		StaticNonStatic s2 = new StaticNonStatic();
		s2.mob = 9191919191L;
		s1.mob = 123456789L;
		System.out.println(s2.mob); 
		System.out.println(s1.mob);
		
		
		
		/* STATIC VARIABLE */
		System.out.println(marks); //0
		System.out.println(name); //Rahul
	}
}

/*
	<-------------------------------- STATIC VS NON-STATIC 	-------------------------------->
		
	Static : 
		1. They are class level members.
		2. They get executed once the class is loaded 
		3. They need not Instance of the class either for their execution or manipulation or any other operatiosn. They can be accessed directly or using respective class name and
		4. They would be common for all the Instance of the class. 
		5. They are loaded inside the context area of the RAM. 
		6. They can be utilised without initialization. Default value will be assigned to them. Eg: for int = 0, null for String etc. 
		8. Example : JA-111 is common batchname for all the 100 students. So we need not to define it as a variable for every student of Java batch. We can
					create it one time with static as prefix and use directly inside the objects of each students. 
	
	
	
	Non-Static : 
	=> It comes in 2 types 
		A. Instance Variable => 
			1. They are Instance/Object level members. 
			2. They need instance of the class for their execution.
			3. Each instance/object of the class can have copies of Instance members separately.
			4. They are loaded inside the Heap Area of the RAM.
			5. They are defined in the class area. 
			6. Same like static variables, they can also be utilised without initialization.
			7. Example : String name; variable could be different for all the students of Java batch. So, each of the object of Student can have copy but with different value of name variable.
		
		B. Local Variable => 
			1. The variables which are part of a static/non static block, static/nonstatic method, constructor are treated as Local variables.
			2. Their scope is limited within { ... } of their respective carriers. 
			3. They can be declared without initialization but they can't be utilised without initialization.
			4. They lifespan stays until the execution of their carrier. Eg: Method. Once the method is executed local variables are garbage collected.













 * */
