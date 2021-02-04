package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AboutHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet class implements Set Interface.
//		It represents the collection that uses a hash table for storage.
//		Hashing is used to store the elements in the HashSet.
//		It contains unique elements
//		HashSet stores the elements by using a mechanism called hashing
//		HashSet contains unique elements only.
//		HashSet allows null value.
//		HashSet class is non synchronized.
//		HashSet doesn't maintain the insertion order. Here, elements are
//		inserted on the basis of their hashcode.
//		HashSet is the best approach for search operations.
//		Note :Hashset extends hashtable class.and hashing technique
//		implements dynamic array
		Set setobj = new HashSet();
		setobj.add(new StudentDetails("abc", 221, 98));
		setobj.add(new StudentDetails("xyz", 222, 99));
		setobj.add(new StudentDetails("ada", 223, 97));
		// System.out.println(setobj.contains(new StudentDetails("fhh", 224, 90)));
		// size() used to get the number of elements in this set
		// return : this method returns the number of elements in this set

		System.out.println("size : " + setobj.size());

		HashSet setobj1 = new HashSet(setobj);
		setobj1.add(new StudentDetails("fhh", 224, 90));
		setobj1.add(new StudentDetails("weq", 225, 94));
		setobj1.add(new StudentDetails("bnm", 226, 91));
//		The containsAll() method of Java Set is used to check whether two sets contain the same elements or not. It takes one set as a parameter and returns
//		True if all of the elements of this set is present in the other set.
		System.out.println(setobj1.containsAll(setobj));
		// size() used to get the number of elements in this set
		// return : this method returns the number of elements in this set

		System.out.println(setobj1.size());
		// it returns the hash code value for this object
		System.out.println(setobj1.hashCode());
		System.out.println(setobj.hashCode());
		System.out.println(setobj1.clone());

		Iterator i = setobj1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("After removing : ");
		//removing all elements in set
		setobj1.removeAll(setobj);
		// System.out.println(setobj1);
		for (Object b : setobj1) {
			System.out.println(b);
		}
		//check the set as empty or not
		//if set contain no elemnts returns true
		//if set contain elements returns false
		System.out.println(setobj1.isEmpty());
		//Removes all of the elements from this set.The set will be empty after this call returns.
		
		setobj1.clear();
		System.out.println(setobj1.isEmpty());

	}

}
