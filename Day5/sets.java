1. 

public class Countries {

	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}
2. 
import java.util.HashSet;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Bob");
		set.add("Alice");
		set.add("John");
		set.add("Richard");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
3.
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Bob");
		set.add("Alice");
		set.add("John");
		set.add("Richard");
		
		Iterator<String> it = set.iterator();
		String query = "John";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}
4. 

public class TreeSet{

	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));
	}
}
