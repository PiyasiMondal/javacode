package basicProgramofJava;
//Assignment 37,38,39,40,41,42,43,44,45,46
import java.util.Scanner;//Scanner class comes from java.util package
//import java.util.Scanner;

public class ScannerClass {

	
	
		public static void main(String[] args)
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
		//S1.next();//Return type of next method is string.
		//String name= S1.next();
		System.out.println();
		System.out.println("Enter the value of a1:That is a string value");
		String a1 =S1.next();
		System.out.println("Enter the value of c:That is a int value");
		int c =S1.nextInt();
		System.out.println("Enter the value of bi:That is a byte value");
		byte bi =S1.nextByte();
		System.out.println("Enter the value of sh:That is a short value");
		short sh =S1.nextShort();
		System.out.println("Enter the value of d:That is a double value");
		double d =S1.nextDouble();
		System.out.println("Enter the value of bn:That is a boolean value");
		boolean bn =S1.nextBoolean();
		System.out.println("Print the value of a1:" +a1);
		System.out.println("Print the value of c:" +c);
		System.out.println("Print the value of bi:" +bi);
		System.out.println("Print the value of sh:" +sh);
		System.out.println("Print the value of d:" +d);
		System.out.println("Print the value of bn:" +bn);
		System.out.println("Enter the value of B:");
		int B=S1.nextInt();
		System.out.println("Enter the value of H:");
		int H=S1.nextInt();
		int areaoftriengle=(B*H)/2;
		System.out.println("area of triangle:"+ areaoftriengle);
		System.out.println();
		System.out.println("Enter the value of first side:");
		int Fside=S1.nextInt();
		System.out.println("Enter the value of second side:");
		int Sside=S1.nextInt();
		System.out.println("Enter the value of third side:");
		int Tside=S1.nextInt();
		int CofTriangle=Fside+Sside+Tside;
		System.out.println("Circumfrerance of rectangle:"+ CofTriangle);
		System.out.println();
		System.out.println("Enter the value of R:");
		int R=S1.nextInt();
		double pi=Math.PI;
		double areaofcircle=pi*R*R;
		System.out.println("area of circle:"+ areaofcircle);
		double Cofcircle=2*pi*R;
		System.out.println("Circumfrerance of rectangle:"+ Cofcircle);
		System.out.println();
		System.out.println("Enter the value of L:");
		int L=S1.nextInt();
		System.out.println("Enter the value of Base:");
		int Base=S1.nextInt();
		int areaofrectangle=L*Base;
		System.out.println("area of rectangle:"+ areaofrectangle);
		int Cofrectangle=2*(L*Base);
		System.out.println("Circumfrerance of rectangle:"+ Cofrectangle);
		System.out.println();
		System.out.println("Enter the value of area:");
		int area=S1.nextInt();
		int areaofsquere=area*area;
		System.out.println("area of rectangle:"+ areaofsquere);
		int CofSquere=4*area;
		System.out.println("Circumfrerance of rectangle:"+ CofSquere);
		
		S1.close();
		}
		
		
}
