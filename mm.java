public class Mainnn {
    public static void main(String[] args) {
     CircleArea circle = new CircleArea(6.4);
     System.out.println(circle);
    } }
     class CircleArea {
    private double radius;
    private double area;
    public CircleArea(double radius) {
     this.radius = radius;
    }
    public double getArea() {
     area = Math.PI * radius * radius;
     return area;
    }
    @Override
    public String toString() {
     return "Area of circle with radius (" + radius + ") is " + getArea();
    } }
    