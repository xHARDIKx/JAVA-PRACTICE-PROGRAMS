public class details {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();

        // Set instance variables
        person.setName("hardik");
        person.setAge(20);
        person.setSalary(500000);

        // Display instance variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());
    }
}

class Person {
    private String name;
    private int age;
    private double salary;

    // Getter and Setter methods for instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
