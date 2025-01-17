package basicProgramofJava;

//Assignment 58
class Google {
	void login() {
		System.out.println("Login with mobile number");
	}
}

public class MethodOverriding extends Google// Inheritance present
{
	void login()// Same signature//Same method name//non static
	{
		super.login();
		System.out.println("Login with email id");
	}

	public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		m.login();// o/p is child class.//not going to call parent class method
	}

}
