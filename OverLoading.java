package basicProgramofJava;

public class OverLoading {

	// Assignment 22,23,24,25
	OverLoading() {
		System.out.println("This is default constractor");
	}

	OverLoading(int a, int b)// Local variable
	{
		System.out.println("This is second constractor:" + a);
		System.out.println("This is second constractor:" + b);
	}

	OverLoading(double a) {
		System.out.println("This is third constractor:" + a);
	}

	OverLoading(boolean a) {
		System.out.println("This is forth constractor:" + a);
	}

	OverLoading(char C) {
		System.out.println("This is fifth constractor:" + C);
	}

	static void Overloading(int a, int b) {
		System.out.println("This is static method overloading 1:" + a);
		System.out.println("This is static method overloading 1:" + b);
	}

	static void Overloading(double a) {
		System.out.println("This is static method overloading 2:" + a);
	}

	static void Overloading(boolean a) {
		System.out.println("This is static method overloading 3:" + a);
	}

	static void Overloading(char C) {
		System.out.println("This is static method overloading 4:" + C);
	}

	static void Overloading(String Name) {
		System.out.println("This is static method overloading 5:" + Name);
	}

	void Overloading(int a) {
		System.out.println("This is non static method overloading 1:" + a);
	}

	void Overloading(int b, double d) {
		System.out.println("This is non static method overloading 2:" + b);
		System.out.println("This is non static method overloading 2:" + d);
	}

	void Overloading(String Name, String PWD) {
		System.out.println("This is non static method overloading 3:" + Name);
		System.out.println("This is non static method overloading 3:" + PWD);
	}

	void Overloading(char a, char b) {
		System.out.println("This is non static method overloading 4:" + a);
		System.out.println("This is non static method overloading 4:" + b);
	}

	void Overloading(Double a, int b) {
		System.out.println("This is non static method overloading 5:" + a);
		System.out.println("This is non static method overloading 5:" + b);
	}

	public static void main(String[] args) // Assignment 24,25
	{
		new OverLoading(); // Contractor overloading// Assignment 22,25
		new OverLoading(5, 4);
		new OverLoading(3.5);
		new OverLoading(true);
		new OverLoading('P');
		Overloading(2, 5); // static method overloading// Assignment 23,24
		Overloading(2.5);
		Overloading(false);
		Overloading('P');
		Overloading("Piya");
		OverLoading O1 = new OverLoading(); // Non static method overloading//Assignment 24,25
		O1.Overloading(10);
		O1.Overloading(3000, 3.7);
		O1.Overloading("piku", "piku'");
		O1.Overloading('p', 'p');
		O1.Overloading(5.5, 5);
	}

}
