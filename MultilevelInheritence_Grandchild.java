package basicProgramofJava;

//Assignment 51
class GrandParent {
	static void login() {
		System.out.println("login");
	}
}

class ParentClass extends GrandParent {
	static void logout() {
		System.out.println("logout");
	}
}

public class MultilevelInheritence_Grandchild extends ParentClass {
	static void auth() {
		System.out.println("Authentication");
	}

	public static void main(String[] args) {
		login();
		logout();
		auth();
	}

}
