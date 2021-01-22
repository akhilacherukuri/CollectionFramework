package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AboutLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> linkedlist = new LinkedList<Employee>();
		linkedlist.add(new Employee(1, "abc", "abc123@gmail.com", 234567));
		linkedlist.add(new Employee(2, "fgh", "fgh123@gmail.com", 75324357));
		linkedlist.add(new Employee(3, "nbj", "nbj123@gmail.com", 9757667));
		linkedlist.add(new Employee(4, "dafg", "dafg123@gmail.com", 2576867));
		linkedlist.add(new Employee(5, "ghl", "ghl123@gmail.com", 8674367));
		System.out.println(linkedlist.size());
		linkedlist.addFirst(new Employee(0, "fhk", "fhk123@gmail.com", 234567));
		linkedlist.addLast(new Employee(6, "fhk", "fhk123@gmail.com", 234567));
		for (Object b : linkedlist) {
			System.out.println(b);
		}
		System.out.println("first employee details in list : "+linkedlist.getFirst());
		System.out.println("last employee details in list : "+linkedlist.getLast());
		System.out.println("Specified index : "+linkedlist.get(2));
		
		System.out.println("Peek method : ");
		System.out.println(linkedlist.peek());
		System.out.println(linkedlist.peekFirst());
		System.out.println(linkedlist.peekLast());
		System.out.println("After peek method : ");
		ListIterator listiterator=linkedlist.listIterator();
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
		//listiterator.remove();
		}
		System.out.println("poll method : ");
		
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist.pollFirst());
		System.out.println(linkedlist.pollLast());
		System.out.println("After poll method : ");
		for (Object b : linkedlist) {
			System.out.println(b);
		}
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("After remove first and last elements  ");
		for (Object b : linkedlist) {
			System.out.println(b);
		}
		
//		ListIterator listiterator1=linkedlist.listIterator();
//		while(listiterator1.hasNext()) {
//			System.out.println(listiterator.next());
//		}


		//System.out.println(linkedlist);
		
	
	}

}
