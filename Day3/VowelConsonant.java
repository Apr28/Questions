package Day3;
public class VowelConsonant {

	void checkCharacter(char ch) {
		char [] lowercase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char [] uppercase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 	

		boolean flag = false;
		
		for(int i = 0; i<lowercase.length; i++) {
			if(ch == lowercase[i] || ch == uppercase[i]) {
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println(ch + " : Invalid Character");
		}
		else {
			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
				System.out.println(ch + " : is a Vowel"); 
			}
			else {
				System.out.println(ch + " : is a Consonant");
			}
		}
	
}
	
	public static void main(String[] args) {
		
		VowelConsonant vw1 = new VowelConsonant();
		vw1.checkCharacter('i');
		vw1.checkCharacter('P');
		vw1.checkCharacter('&');
		
		
	}
}
