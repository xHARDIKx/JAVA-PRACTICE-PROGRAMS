
public class SHAPE {
	public static void main(String[] args) {

    	ShapeArea square = new ShapeArea(9.0);
    	ShapeArea rectangle = new ShapeArea(6.0, 7.0);

    	System.out.println(square);
    	System.out.println(rectangle);
	}
}

 class ShapeArea {
	public double length;
	public double breadth;

	public ShapeArea(double length) {
    	this.length = length;
    	this.breadth = length;
	}

	public ShapeArea(double length, double breadth) {
    	this.length = length;
    	this.breadth = breadth;
	}

	public double getArea() {
    	return length * breadth;
	}

	@Override
	public String toString() {
    	return "Area is " + getArea();
	}
}

