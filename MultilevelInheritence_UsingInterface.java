package basicProgramofJava;

//Assignment 66
//Multilevel inheritance.
interface GrandParentt
{
void mul();
void div();
}

abstract class parentt implements GrandParentt
{
abstract void add();
abstract void sub();
void concreteMethod()
{
System.out.println("");
System.out.println("Logic will be exposed");
}
}

public class MultilevelInheritence_UsingInterface extends parentt
{
@Override
public void mul()
{
System.out.println("");
System.out.println("I am multiplication");
System.out.println("I belong to interface");
System.out.println("My access specifier is public");
System.out.println("Logic will be abstracted");
}

@Override
public void div()
{
System.out.println("");
System.out.println("I am Divition");
System.out.println("I belong to interface");
System.out.println("My access specifier is public");
System.out.println("Logic will be abstracted");
}
@Override
void add()
{
System.out.println("");
System.out.println("I am Addition");
System.out.println("I belong to abstract class");
System.out.println("Logic will be abstracted");
}
@Override
void sub()
{
System.out.println("");
System.out.println("I am subtraction");
System.out.println("I belong to abstract class");
System.out.println("Logic will be abstracted");
}
public static void main(String[] args)
{
MultilevelInheritence_UsingInterface g=new MultilevelInheritence_UsingInterface();
g.add();
g.add();
g.sub();
g.mul();
g.div();
g.concreteMethod();
}
}
