package basicProgramofJava;
//Assignment 65

//Write a program to create relationship between class and interface

interface Addition {
	void add();

	void sub();
}

public class Class_and_InterfacePratice implements Addition {

	public static void main(String[] args) {
		Class_and_InterfacePratice c = new Class_and_InterfacePratice();
		c.add();
		c.sub();
	}

	@Override
	public void add() // access specifier is public forcefully.
	{
		System.out.println("Real logic by developer");
	}

	@Override
	public void sub() {
		System.out.println("Real logic by developer");
	}

}
