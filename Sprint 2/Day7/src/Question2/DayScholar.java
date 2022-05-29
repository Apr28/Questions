package Question2;
public class DayScholar extends Student{
	
	double transportFee;

	public DayScholar() {
		super();
	}
	public DayScholar(int id, String name, double fee, double transFee) {
		super(id, name, fee);
		this.transportFee = transFee;
	}
	
	public void setTransportFee(double transFee) {
		this.transportFee = transFee;
	}
	
	
	public double payFee() {
		double sum = this.transportFee + this.examFee;
		return sum;
	}
	
}
