public class areashape {
	public static void main(String[] args) {

    	ShapeArea square = new ShapeArea(5.0);
    	ShapeArea rectangle = new ShapeArea(3.0, 6.0);

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
