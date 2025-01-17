package basicProgramofJava;

public class NonStaticMethod {
	// Assignment 18

	void login()// Non static method, So need object to call in main method
	{
		System.out.println("Login with email id");
	}

	void logout()// No need to create another object to call this method as we already have one
					// object created.
	{
		System.out.print("U are Loggedout");
	}

	public static void main(String[] args) {
		NonStaticMethod N = new NonStaticMethod();// Object creation.
		// Non parameterized non static method calling inside main method
		N.login();
		N.logout();
	}

}
