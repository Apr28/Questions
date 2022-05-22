package Question4;
public class Problem4 {

	void doOperation(int num) {
		if(num < 0) {
			System.out.println("Input: "+ num+ "  Output: Error");
		}
		
		else if(num % 2 == 1) {
			System.out.println("Input: "+ num+ "  Output: "+ num);
		}
		else if(num % 2 == 0) {
			double number =  (double)num/10;
			int nextMultipleOfTen = (int) (10 * (Math.ceil(number)));
			System.out.println("Input: "+ num+ "  Output: "+ nextMultipleOfTen);
		}
		
	}
	
	
	public static void main(String[] args) {
		Problem4 pb = new Problem4();
		pb.doOperation(44);
		

	}
}
