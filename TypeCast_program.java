package basicProgramofJava;
//Assignment 143
public class TypeCast_program {
	public static void main(String[] args) {
		int a = 20;
		double d = a;// Widening: Implicit
		System.out.println(d);
		int a1=30;
		double d1=(double)a1;
		System.out.println(d1);//Widening: Explicit
		double d2=40.5;//int a2=d2;//Not possible implicit: Narrowing
		int a2=(int)d2;//Narrowing:Explicitly
		System.out.println(a2);
	}
}
