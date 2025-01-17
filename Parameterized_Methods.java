package basicProgramofJava;

public class Parameterized_Methods {

	// Assignment 19,20,21
	//Any method that has something in bracket is called parameterized method.
	static void call_staticParameterisedMethod()
	{
	add(4,7); //static parameterized
	sub(20.5,2);
	mul(5.4,7);
	div(10,2);
	Login("piya@gmail.com","Password",'a',true);
	}
	static void add(int a, int b)
	{
	System.out.println(a+b);
	}
	static void sub(double a, int b)
	{
	System.out.println(a-b);
	}
	static void mul(double a, int b)
	{
	System.out.println(a*b);
	}
	static void div(int a, int b)
	{
	System.out.println(a/b);
	}
	static void Login(String un,String pwd,char d,boolean b)
	{
	System.out.println("Print the password");
	System.out.println("UN:"+un);
	System.out.println("PWD:"+pwd);
	System.out.println("d:"+d);
	System.out.println("b:"+b);
	}
	void add_nonstatic(int a,int b)
	{
	System.out.println(a+b);
	}
	void sub_nonstatic(int a,int b)
	{
	System.out.println(a-b);
	}
	void mul_nonstatic(int a,int b)
	{
	System.out.println(a*b);
	}
	void div_nonstatic(int a,int b)
	{
	System.out.println(a/b);
	}
	void Login_nonstatic(String un,String pwd,char d,boolean b)
	{
	System.out.println("Print the password");
	System.out.println("UN:"+un);
	System.out.println("PWD:"+pwd);
	System.out.println("d:"+d);
	System.out.println("b:"+b);
	}
	Parameterized_Methods()//Non parameterized contractor
	{
	System.out.println("Hi I am constractor");
	}
	public static void main(String[] args)
	{
	call_staticParameterisedMethod(); //Assignment 21
	Parameterized_Methods P1=new Parameterized_Methods(); //Assignment21
	P1.add_nonstatic(2, 5); //Call not static parameterized method
	//Assignment 19
	P1.sub_nonstatic(100, 40);
	P1.mul_nonstatic(2, 200);
	P1.div_nonstatic(25,3);
	P1.Login_nonstatic("piya@gmail.com","Password",'a',true);
	new Parameterized_Methods();// Assignment 20,21//Another way of creating object(Not advisable for non static method.
	}
}
