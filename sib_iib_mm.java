package basicProgramofJava;
//Assignment 141
public class sib_iib_mm {

	static {
		System.out.println("sib 1");
	}
	{
		System.out.println("iib 1");
	}
	{
		System.out.println("iib 2");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		sib_iib_mm sim = new sib_iib_mm();
		new sib_iib_mm();
	}

}
