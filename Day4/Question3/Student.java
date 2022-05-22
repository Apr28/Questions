//QUESTION NUMBER -- 3

package Question3;
public class Student {
	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	Student(int rl, String nm, String adr){
		this.name = nm;
		this.roll = rl; 
		this.address = adr;
	}
	
	Student(int rl, String nm, String adr, String cln){
		this.name = nm;
		this.roll = rl; 
		this.address = adr;
		this.collageName = cln;
	}
	
	public int getRoll() { 
		return roll;
	}

		
	public String getName() { 
		return name;
	}

	
	public String getAddress() { 
		return address;
	}

	
	public String getCollName() { 
		return collageName;
	}

	
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT) {
			Student s = new Student(20, "Shubham", "Patna, Bihar"); 
			return s;
		}
		else {
			Student s = new Student(31, "Saurabh", "Jaipur, Rajasthan", "RTU"); 
			return s;
		}
	}

}
