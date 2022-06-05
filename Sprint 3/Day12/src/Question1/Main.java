package Question1;
import java.util.Scanner;
import java.util.regex.*;
public class Main { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userParagraph = input.nextLine();
		
		Pattern pattern = Pattern.compile("Java");
		Matcher match = pattern.matcher(userParagraph);
		int count = 0;
		while(match.find()) {
				count++;
				System.out.println(match.start() + "-------" + match.end() + "-------" + match.group());
			}
			
			System.out.println("Total number of occurencies of Java - " + count);
		}

}
