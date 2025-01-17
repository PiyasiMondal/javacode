package basicProgramofJava;

//Assignment 116 to 127
import java.util.Map;
import java.util.Set;
//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class Map_Practice {

	public static void main(String[] args) {
		// Map m=new HashMap();
		// m.put("Rice", 10);
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Piya", "gtm96");// Object,object
		m1.put("Riya", "gtm99");
		m1.put("Siya", "gtm90");
		m1.put("Liya", "gtm95");
		m1.put("Tiya", "gtm91");
		System.out.println(m1);
		// Do not follow indexing
		// Key,Value.
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Rice", 10);
		m2.put("Jagery", 5);
		m2.put("Sugar", 3);
		m2.put("Salt", 2);
		m2.put("Wheat", 1);
		System.out.println(m2);
		Map<String, Character> m3 = new HashMap<String, Character>();
		m3.put("Piya", 'F');// Object,object
		m3.put("Riya", 'F');
		m3.put("Siya", 'F');
		m3.put("Liya", 'F');
		m3.put("Tinmay", 'M');
		System.out.println(m3);
		Map<String, Double> m4 = new HashMap<String, Double>();
		m4.put("Piya", 150000.0);// Object,object
		m4.put("Riya", 100000.9);
		m4.put("Siya", 90000.9);
		m4.put("Liya", 80000.89);
		m4.put("Tinmay", 700000.6);
		System.out.println(m4);
		Map<String, Double> m5 = new HashMap<String, Double>();
		m5.put("Piya", 150000.0);// Object,object
		m5.put("Riya", 100000.9);
		m5.put("Siya", 90000.9);
		m5.put("Liya", 80000.89);
		m5.put("Tinmay", 700000.6);
		System.out.println(m5);
		boolean b1 = m4.equals(m5);
		System.out.println(b1);
		Map<String, Double> m6 = new HashMap<String, Double>();
		m6.put("kriti", 150000.0);// Object,object
		m6.put("Sriti", 100000.9);
		m6.put("Mriti", 90000.9);
		m6.put("Triti", 80000.89);
		m6.put("Nriti", 700000.6);
		System.out.println(m6);
		m6.putAll(m5);
		System.out.println(m6);
		m6.putIfAbsent("kriti", 150000.0);
		System.out.println(m6);
		m6.putIfAbsent("Rriti", 250000.0);
		System.out.println(m6);
		for (String s1 : m6.keySet()) {
			System.out.println("Fetch all keys:" + s1);
		}
		for (Double s2 : m6.values()) {
			System.out.println("Fetch all Values:" + s2);
		}
		for (java.util.Map.Entry<String, Double> s3 : m6.entrySet()) {
			System.out.println("Fetch all key and Values:" + s3);
		}
		Set<java.util.Map.Entry<String, Double>> s4 = m6.entrySet();
		Iterator<java.util.Map.Entry<String, Double>> i1 = s4.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		m6.remove("kriti");
		System.out.println(m6);
		m6.remove("Nriti", 700000.6);
		System.out.println(m6);
		System.out.println(m6.get("Triti"));// Get the value of the given key.
		System.out.println(m6.containsKey("Triti"));
		System.out.println(m6.containsValue(80000.89));
		System.out.println(m6.containsKey("Lichi"));
		System.out.println(m6.containsValue(889.8));
		System.out.println(m6.isEmpty());
		m6.clear();
		System.out.println(m6.isEmpty());
	}
	// Set<String>s1= m6.keySet();
}
