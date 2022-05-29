package Question1;
import java.util.Scanner;
public class Main {

	public static String reverseString(String input) {
		char [] allCharsOfString = input.toCharArray();
		String bag = "";
		
		for(int i=allCharsOfString.length-1; i>=0; i--) {
			bag += allCharsOfString[i];
		}

		return bag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse : ");
		
		String originalString = sc.next();
		
		String result = reverseString(originalString);
		
		System.out.println("Original String is : " + originalString);
		System.out.println("Reversed String is : " + result);
	}
	
	
}

