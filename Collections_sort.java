package basicProgramofJava;

//Assignment 114,115
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_sort {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<String>();
		// Add method is use to add single objects
		c.add("cat");
		c.add("horse");
		c.add("rat");
		c.add("dog");
		c.add("lion");
		c.add("tiger");
		System.out.println(c);
		Collections.sort(c);
		System.out.println(c);
		ArrayList<Integer> no = new ArrayList<Integer>();
		// Add method is use to add single objects
		no.add(19);
		no.add(20);
		no.add(17);
		no.add(15);
		no.add(16);
		no.add(18);
		System.out.println(no);
		Collections.sort(no);
		System.out.println(no);

	}
}
