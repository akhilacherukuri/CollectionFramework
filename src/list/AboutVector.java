package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class AboutVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> obj = new ArrayList<Employee>();
		obj.add(new Employee(1, "abc", "abc123@gmail.com", 234567));
		obj.add(new Employee(2, "fgh", "fgh123@gmail.com", 75324357));
		obj.add(new Employee(3, "nbj", "nbj123@gmail.com", 9757667));
		obj.add(new Employee(4, "dafg", "dafg123@gmail.com", 2576867));
		obj.add(new Employee(5, "ghl", "ghl123@gmail.com", 8674367));
		Vector v = new Vector(obj);
		v.addElement(new Employee(6, "adf", "adf123@gmail.com", 2467687));
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.insertElementAt(new Employee(7, "hsdj", "hadj123@gmail.com", 2576867), 3);
		Enumeration<Employee> e = Collections.enumeration(v);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println("clone : ");
		v.clone();
		for (Object b : v) {
			System.out.println(b);
		}

	}

}
