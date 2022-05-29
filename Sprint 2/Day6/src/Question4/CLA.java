package Question4;
public class CLA {

	public static void doMaths(int inputNum) {
		int fact = 1;
		for(int i = inputNum; i>=1; i--) {
			fact *= i;
		}
	
		System.out.println(fact);
	}
	
	
	public static void main(String[] args) {
		if(args.length == 1) {
			int num = Integer.parseInt(args[0]);
			doMaths(num);
		}
		else if(args.length == 2) {
			int num  =  Math.abs(Integer.parseInt(args[0]) - Integer.parseInt(args[1])) ;			
			doMaths(num);
		}
		else if(args.length > 2) {
			System.out.println("Error");
		}
	}
}
