package Inheritance;
//Assignment 50,52
import java.util.Scanner;

public class AmazonParent {
	static void twowayauthentication()
	{
	System.out.println("Two way authentication");
	}
	static void paymentfeature()
	{
	System.out.println("Payment feature");
	}
	void arithmeticoperation()
	{
	Scanner S1=new Scanner(System.in);//takes input from human at run time.
	System.out.println("Enter the value of a:");
	int a= S1.nextInt();
	System.out.println("Enter the value of b:");
	int b= S1.nextInt();
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	int Div=a/b;
	int Mod=a%b;
	System.out.println("Addition of a and b is:"+sum);
	System.out.println("Subtraction of a and b is:"+sub);
	System.out.println("Multiplication of a and b is:"+mul);
	System.out.println("Divition of a and b is:"+Div);
	System.out.println("Modulus of a and b is:"+Mod);
	
	S1.close();
	}
	
}
