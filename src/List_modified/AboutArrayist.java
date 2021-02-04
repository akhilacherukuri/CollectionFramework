package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		// isEmpty() method returns the true if the list is empty otherwise false
		System.out.println(obj1.isEmpty());
		// clear() method is used to remove all of the elements from this list
		obj1.clear();
		System.out.println("After using clear() : "
				+ "");

		System.out.println(obj1.isEmpty());

	}

}
