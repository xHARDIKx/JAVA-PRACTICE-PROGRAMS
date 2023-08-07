interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void run();
}

class Dog implements Mammal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void run() {
        System.out.println("Dog is running");
    }
}

public class Animalapp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
    }
}
