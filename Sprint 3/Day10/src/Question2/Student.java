package Question2;
public abstract class Student {

		String name;
		String address;
		
		Student(String nm, String add){
			this.name = nm;
			this.address = add;
		}
		
		abstract int getPercentage();

		public String getName() {
			return name;
		}

		public String getAddress() {
			return address;
		}		
}


class ScienceStudent extends Student {
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	ScienceStudent(String name, String address, int phy, int chem, int math){
		super(name, address);
		if(phy >0 && phy <= 100) {
			this.phisicsMarks = phy;
		}
		if(chem > 0 && chem <= 100) {
			this.chemistryMarks = chem;
		}
		if(math > 0 && math <= 100) {
			this.mathsMarks = math;
		}
	}
	

	public int getPercentage() {
		int obtainedMarks = this.phisicsMarks + this.chemistryMarks + this.mathsMarks;
		int percentage = (obtainedMarks / 3);
		return percentage;
	}


	public int getPhisicsMarks() {
		return phisicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}


	public int getMathsMarks() {
		return mathsMarks;
	}

}



class HistoryStudent extends Student {
	int historyMarks;
	int civicsMarks;
	
	HistoryStudent(String name, String address, int history, int civics){
		super(name, address);
		if(history >0 && history <= 100) {
			this.historyMarks = history;
		}
		if(civics > 0 && civics <= 100) {
			this.civicsMarks = civics;
		}
	}
	
	
	public int getPercentage() {
		int obtainedMarks = this.historyMarks + this.civicsMarks;
		int percentage = (obtainedMarks / 2);
		return percentage;
	}


	public int getHistoryMarks() {
		return historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}
	
}









