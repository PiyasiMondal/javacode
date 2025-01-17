package basicProgramofJava;
//Assignment 27
public class Arithmetic_Operation_Using_Global_Variable {

	int a;
	int b;

	void add(int a, int b) {
		System.out.println("Addition of a and b:" + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("Substractiontion of a and b:" + (a - b));
	}

	void mul(int a, int b) {
		System.out.println("Multiplication of a and b:" + (a * b));
	}

	void div(int a, int b) {
		System.out.println("Divition of a and b:" + (a / b));
	}

	void mod(int a, int b) {
		System.out.println("Modulus of a and b:" + (a % b));
	}

	public static void main(String[] args) {
		Arithmetic_Operation_Using_Global_Variable A1 = new Arithmetic_Operation_Using_Global_Variable();
		A1.add(20, 20);
		A1.sub(20, 20);
		A1.mul(20, 20);
		A1.div(20, 20);
		A1.mod(23, 4);
	}

}
