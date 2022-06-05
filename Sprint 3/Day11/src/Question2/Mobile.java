package Question2;
import java.util.Scanner;
public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String companyName, String... models) {
		for(String model : models) {
			boolean flag = false;
			for(String out : outdatedModels) {
				if(model.equalsIgnoreCase(out)) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println(model+"_OUTDATED");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mobile m1 = new Mobile();
		System.out.println("Enter Mobile Company name : ");
		String mobComp = sc.next();
		
		System.out.println("How many models you want to verify(enter in digit)?");
		int inputQuant = sc.nextInt();
		String [] userModels = new String [inputQuant];
		for(int i = 0; i<inputQuant; i++) {
			System.out.println("Enter model name : ");
			String model = sc.next();
			userModels[i] = model;
		}
		
		m1.searchOutdatedModel(mobComp, userModels);
	}
}
