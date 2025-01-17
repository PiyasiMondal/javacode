package basicProgramofJava;

class class1 {
//Assignment 53,54,55,56
	class1(int a) {
		System.out.println("Parameterized contractor of class1:");
		System.out.println("Constractor 1:");
		System.out.println("Value of a:" + a);
	}
}

class class2 extends class1 {
	class2() {
		super(40); // Parameterized, Explicit///calling class1 constructor
		System.out.println("Non Parameterized contractor of class2:");
		System.out.println("Constractor 2:");
	}
}

class class3 extends class2 {
	class3() {
		super(); // Non Parameterized, Explicit//calling class2 constructor
		System.out.println("Non Parameterized contractor of class3:");
		System.out.println("Constractor 3:");
	}
}

class class4 extends class3 {
	class4(int b) {
		super(); // Non Parameterized, Implicit//calling class3 constructor
		System.out.println("Parameterized contractor of class3:");
		System.out.println("Constractor 4:");
		System.out.println("Value of b:" + b);
	}
}

public class SuperParameterised extends class4 {
	SuperParameterised() {
		super(10);// Parameterized, Explicit///calling class4 constructor
		System.out.println("Constractor 4:");
	}

	public static void main(String[] args) {
		new SuperParameterised();
	}
}
