package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.Line;

public class AboutArrayist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> obj = new ArrayList<Employee>();
		obj.add(new Employee(1, "abc", "abc123@gmail.com", 234567));
		obj.add(new Employee(2, "fgh", "fgh123@gmail.com", 75324357));
		obj.add(new Employee(3, "nbj", "nbj123@gmail.com", 9757667));
		obj.add(new Employee(4, "dafg", "dafg123@gmail.com", 2576867));
		obj.add(new Employee(5, "ghl", "ghl123@gmail.com", 8674367));
		System.out.println(obj.size());
		List obj1 = new ArrayList();

		obj1.addAll(obj);
		System.out.println("get index : " + obj1.get(1));

		for (Object o : obj1) {
			System.out.println(o);
		}
		System.out.println("----------------");
		System.out.println(obj1.remove(1));
		System.out.println("After remove : ");
		Iterator<Employee> iterator = obj1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
