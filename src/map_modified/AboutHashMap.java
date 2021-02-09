package list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import Set.StudentDetails;
//Map can be used for storing group of objects in the form of key-value
//pairs
//The Map interface is not a subtype of the Collection interface.it behaves
//bit difference on collections
//A Map doesn't allow duplicate keys, but you can have duplicate values.
//The implementation classes of map interface are HashMap,
//LinkedHashMap, and TreeMap.
//A Map is useful if you have to search, update or delete elements on the
//basis of a key.

public class AboutHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hashmap is an implementation class of Map interface
//		Hashmap can be used for storing the elements in the from of key
//		value pairs,where the keys cannot be duplicated and values can be
//		duplicated
//		Hashmap allows null in both keys and values
//		Hashmap is not synchronized.
//		Java HashMap class maintains no order.
		HashMap<Integer, Employee> hashmap = new HashMap<Integer, Employee>();
		// the put method is used to associate the specified value with the specified
		// key in this map
		hashmap.put(6, new Employee(10, "abc", "abc123@gmail.com", 234567));
		hashmap.put(7, new Employee(22, "fgh", "fgh123@gmail.com", 75324357));
		hashmap.put(9, new Employee(43, "nbj", "nbj123@gmail.com", 9757667));
		hashmap.put(12, new Employee(89, "dafg", "dafg123@gmail.com", 2576867));
		hashmap.put(32, new Employee(34, "ghl", "ghl123@gmail.com", 8674367));
		// returns the set view of mappings contained in this map
		for (Map.Entry m : hashmap.entrySet()) {
			// getkey(): Returns the key corresponding to this entry.
			// getvalue() : the value corresponding to this entry
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// updating the key value 
		hashmap.put(34, new Employee(43, "qwe", "qwe123@gmail.com", 9988879));

		System.out.println("size : " + hashmap.size());
//		The java.util.HashMap.keySet() method in Java is used to create a set out of the key elements contained in the hash map. 
//		It basically returns a set view of the keys or we can create a new set and store the key elements in them.
//		 // Using keySet() to get the set view of keys 
		System.out.println(hashmap.keySet());
//returns the values contain in map
		System.out.println(hashmap.values());
		// Returns true if this map contains a mapping for the specified key.
		System.out.println(hashmap.containsKey(2));

	}

}
