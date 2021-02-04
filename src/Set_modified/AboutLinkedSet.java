package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AboutLinkedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedHashSet class represents the LinkedList implementation of
//		Set Interface.
//		It extends the HashSet class and implements Set interface.
//		Like HashSet, It also contains unique elements.
//		It maintains the insertion order .

		Set linkedhashset = new LinkedHashSet();
		linkedhashset.add(new StudentDetails("abc", 221, 98));
		linkedhashset.add(new StudentDetails("xyz", 222, 99));
		linkedhashset.add(new StudentDetails("ada", 223, 97));
		// System.out.println(setobj.contains(new StudentDetails("fhh", 224, 90)));
		System.out.println("size : " + linkedhashset.size());

		LinkedHashSet linkedhashset1 = new LinkedHashSet(linkedhashset);
		linkedhashset1.add(new StudentDetails("fhh", 224, 90));
		linkedhashset1.add(new StudentDetails("weq", 225, 94));
		linkedhashset1.add(new StudentDetails("bnm", 226, 91));
//The containsAll() method of Java Set is used to check whether two sets contain the same elements or not. It takes one set as a parameter and returns
//		True if all of the elements of this set is present in the other set.

		System.out.println(linkedhashset1.containsAll(linkedhashset));
		// size() used to get the number of elements in this set
		// return : this method returns the number of elements in this set

		System.out.println(linkedhashset1.size());
		// it returns the hash code value for this set

		System.out.println(linkedhashset1.hashCode());
		System.out.println(linkedhashset1.hashCode());
		System.out.println(linkedhashset1.clone());

		Iterator i = linkedhashset1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("After removing : ");
		//removing all elements in set

		linkedhashset1.removeAll(linkedhashset);
		// System.out.println(setobj1);
		for (Object b : linkedhashset1) {
			System.out.println(b);
		}

	}

}
