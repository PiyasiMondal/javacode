package AccessSpecifierInsidePackage;
//Assignment 61
public class Class2 {
	private void add() {
		System.out.println("Hi, i am addition.");
		System.out.println("I am Private.");
	}

	public void sub() {
		System.out.println();
		System.out.println("Hi, i am Subtraction.");
		System.out.println("I am Public.");
	}

	protected void mul() {
		System.out.println();
		System.out.println("Hi, i am Multiplication.");
		System.out.println("I am Protected.");
	}

	void div() {
		System.out.println();
		System.out.println("Hi, i am Divition.");
		System.out.println("I am Default.");
	}
}
