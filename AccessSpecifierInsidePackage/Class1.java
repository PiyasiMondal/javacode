package AccessSpecifierInsidePackage;
//Assignment 61
public class Class1 {
	{
		System.out.println("Hi, we are checking which access specifier is accessable for inside the package");
		Class2 ac=new Class2();
		//ac.add();//Add id private to class 2, so can not access.
		ac.sub();
		ac.mul();
		ac.div();
		}
}
