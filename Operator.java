package basicProgramofJava;

public class Operator {
	static void ArithmeticOperator()// Assignment 3
	{
		addition();
		subtraction();
		division();
		multiplication();
		modulas();
	}

	static void conditionalOperator()
	{
		if_condition();// Assignment 4
		multipleifblock();
		if_else_condition();// Assignment 5
		if_elseif_else_condition();// Assignment 9
		nested_if_else_condition();// Assignment 10
	}

	static void LogicalOperator() {
		And_Operator();// Assignment 6
		Or_Operator();// Assignment 7
		Not_Operator();// Assignment 8,11,12
	}

	static void addition() {
		int a = 100; // declaration and initialization
		int b = 100;
		int sum = a + b;
		System.out.println("Addition:" + sum);
	}

	static void subtraction() {
		int a;// declaration
		a = 100;// initialization
		int b;
		b = 90;
		int sub = a - b;
		System.out.println("subtraction:" + sub);
	}

	static void multiplication() {
		int a = 100;
		int b = 10;
		int mul = a * b;
		System.out.println("Multiplication:" + mul);
	}

	static void division() {
		int a = 100;
		int b = 10;
		int Div = a / b;
		System.out.println("Divition:" + Div);
	}

	static void modulas() {
		double a = 100;
		double b = 10;
		double mod = a / b;
		System.out.println("Divition:" + mod);
	}

	static void if_condition() {
		int a = 10;
		int b = 20;
		if (a > b) // Greater then condition
		{
			System.out.println("Hello");
		}
		System.out.println("Outside the if Block");
		if (a < b) // lesser then condition
		{
			System.out.println("Inside the if block");
		}
		// System.out.println("Outside the if Block");
	}

	static void multipleifblock() {
		int a = 10;
		int b = 20;
		if (a > b) // Greater then
		{
			System.out.println("a>b");
		}
		if (a < b) // Less then
		{
			System.out.println("a<b");
		}
		if (a >= b) // Greater then or equals to
		{
			System.out.println("a>=b");
		}
		if (a <= b) // Less then or equals to
		{
			System.out.println("a<=b");
		}
		if (a == b) // Equals to
		{
			System.out.println("a==b");
		}
		if (a != b) // Not equals to
		{
			System.out.println("a!=b");
		}
	}

	static void if_else_condition() {
		int age = 45;
		if (age >= 18) {
			System.out.println("Elegible for vote");
		} else {
			System.out.println("Not Elegible for vote");
		}
	}

	static void if_elseif_else_condition()
		//In if else if block no matter how many condition is true, only first one block that satisfies the condition will be executed.
		//When none of the condition is satisfied then else block will execute.
		{
		int a=100;
		int b=200;
		if(a<b)
		{
		System.out.println("you are inside if block");
		}
		else if(a!=b)
		{
		System.out.println("You are inside else if block");
		}
		else
		{
		System.out.println("You are inside else block");
		}
		}
		

	static void nested_if_else_condition() {
		char Gender = 'M';
		int age = 20;
		int salary = 500;
		if (Gender == 'M') {
			if (age > 25) {
				if (salary > 700) {
					System.out.println("Inside nested if");
				} else if (salary < 300) {
					System.out.println("Inside nested if, else if");
				} else {
					System.out.println("Insise nested else");
				}
			} else {
				if (Gender == 'f') {
					System.out.println("inside else nested if");
				} else {
					System.out.println("inside else nested if else");
				}
			}
		}
	}

	static void And_Operator() {
		char gender = 'M';
		int age = 21;
		if (gender == 'M' && age > 12) {
			System.out.println("Full ticket");
		}
	}

	static void Or_Operator() {
		int a = 10;
		int b = 20;
		if (a > 5 || b == 20) {
			System.out.println(a + b);
		}
	}

	static void Not_Operator() {
		int a = 10;
		int b = 20;
		if (!(a == 10 && b == 19)) // Not operator with and operator. //Assignment 11
		{
			System.out.println("Not operator testing with and operator");
		}
		if (!(a == 9 || b == 19)) // Not operator with Or operator. //Assignment 12
		{
			System.out.println("Not operator testing with or operator");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		// Non parameterized static method calling inside main method
		ArithmeticOperator();
		conditionalOperator();
		LogicalOperator();
	}

}
