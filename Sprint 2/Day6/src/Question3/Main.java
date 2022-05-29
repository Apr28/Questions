
//Find Prime Number ----->
package Question3;
public class Main {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
		int [] secondArray = new int [inputArray.length];
		
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
		
		for(int i=0; i<inputArray.length; i++) {
			boolean flag = false;
			for(int j=2; j<inputArray[i]; j++) {
				if(inputArray[i] % j == 0) {
					flag = true;
				}
			}
			
			if(flag == false) {
				secondArray[i] = inputArray[i];
			}
		}
		
		
		return secondArray;
		
	}
	
	
	public static void main(String[] args){
	//Create the object of Main class
	//on the object of Main class call the findAndReturnPrimeNumbers method
	//by supplying the following array as the parameter
	int[] arr = {10,12,5,50,11,14,15};
	//print each element from the returned array of findAndReturnPrimeNumbers method
	//if findAndReturnPrimeNumbers method returns an empty array then print the following
	//message:
	// "Prime number not found in the supplied Array"
	
	Main m = new Main();
	int[] answer = m.findAndReturnPrimeNumbers(arr);
	
	int count = 0; 
	for(int i=0; i<answer.length; i++) {
		if(answer[i] == 0) {
			count++;
		}
	}
	if(count == answer.length) {
		System.out.println("Prime number not found in the supplied Array");
	}
	else {
		for(int i=0; i<answer.length; i++) {
			if(answer[i] != 0) {
				System.out.println(answer[i]);
			}
		}
	}	
	}
}