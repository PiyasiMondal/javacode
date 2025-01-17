package basicProgramofJava;

public class ThisForGlobalLocalVariable {
	// Assignment 59
	int age;
	String name;
	double salary;

	void emp_details(int age, String name, double salary) {
		System.out.println("My age:" + age);
		System.out.println("My name:" + name);
		System.out.println("My salary:" + salary);
		this.age = age; // this.global variable=local variable
		this.name = name; // value assigned from right to left so
		this.salary = salary; // local variable value get assigned to global variable.
	}

	public static void main(String[] args) {
		ThisForGlobalLocalVariable o1 = new ThisForGlobalLocalVariable();
		o1.emp_details(18, "Piya", 150000);// pass the local variable value
		System.out.println(o1.age); // Global variable default value 0
		System.out.println(o1.name); // Global variable default value null
		System.out.println(o1.salary); // Global variable default value 0.0
	}

}
