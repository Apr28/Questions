package Question4;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Area area = new Area();
		
		
		System.out.println("Enter the length of Rectangle");
		int length = sc.nextInt();
		System.out.println("Enter the Breadth of Rectangle");
		int breadth  =sc.nextInt();
		int areaOfRectangle = area.rectangleArea(length,breadth);
		System.out.println("Area of Rectangle : " + areaOfRectangle +"units");
		
		System.out.println("----------------\n");

		
		System.out.println("Enter the Radius of Circle");
		int radius  =sc.nextInt();
		int areaOfCircle = area.circleArea(radius);
		System.out.println("Area of Circle :  " + areaOfCircle + "units");

		System.out.println("----------------\n");
		
		
		System.out.println("Enter the side of Square");
		int side  =sc.nextInt();
		int areaOfSquare = area.squareArea(side);
		System.out.println("Area of sqaure : " + areaOfSquare+"units");

	}
}
