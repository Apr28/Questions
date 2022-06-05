package Question1;
public interface Hotel {

	void chickenBiryani();
	void masalaDosa();
}



class TajHotel implements Hotel {
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}
	public void chickenBiryani() {
		System.out.println("Chicken Biryani from Taj Hotel");
	}
	
	public void masalaDosa() {
		System.out.println("Masala Dosa from Taj hotel");
	}
	
}

class RoadSideHotel implements Hotel {
	
	public void chickenBiryani() {
		System.out.println("Chicken Biryani from Road side Hotel");
	}
	
	public void masalaDosa() {
		System.out.println("Masala Dosa from Taj Road side hotel");
	}
}