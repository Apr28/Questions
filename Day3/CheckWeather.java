package Day3;
public class CheckWeather {

	public static void main(String[] args) {
	
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 60.00;
		
		if(isSnowing || isRaining || temperature < 50.00) {
			System.out.println("Let's stay home!");
		}
		else {
			System.out.println("Let's go out!");
		}
	}
	
	
	
}
