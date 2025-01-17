package basicProgramofJava;
//Assignment 142
public class sib_iib_mm_constractor {
	static {
		System.out.println("sib 1");
	}
	{
		System.out.println("iib 1");
	}
	{
		System.out.println("iib 2");
	}
	{
		System.out.println("iib 3");
	}

	sib_iib_mm_constractor() {
		System.out.println("Constractor 1");
	}

	sib_iib_mm_constractor(int a) {
		System.out.println("Constractor 2");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		new sib_iib_mm_constractor();
		sib_iib_mm_constractor sim = new sib_iib_mm_constractor(8);
	}
}
