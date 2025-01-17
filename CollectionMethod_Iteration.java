package basicProgramofJava;

//Assignment 109
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethod_Iteration {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		// Add method is use to add single objects
		c.add("Cat");
		c.add("Horse");
		c.add("rat");
		c.add(11);
		c.add('X');
		c.add(9.88);
		c.add(true);
		System.out.println(c);
		// Abstract method of collection
		Iterator i = c.iterator();
		// returns true if the iteration has more element
		while (i.hasNext())// boolean return type: Can use only boolean return type//next is present
		{
			// Retrns the object
			System.out.println(i.next());
		}
		// Note: Iterator is one of the common method that is applicable for
		// entirecollection hierarchy
	}

}
