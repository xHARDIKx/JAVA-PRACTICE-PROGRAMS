
class Person { void greet() {System.out.println("Hello, I am a person.");} }
class Indian extends Person { void greet() {System.out.println("Namaste, I am an Indian.");} }
class Aryan extends Indian { void learn() {System.out.println("I am learning Java programming.");} }

public class MulInheritance { 
    public static void main(String[] args) {
        Person p = new Person();
        Indian i = new Indian();
        Aryan a = new Aryan();
        p.greet(); i.greet(); a.greet(); a.learn();
    }
}
