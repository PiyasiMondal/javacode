package basicProgramofJava;

//Assignment 98
import java.util.Date;

public class Time {
	public static void main(String[] args) {
		Date d = new Date();// Date class object
		System.out.println(d.getTime());// Epoch time, Non static method, Return type: Long data type
		Date d1 = new Date(d.getTime());// will print in human understandable language
		System.out.println(d1);
		String Humantime = d1.toString();// Return type is string.
		String Month = Humantime.substring(4, 7);
		System.out.println(Month);// Month
		String Date = Humantime.substring(8, 10);
		System.out.println(Date);// date
		String Year = Humantime.substring(Humantime.length() - 4);
		System.out.println(Year);// year
		String Format1 = Date.concat(Month).concat(Year);
		System.out.println(Format1);
		String Format2 = Date.concat(" ").concat(Month).concat(" ").concat(Year);
		System.out.println(Format2);
		String Format3 = Date.concat("-").concat(Month).concat("-").concat(Year);
		System.out.println(Format3);
		String Format4 = Date.concat("/").concat(Month).concat("/").concat(Year);
		System.out.println(Format4);
		// System.out.println(d.getTime());
		Date d2 = new Date(d.getTime() + (1000 * 60 * 60 * 24 * 3));// Future time
		System.out.println(d2);
		Date d3 = new Date(d.getTime() - (1000 * 60 * 60 * 24 * 3));// Past time
		System.out.println(d3);
	}
}
