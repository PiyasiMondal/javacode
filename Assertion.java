package basicProgramofJava;

public class Assertion {
	//Assignment: 31
	public static void main(String[] args)
	{
	int age=20;
	assert age>18;//Assertion error : As a programmer i can create an exception using assert.
	System.out.println("U can vote");
	int salary=150000;
	boolean pf=true;//Can not use two assert together.
	assert (salary<=100000&&pf==true):"u come under 50% of indian";
	System.out.println("U come under 10%of indian");
	}
	
}
