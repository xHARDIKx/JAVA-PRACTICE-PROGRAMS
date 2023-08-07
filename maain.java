public class maain {
    
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, 6.4);
        System.out.println(circle);
        }
       }
        class Circle {
        private double radius;
        private double center;
        public Circle(double radius, double center) {
        this.radius = radius;
        this.center = center;
        }
        @Override
        public String toString() {
        return "Radius of circle is: " + radius + "cm and center is at" + center;
        }
       }