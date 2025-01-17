package basicProgramofJava;
//Assignment 83 to 93
public class Different_StringFunction2 {

	public static void main(String[] args)
	{
	String a= "automation";
	System.out.println("Before replace value of a:" +a);
	System.out.println(a=a.replace('a', 'm'));// Replacing character with character
	System.out.println("After replace value of a:" +a);
	System.out.println(a=a.replace("automation", "API"));// Replacing string with string
	System.out.println("After replace value of a:" +a);
	//replace the capital letter with nothing.
	String Name="Piyasi Mondal";
	System.out.println("Before replace value of Name:" +Name);
	System.out.println(Name=Name.replaceAll("[A-Z]", ""));// Replacing all with string , string
	System.out.println("After replace value of Name:" +Name);
	String k="Kv no 2";
	System.out.println("Before replace value of k:" +k);
	System.out.println(k=k.replaceAll("[a-z]", ""));// Replacing all with string ,string
	System.out.println("After replace value of k:" +k);
	String p="Kv no 22";
	System.out.println("Before replace value of p:" +p);
	System.out.println(p=p.replaceAll("[0-9]", ""));// Replacing all with string ,string
	System.out.println("After replace value of p:" +p);
	//Check the string consist of exact 3 letters"
	String i="axe";
	System.out.println(i.matches("..."));// return type is boolean.
	System.out.println(i.matches("....."));// return type is boolean.
	// .represents single character
	//.* represents multi character.
	//check if the string starts with a
	System.out.println(i.matches("a(.*)"));
	//check if the string ends with e
	System.out.println(i.matches("(.*)e"));
	//check if the string has u
	String n="piyasi mondal";
	System.out.println(n.matches("(.*)u(.*)"));
	System.out.println(n.matches("(.*)m(.*)"));
	//repeat the same string for 5 times.
	System.out.println(n.repeat(5));
	//what is last index of i.
	System.out.println(n.indexOf('i'));
	System.out.println(n.lastIndexOf('i'));
	//Input is:"Manish Kumar tiwari"
	//Output"MKT"
	//String sir="Manish Kumar Tiwari";
	//String is immutable
	String s="automation";
	String t=s.concat("testing");
	System.out.println(t);
	System.out.println(s);
	}

}
