package Question1;
public class Student {

	int roll ;
	String name;
	int age;
	int marks;
	
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	
	public void setName(String nm) {
		this.name = nm;
	}
	public void setRoll(int rl) {
		this.roll = rl;
	}
	public void setAge(int ag) {
		if(ag > 18 && age < 60) {
			this.age = ag;
		}
	}
	public void setMarks(int mr) {
		if(mr > 0 && mr < 500) {
			this.marks = mr;
		}
	}
	
	Student(){
		
	}
	
	Student(int rl, String nm, int mr, int ag){
		this.name = nm;
		this.roll = rl;
		if((ag > 18 && ag < 60) && (mr > 0 && mr < 500)) {
			this.marks = mr;
			this.age = ag;
			System.out.println("Name : "+name+ "\nRoll : "+roll+ "\nAge : "+age+"\nMarks : "+marks);
		}
		else {
			System.out.println("Name : "+name+ "\nRoll : "+roll);
		}

	}
	
}
