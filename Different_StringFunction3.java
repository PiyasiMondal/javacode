package basicProgramofJava;

//Assignment 94,95,96,97
public class Different_StringFunction3 {
	public static void main(String[] args) {
		// String is immutable
		String s = "automation";
		String t = s.concat("testing");
		System.out.println(t);
		System.out.println(s);
		String a1 = new String("Piyasi");
		System.out.println(a1);
		StringBuffer sb = new StringBuffer("Laptop");
		sb.append("is good");
		System.out.println(sb);
		// String buffer is Mutable
		String name = "Manish Kumar Tiwari";
		System.out.print(name.substring(0, 1));
		System.out.print(name.substring(7, 8));
		System.out.print(name.substring(13, 14));
		System.out.println();
		System.out.println();
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(7, 8));
		System.out.println(name.substring(13, 14));
	}
}
