package basicProgramofJava;

public class GlobalVariable {

	static int a;
	static byte b;
	static short c;
	static long l;
	static float f;
	static char h;
	static String st;
	static boolean bl;
	int nonstaticglobalvariable = 50; // Non static global variable.
	static double pi = 3.14;// global variable(static)
	static double dl = 20.9; // update the value of global variable(static)
	int in = 300;// update the value of global variable(non static)
	int tk = 500;// Update the global variable locally

	static void defaultvalue() {
		System.out.println("Default value of int for global variable:" + a);
		System.out.println("Default value of byte for global variable:" + b);
		System.out.println("Default value of short for global variable:" + c);
		System.out.println("Default value of long for global variable:" + l);
		System.out.println("Default value of float for global variable:" + f);
		System.out.println("Default value of string for global variable:" + st);
		System.out.println("Default value of boolean for global variable:" + bl);
		System.out.println("Default value of char for global variable:" + h);
	}

	static void areaofcircle() {
		double area = pi * 10 * 10;
		System.out.println("Area of first circle:" + area);
	}

	public static void main(String[] args) {
		defaultvalue();
		areaofcircle();
		double area1 = pi * 15 * 15;
		System.out.println("Area of second circle" + area1);
		GlobalVariable G1 = new GlobalVariable();
		System.out.println(G1.nonstaticglobalvariable);
		dl = 20.5; // update the value of global variable(static)
		System.out.println("Updated value of static global variabledl:" + dl);
		GlobalVariable GV = new GlobalVariable();
		GV.in = 100;// update the value of global variable(non static)
		System.out.println("Updated value of non static global variable in:" + GV.in);
		int tk = 10;// Update the global variable locally, this is local variable
		System.out.println("Update the global variable locally:" + tk);
	}
}
