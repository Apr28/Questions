package Question2;
public class EvenSumInColumns {

	static void calculateSum() {
		int rowSize = 3;
		int colSize = 3;
		int k = 0;
		
		int [][] matrix = new int [rowSize][colSize];
		
		for(int i=0; i<rowSize; i++) {
			
			for(int j=0; j<colSize; j++) {
				k++;
				
				matrix[i][j] = k;
				
			}
		}
		
		for(int j=0; j<colSize; j++) {
			int sum = 0; 
			for(int i=0; i<rowSize; i++) {
				if(matrix[i][j] % 2 == 0) {
					sum += matrix[i][j];
				}
			}
			
			System.out.println(sum);
		}

	}
	
	
	public static void main(String[] args) {
		calculateSum();
	}
	
}
