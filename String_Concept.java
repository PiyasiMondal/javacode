package basicProgramofJava;
//Assignment 128 to 136
public class String_Concept {

	public static void main(String[] args) {
		String a = new String("Automation");
		a.concat("testing");
		System.out.println(a);
		// Immutable: can not be changed
		StringBuffer a1 = new StringBuffer("Automation");
		a1.append("testing");
		System.out.println(a1);
		// Mutable
		StringBuffer s = new StringBuffer("Manish Kumar Tiwari");
		System.out.println(s);
		s.delete(0, 6);
		System.out.println(s);
		System.out.println(s.insert(7, "Manish"));
		System.out.println(s.substring(7));
		System.out.println(s.substring(7, 12));
		System.out.println(s.reverse());
		System.out.println(s.charAt(7));
		StringBuffer name = new StringBuffer("Manish Kumar Tiwari");
		System.out.println(name.replace(7, 12, "Rai"));
		StringBuilder a2 = new StringBuilder("Automation");
		a2.append("testing");
		System.out.println(a2);
		// Mutable
	}
}
