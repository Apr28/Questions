package Day2;
public class PrimeFactorial {
	
	static void primeFactorial(int num) {
		if(num>=2 && num <= 100) {
			for(int i=1; i<=num; i++) {
				
				if(num % i == 0) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Invalid Number");
		}
	}
	
	public static void main(String[] args) {
		primeFactorial(100);
	}

}
