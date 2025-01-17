package basicProgramofJava;

//Assignment 60
public class AccessSpecifierforMethods_forSameClass {
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

	public static void main(String[] args) {
		System.out.println("Hi, we are checking which access specifier is accessable for inside same class");
		System.out.println();
		AccessSpecifierforMethods_forSameClass ac = new AccessSpecifierforMethods_forSameClass();
		ac.add();
		ac.sub();
		ac.mul();
		ac.div();
	}

}
