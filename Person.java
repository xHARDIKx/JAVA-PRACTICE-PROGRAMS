public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("hardik", 20);
        System.out.println("Hi, my name is " + person1.name + " and I am " + person1.age + " years old.");
    }
}
