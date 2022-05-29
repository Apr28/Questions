package Question2;
public class Student {
	
	int studId;
	String studName;
	double examFee; 
	
	public Student(){
		
	}
	public Student(int stdId, String stdName, double emFee) {
		this.studId = stdId;
		this.studName = stdName;
		this.examFee = emFee;
	}
	
	
	public void setStudId(int studId) {
		this.studId = studId;
	}
	
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
	
	public void displayDetails() {
		System.out.println("Name : "+ this.studName + "\nID : "+this.studId + "\nExamFee : "+ this.examFee);
	}
	
	
	//Fee Payment Method
	public double payFee() {

		return examFee;
	}
	
	
	

}
