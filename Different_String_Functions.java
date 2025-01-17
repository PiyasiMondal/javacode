package basicProgramofJava;

import java.util.Arrays;
//Assignment 68,79

public class Different_String_Functions {
	public static void main(String[] args) {
		String a = "Piyasi Mondal";
		// Prints the length
		System.out.println(a.length());
		// return type is int.
		String name = new String(" Piyasi Mondal "); // Another way to write exam.
		// Prints the length
		System.out.println(name.length());
		// covert the string into capital letter.
		System.out.println(name.toUpperCase());
		// covert the string into small letter.
		System.out.println(name.toLowerCase());
		// Remove space from starting and ending of string.
		System.out.println(name.trim());
		// Prints the character in that index.
		System.out.println(name.charAt(4));
		// Prints the index of that character.
		System.out.println(name.indexOf('i')); // first i index is printed.
//From 4th index it will print till last
		System.out.println(name.substring(4));
//From 2nd index to 14th index will print
		System.out.println(name.substring(2, 15));
//It will compare both string same or not. If not same Return False
		System.out.println(name.equals("Piyasi"));
//Return type of equal is boolean
//It will compare both string same or not. If same Return True
		System.out.println(name.equals(" Piyasi Mondal ")); // Return type of equal is boolean
//It will check the string contains mentioned partial string or not,If yes Return True
		System.out.println(name.contains("asi"));
//Return type of equal is boolean
//It will check the string contains mentioned partial string or not,If No Return False
		System.out.println(name.contains("Mk"));
//Return type of equal is boolean
//It will ignore the case.
		System.out.println(name.equalsIgnoreCase(" piyasi mondal "));
//It will print characters of the string followed by ,
		char[] c = a.toCharArray();
		System.out.println(Arrays.toString(c));
	}
}
