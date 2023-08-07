public class inst {
	public static void main(String[] args) {

    	Person jake = new Person();
    	jake.setName("hardik");
    	jake.setAge(20);
    	jake.setSalary(12000);
    	System.out.println(jake);
	}
}

 class Person { 
	private String name;
	private int age;
	private int salary;

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

	public int getSalary() {
    	return salary;
	}

	public void setSalary(int salary) {
    	this.salary = salary;
	}

	@Override
	public String toString() {
    	return getName() + " is " + getAge() + " years old and is earning $" + getSalary();
	}
}
