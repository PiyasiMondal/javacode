package basicProgramofJava;

public class ThisCalling {
	// Assignment 57

	ThisCalling() {
		this(5, 4);
		System.out.println("This is default constractor");
	}

	ThisCalling(int a, int b)// Local variable
	{
		this(3.5);
		System.out.println("This is second constractor:" + a);
		System.out.println("This is second constractor:" + b);
	}

	ThisCalling(double a) {
		this(false);
		System.out.println("This is third constractor:" + a);
	}

	ThisCalling(boolean a) {
		this('p');
		System.out.println("This is forth constractor:" + a);
	}

	ThisCalling(char C) {
		System.out.println("This is fifth constractor:" + C);
	}

	public static void main(String[] args) {
		new ThisCalling(); // Contractor overloading//
		// new ThisCalling(5,4);
		// new ThisCalling(3.5);
		// new ThisCalling(true);
		// new ThisCalling('P');
	}

}
