package basicProgramofJava;
//Abstract class
//Assignment 64
abstract class Google_Auth
{
//only non static method can be overridden
abstract void login();
abstract void registration();
static void add()
{
System.out.println();
System.out.println("I am Concrete method");
System.out.println("I am Static method");
System.out.println("I am Add");
}
void sub()
{
}
}
//Concrete class->contains concrete methods>which will have implementation.
public class AbstractClassProgram_Amazon_Child extends Google_Auth {
	public static void main(String[] args)
	{
	AbstractClassProgram_Amazon_Child a=new
	AbstractClassProgram_Amazon_Child();
	a.login();
	a.registration();
	a.sub();
	add();
	}
	@Override
	void login()
	{
	System.out.println();
	System.out.println("I am Abstract method");
	System.out.println("I am Non Static method");
	System.out.println("I am overridden body");
	System.out.println("login API");
	}
	@Override
	void registration()
	{
	System.out.println();
	System.out.println("I am Abstract method");
	System.out.println("I am Non Static method");
	System.out.println("I am overridden body");
	System.out.println("Registraction API");
	}
	void sub()
	{
	System.out.println();
	System.out.println("I am Concrete method");
	System.out.println("I am Non Static method");
	System.out.println("I am overridden");
	System.out.println("I am subtraction");
	}
	
}
