package basicProgramofJava;
//Assignment 80

public class Array_WrapperClass {

	static int countof_Alphabet = 0;
	static int countof_Numeric = 0;
	static int countof_Space = 0;
	static int countof_SpecialCharacter = 0;

	public static void main(String[] args) {
		String a = "KV no 2 @@";
		char c[] = a.toCharArray();
		System.out.println("Given string is :" + a);
		System.out.println();
		// System.out.println(Arrays.toString(c));
		// Character.isSpace(c[0]);// Depreciated method
		// Date.parse(a)
		for (int i = 0; i < a.length(); i++) {
			// Count of alphabet
			boolean v = Character.isAlphabetic(c[i]);
			if (v == true) {
				countof_Alphabet++;
			}
			System.out.println(i + ":Index item Is alphabet :" + v);
			// Count of Numeric
			boolean d = Character.isDigit(c[i]);
			if (d == true) {
				countof_Numeric++;
			}
			System.out.println(i + ":Index item Is Space :" + d);
			// Count of space
			boolean s = Character.isWhitespace(c[i]);
			if (s == true) {
				countof_Space++;
			}
			System.out.println(i + ":Index item Is Numeric :" + s);
			// Count of Special character
			countof_SpecialCharacter = c.length - (countof_Alphabet + countof_Numeric + countof_Space); // c.length is
																										// length of
																										// array
			System.out.println();
		}
		System.out.println("Total number of alphabet:" + countof_Alphabet);
		System.out.println("Total number of Numeric:" + countof_Numeric);
		System.out.println("Total number of Space:" + countof_Space);
		System.out.println("Total number of Special character:" + countof_SpecialCharacter);
	}
}
