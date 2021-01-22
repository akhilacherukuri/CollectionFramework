package list;

import java.util.Iterator;
import java.util.TreeSet;

public class AboutTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet treeset = new TreeSet();
		treeset.add(new Employee(23, "abc", "abc123@gmail.com", 234567));
		treeset.add(new Employee(2, "fgh", "fgh123@gmail.com", 75324357));
		treeset.add(new Employee(12, "nbj", "nbj123@gmail.com", 9757667));
		treeset.add(new Employee(25, "dafg", "dafg123@gmail.com", 2576867));
		
		treeset.forEach(item ->{System.out.println(item);});
		System.out.println("first element in treeset : "+treeset.first());
		System.out.println("last element in treeset : "+treeset.last());
		System.out.println("headset : "+treeset.headSet(new Employee(23, "abc", "abc123@gmail.com", 234567)));
		System.out.println("tailset : "+treeset.tailSet(new Employee(12, "nbj", "nbj123@gmail.com", 9757667)));
		System.out.println("floor : "+treeset.floor(new Employee(12, "nbj", "nbj123@gmail.com", 9757667)));
		System.out.println("lower : "+treeset.lower(new Employee(12, "nbj", "nbj123@gmail.com", 9757667)));
		System.out.println("ceiling  : "+treeset.ceiling(new Employee(12, "nbj", "nbj123@gmail.com", 9757667)));

		System.out.println("Desceding Order : ");
		Iterator i =treeset.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	





		
	}

}
