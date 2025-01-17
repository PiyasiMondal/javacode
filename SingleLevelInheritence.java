package basicProgramofJava;

class Parent {
//Assignment 48,49
	static void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("sum of a and b:" + sum);
	}

	void mul(int a, int b) {
		int mul = a * b;
		System.out.println("mul of a and b:" + mul);
	}
}

public class SingleLevelInheritence extends Parent {
	static void subtract() {
		int a = 20;
		int b = 20;
		int sub = a - b;
		System.out.println("sub of a and b:" + sub);
	}

	public static void main(String[] args) {
		subtract();
		add();
		SingleLevelInheritence Si = new SingleLevelInheritence();
		Si.mul(10, 20);
	}

}
