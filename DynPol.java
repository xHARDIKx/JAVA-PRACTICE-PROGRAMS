public class DynPol {
    public static void main(String[] args) {
        Car hCar = new Honda();
        hCar.start();
    }
}

interface Machine {
    void start();
}

class Car implements Machine {
    public void start() {
        System.out.println("Car Started");
    }
}

class Honda extends Car {
    public void start() {
        System.out.println("Honda Car Started");
    }
}
