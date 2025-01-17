package basicProgramofJava;

public class MathClassProgram {
	// Assignment 29,35
	double pi_value_nonstatic_variable = Math.PI; // PIdouble//PI is Final value//It is global variable, non static
													// variable
	static double pi_value_static_variable = Math.PI; // PIdouble//PI is Final value//t is a global variable, static
														// variable

	public static void main(String[] args) {
		// Any call under java.lang package need not to be import it
		// Math has all static methods
		// static method can be called classname.methodName(Math.className)
		System.out.println(Math.addExact(10, 10));
		// addexact(int, int)
		System.out.println(Math.addExact(200000000, 2));
		// addexact(long, long)
		System.out.println(Math.subtractExact(10, 2));
		// Subtractexact(int, int)
		System.out.println(Math.subtractExact(200000, 20));
		// Subtractexact(long, long)
		System.out.println(Math.multiplyExact(5, 5));
		// miltiplyexact(int, int)
		System.out.println(Math.multiplyExact(500, 5));
		// miltiplyexact(long, long)
		System.out.println(Math.multiplyExact(500, 50));
		// miltiplyexact(long, int)
		System.out.println(Math.max(500, 50));
		// max(int, int)
		System.out.println(Math.max(500, 50));
		// max(double, double)
		System.out.println(Math.max(500.90, 50.45));
		// max(float, float)
		System.out.println(Math.max(500, 50));
		// max(long, long)
		System.out.println(Math.min(500, 50));
		// min(int, int)
		System.out.println(Math.min(500, 50));
		// min(double, double)
		System.out.println(Math.min(500.90, 50.45));
		// min(float, float)
		System.out.println(Math.min(500, 50));
		// min(long, long)
		System.out.println(Math.abs(-600.8));
		// abs(double)//Will print the positive value
		System.out.println(Math.abs(-5.2));
		// abs(float)
		System.out.println(Math.abs(-500));
		// int(int)
		System.out.println(Math.abs(-290898764));
		// abs(long)
		int a = 10;
		int b = 20;
		int add = Math.addExact(a, b);
		int sub = Math.subtractExact(a, b);
		int mul = Math.multiplyExact(a, b);
		int div = Math.divideExact(a, b);
		System.out.println("Add a and b:" + add);
		System.out.println("sub a and b:" + sub);
		System.out.println("mul a and b:" + mul);
		System.out.println("div a and b:" + div);
		int r1 = 10;
		MathClassProgram MP = new MathClassProgram();
		double area1 = MP.pi_value_nonstatic_variable * r1 * r1;
		System.out.println("Area of circle One:" + area1);
		// Assignment 36
		int r2 = 12;
		double area2 = pi_value_static_variable * r2 * r2;
		System.out.println("Area of circle Two:" + area2);
		for (int i = 1; i <= 100; i++) {
			System.out.println(Math.random());
			// Generate random value each time, Double data type
		}
	}
}