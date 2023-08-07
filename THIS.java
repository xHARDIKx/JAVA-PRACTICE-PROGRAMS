public class THIS {
	public static void main(String[] args) {

    	Person person1 = new Person("hardik", 20);
    	Person person2 = new Person("jain", 19);

    	person1.printPerson();
    	person2.printPerson();
	}
}

 class Person {
	private String name;
	private int age;


	public Person(String name, int age) {
    	this.name = name;
    	this.age = age;
	}

	public void printPerson() {
    	System.out.println(name + " is " + age + " years");
	}
}
