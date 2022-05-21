package Day2;
public class NaturalNumSum {

	static void doSumOfNaturalNumbers(int n) {
		
		if(n > 0) {
			int sum = (n * (n + 1)) / 2;
			System.out.println(sum);
		}
		else {
			System.out.println(n + " is not a Natural number.");
		}
		

	}
	
	public static void main(String[] args) {
		doSumOfNaturalNumbers(-5);
	}
}
