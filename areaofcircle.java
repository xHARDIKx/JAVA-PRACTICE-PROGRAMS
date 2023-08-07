public class areaofcircle {
    
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius +  "  is "
       + area);
        } }