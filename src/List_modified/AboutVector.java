package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Vector;

public class AboutVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the Vector class implements a growable array of objects.
//		Vector class is legacy class why because vector class present in
//		java 1.0 version
//		Vector implements a dynamic array that means it can grow or
//		shrink as required.
//		Like an array, it contains components that can be accessed using an integer index
//		They are very similar to ArrayList but Vector is synchronized and have some legacy
//		 method which collection framework does not contain.
//		 Vector is a Synchronized class.
//		 Default capacity of the Vector is 10.
		Vector<Employee> obj = new Vector<Employee>();
		obj.add(new Employee(1, "abc", "abc123@gmail.com", 234567));
		obj.add(new Employee(2, "fgh", "fgh123@gmail.com", 75324357));
		obj.add(new Employee(3, "nbj", "nbj123@gmail.com", 9757667));
		obj.add(new Employee(4, "dafg", "dafg123@gmail.com", 2576867));
		obj.add(new Employee(5, "ghl", "ghl123@gmail.com", 8674367));
		Vector v = new Vector(obj);
		v.addElement(new Employee(6, "adf", "adf123@gmail.com", 2467687));
		// size() used to get the number of elements in this list
		// return : this method returns the number of elements in this list
		System.out.println(v.size());
		// Returns the current capacity of this vector.
		System.out.println(v.capacity());
		v.insertElementAt(new Employee(7, "hsdj", "hadj123@gmail.com", 2576867), 3);
		// Removes the element at the specified position in this Vector.
		// Returns the element that was removed from the Vector.
		v.remove(2);
		// returns the first element of this vector
		System.out.println(v.firstElement());
		// returns the last element of this vector
		System.out.println(v.lastElement());
		Enumeration<Employee> e = Collections.enumeration(v);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("clone : ");
		v.clone();
		for (Object b : v) {
			System.out.println(b);
		}
		// returns a list iterator over the elements in this list
		System.out.println("listiterator");
		Iterator<Employee> iterator1 = obj.listIterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		// returns a list iterator over the elements in this list
		// starting at the specified position in the list
		System.out.println("listiterator index : ");
		Iterator<Employee> iterator2 = obj.listIterator(1);
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("spliterator : ");
		Spliterator<Employee> str = obj.spliterator();
		for (Object o : obj) {
			System.out.println(o);
		}

		System.out.println("\nsublist : ");

		// returns the view of portion of this list between the specified from index
		// inclusive to toindex exclusive
		System.out.println(obj.subList(0, 4));
		Object[] a = obj.toArray();
		System.out.println("to array");
		for (Object o : a) {
			System.out.println(o);
		}


	}
	

}
