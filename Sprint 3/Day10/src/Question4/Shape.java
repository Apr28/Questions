package Question4;
public abstract class Shape {

	public abstract int rectangleArea(int length, int breadth);
	public abstract int squareArea(int side);
	public abstract int circleArea(int radius);
}



class Area extends Shape {

	@Override 
	public int rectangleArea(int length, int breadth) {
		int area = length * breadth;
		return area;
	}

	@Override 
	public int squareArea(int side) {
		return side * side;
	}

	
	@Override 
	public int circleArea(int radius) {
		double pi = 3.14;
		double area = pi * radius;
		return (int)area;
	}
}

