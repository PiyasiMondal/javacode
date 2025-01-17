package basicProgramofJava;

//Assignment 110, 111
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Interface {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add(-1);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add("sun");
		l.add("sun");
		l.add(null);
		l.add(null);
		System.out.println(l);
		// Follow indexing
		// Follow order of insertion
		// Accepts duplicate
		// Dynamic in nature
		// Hetrogiious
		Iterator i = l.iterator();
		// returns true if the iteration has more element
		System.out.println("Forward iteration using Iterator");
		while (i.hasNext())// boolean return type: Can use only boolean return type//next is present
		{
			// Retrns the object
			System.out.println(i.next());
		}
		ListIterator Li = l.listIterator();
		System.out.println("Forward iteration using ListIterator");
		while (Li.hasNext()) {
			// Forward iteration
			System.out.println(Li.next());
		}
		System.out.println("Backword iteration using ListIterator");
		while (Li.hasPrevious()) {
			// Backward iteration
			System.out.println(Li.previous());
		}
		List l1 = new ArrayList();
		l1.addAll(l);// Parameter is list for
		l1.add("Tiger");// Parameter is object(single)
		l1.add("Lion");
		System.out.println(l1);
		System.out.println(l1.size());// Size of the list.
		boolean b = l1.isEmpty();// Check if l1 is empty//is empty return type isboolean
		System.out.println(b);
		System.out.println(l.isEmpty());
		System.out.println(l.contains("woolf"));
		System.out.println(l1.containsAll(l));
		l.remove("Cat");// Removes the object
		System.out.println(l);
		l1.removeAll(l);// Removes the entire List
		System.out.println(l);
		System.out.println(l1);
		l1.clear();// Clear c1
		System.out.println(l1);
	}

}
