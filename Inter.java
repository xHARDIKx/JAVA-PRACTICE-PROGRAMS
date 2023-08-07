public class Inter {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedLimit();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.speedLimit();
    }
}

interface Transportation {
    void speedLimit();
}

class Car implements Transportation {
    public void speedLimit() {
        System.out.println("Car speed limit: 60kmph");
    }
}

class Motorcycle implements Transportation {
    public void speedLimit() {
        System.out.println("Motorcycle speed limit: 70kmph");
    }
}
