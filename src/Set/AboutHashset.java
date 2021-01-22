package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AboutHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set setobj = new HashSet();
		setobj.add(new StudentDetails("abc", 221, 98));
		setobj.add(new StudentDetails("xyz", 222, 99));
		setobj.add(new StudentDetails("ada", 223, 97));
		// System.out.println(setobj.contains(new StudentDetails("fhh", 224, 90)));
		System.out.println("size : " + setobj.size());

		HashSet setobj1 = new HashSet(setobj);
		setobj1.add(new StudentDetails("fhh", 224, 90));
		setobj1.add(new StudentDetails("weq", 225, 94));
		setobj1.add(new StudentDetails("bnm", 226, 91));

		System.out.println(setobj1.containsAll(setobj));
		System.out.println(setobj1.size());
		System.out.println(setobj1.hashCode());
		System.out.println(setobj.hashCode());
		System.out.println(setobj1.clone());


		Iterator i = setobj1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("After removing : ");
		setobj1.removeAll(setobj);
		//System.out.println(setobj1);
		for (Object b : setobj1) {
			System.out.println(b);
		}
		System.out.println(setobj1.isEmpty());
		setobj1.clear();
		System.out.println(setobj1.isEmpty());

	}

}
