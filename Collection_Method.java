package basicProgramofJava;

//Assignment 99 to 108
import java.util.Collection;
import java.util.ArrayList;

public class Collection_Method {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		// Add method is use to add single objects
		c.add("Cat");
		c.add("Horse");
		c.add("rat");
		System.out.println(c);
		// Homogeneous value: Same type of data type
		// Collection follow indexing.
		c.add(11);
		c.add('X');
		c.add(9.88);
		c.add(true);
		System.out.println(c);
		// Heterogeneous value:Different type of data
		Collection c1 = new ArrayList();
		c1.addAll(c);// Parameter is collection for
		c1.add("Tiger");// Parameter is object(single)
		c1.add("Lion");
		System.out.println(c1);
		System.out.println(c1.size());// Size of the collection.
		boolean b = c1.isEmpty();// Check if c1 is empty//is empty return type is boolean
		System.out.println(b);
		System.out.println(c.isEmpty());
		System.out.println(c.contains("woolf"));
		System.out.println(c1.containsAll(c));
		c.remove("Cat");// Removes the object
		System.out.println(c);
		c1.removeAll(c);// Removes the entire collection
		System.out.println(c);
		System.out.println(c1);
		c1.clear();// Clear c1
		System.out.println(c1);
	}

}
