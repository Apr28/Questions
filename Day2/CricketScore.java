package Day2;
public class CricketScore {

	static void calculatTotalRuns(int a,  int b, int c, int d, int e) {
		
		if(a > 0 && b > 0 && c > 0 && d > 0 && e > 0) {	
			int sum = 0; 
			sum += a*1 + b*2 + c*3 + d*4 + e*6;
			System.out.println("Total run scored by batsman = "+sum);
		}
		else {
			System.out.println("Invalid score");
		}
		
	}
	
	public static void main(String[] args) {
		calculatTotalRuns(1, 2, 10, 4, 3);
	}
}
