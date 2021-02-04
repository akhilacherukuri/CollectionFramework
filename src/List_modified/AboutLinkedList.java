package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AboutLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java LinkedList class can contain duplicate elements.
		// Java LinkedList class maintains insertion order.
		// Java LinkedList class is non synchronized.
		// In Java LinkedList class, manipulation is fast because no shifting needs to
		// occur.
		// java LinkedList class uses a doubly linked list to store the elements.
		// Since it implements Double Linked List, it will have the pre and post address
		// of the elements stored.so insertion and deletion is so
		// easy
		LinkedList<Employee> linkedlist = new LinkedList<Employee>();
		linkedlist.add(new Employee(1, "abc", "abc123@gmail.com", 234567));
		linkedlist.add(new Employee(2, "fgh", "fgh123@gmail.com", 75324357));
		linkedlist.add(new Employee(3, "nbj", "nbj123@gmail.com", 9757667));
		linkedlist.add(new Employee(4, "dafg", "dafg123@gmail.com", 2576867));
		linkedlist.add(new Employee(5, "ghl", "ghl123@gmail.com", 8674367));
		// size() used to get the number of elements in this list
		// return : this method returns the number of elements in this list
		System.out.println(linkedlist.size());
		// adding in first index
		linkedlist.addFirst(new Employee(0, "fhk", "fhk123@gmail.com", 234567));
		// adding in last index
		linkedlist.addLast(new Employee(6, "fhk", "fhk123@gmail.com", 234567));
		for (Object b : linkedlist) {
			System.out.println(b);
		}
		// Returns the first element in this list.
		System.out.println("first employee details in list : " + linkedlist.getFirst());
		// Returns the last element in this list.
		System.out.println("last employee details in list : " + linkedlist.getLast());
		// the element at the specified position in this list
		System.out.println("Specified index : " + linkedlist.get(2));

		System.out.println("Peek method : ");
		// this method is used to look at the object at the top of this list without
		// removing it from the list
		// returns : the head of this list, or null if this list is empty
		System.out.println(linkedlist.peek());
		// this method retrieves the first element but does not remove the first element
		// of this list
		// returns : the first element of this list, or null if this list is empty
		System.out.println(linkedlist.peekFirst());
		// this method retrieves the last element but does not remove the last element
		// of this list
		// returns : the last element of this list, or null if this list is empty

		System.out.println(linkedlist.peekLast());
		System.out.println("After peek method : ");
		ListIterator listiterator = linkedlist.listIterator();
		while (listiterator.hasNext()) {
			System.out.println(listiterator.next());
			// listiterator.remove();
		}
		System.out.println("poll method : ");
		// Printing the top element using poll method without removing it
		System.out.println(linkedlist.poll());
		// Printing the first element
		// returns:the head of this list, or null if this list is empty
		System.out.println(linkedlist.pollFirst());
		// Printing the last element
//returns : the last element of this list, or null if this list is empty
		System.out.println(linkedlist.pollLast());
		System.out.println("After poll method : ");
		for (Object b : linkedlist) {
			System.out.println(b);
		}
		// remove the first element in the list
//returns :the first element from this list
		linkedlist.removeFirst();
		// remove the last element in the list
//returns : the last element from this list
		linkedlist.removeLast();
		System.out.println("After remove first and last elements  ");
		for (Object b : linkedlist) {
			System.out.println(b);
		}

//		ListIterator listiterator1=linkedlist.listIterator();
//		while(listiterator1.hasNext()) {
//			System.out.println(listiterator.next());
//		}

		// System.out.println(linkedlist);

	}

}
