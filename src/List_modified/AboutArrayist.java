package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

import javax.sound.sampled.Line;

public class AboutArrayist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java ArrayList class uses a dynamic array for storing the elements.
		// Java ArrayList class can contain duplicate elements.
		// Java ArrayList class maintains insertion order.
		// ArrayList present in java.util package
		// Java ArrayList allows us to randomly access the list.
		// Heterogeneous(different types) objects are allowed.
// why we use : It is better to use ArrayList, in order to retrieve the
		// data because ArrayList implements RandomAccessinterface
		ArrayList<Employee> obj = new ArrayList<Employee>();
		obj.add(new Employee(1, "abc", "abc123@gmail.com", 234567));
		obj.add(new Employee(2, "fgh", "fgh123@gmail.com", 75324357));
		obj.add(new Employee(3, "nbj", "nbj123@gmail.com", 9757667));
		obj.add(new Employee(4, "dafg", "dafg123@gmail.com", 2576867));
		obj.add(new Employee(5, "ghl", "ghl123@gmail.com", 8674367));
		System.out.println(obj.size());
		ArrayList obj1 = new ArrayList();
		obj1.add("abc");
		obj1.add("lakshmi");
		obj1.add("akhi");
		obj1.add("navya");
		// The contains() method is used to determines whether an element exists in an
		// ArrayList object.

//returns true if this list contains the specified element
		System.out.println("contains : " + obj1.contains("navya"));
		// the index of the first occurrence of the specified element in this list, or
		// -1 if this list does not contain the element
		System.out.println("indexOf : " + obj1.indexOf("abc"));// 0
		System.out.println(obj1.indexOf("nav"));// -1
//	    The lastIndexOf() method is used to get the index of the last occurrence of an element in an ArrayList object.
		System.out.println("lastIndexOf : " + obj1.lastIndexOf("navya"));

		Collections.sort(obj1);
		System.out.println("sort : " + obj1);

//addAll(): the addAll() is a method of java collections class which adds all of the specified elements to the specified collection
		obj1.addAll(obj);
		// get() method is used to get the element of a specified index within the list
		// return: it returns the element at the specified index in the given list.
		System.out.println("get index : " + obj1.get(1));
		// size() used to get the number of elements in this list
		// return : this method returns the number of elements in this list
		System.out.println(obj1.size());
		for (Object o : obj1) {
			System.out.println(o);
		}
		System.out.println("----------------");
		// remove() method is used to remove the element present at the specified
		// position in the list
		// returns the removed element
		System.out.println(obj1.remove(1));
		// it returns true if the list contains the specified element.otherwise returns
		// false
		System.out.println(obj1.contains("abc"));
		System.out.println("After remove : ");
		Iterator<Employee> iterator = obj1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// returns a list iterator over the elements in this list
		System.out.println("listiterator");
		Iterator<Employee> iterator1 = obj1.listIterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		// returns a list iterator over the elements in this list
		// starting at the specified position in the list
		System.out.println("listiterator index : ");
		Iterator<Employee> iterator2 = obj1.listIterator(1);
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("spliterator : ");
		Spliterator<Employee> str = obj1.spliterator();
		for (Object o : obj1) {
			System.out.println(o);
		}

		System.out.println("\nsublist : ");

		// returns the view of portion of this list between the specified from index
		// inclusive to toindex exclusive
		System.out.println(obj1.subList(0, 4));
		Object[] a = obj1.toArray();
		System.out.println("to array");
		for (Object o : a) {
			System.out.println(o);
		}

		// isEmpty() method returns the true if the list is empty otherwise false
		System.out.println(obj1.isEmpty());
		// clear() method is used to remove all of the elements from this list
		obj1.clear();
		System.out.println("After using clear() : " + "");

		System.out.println(obj1.isEmpty());

	}

}
