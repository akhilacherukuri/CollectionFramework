package list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import Set.StudentDetails;

public class AboutHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> hashmap = new HashMap<Integer, Employee>();
		hashmap.put(6, new Employee(10, "abc", "abc123@gmail.com", 234567));
		hashmap.put(7, new Employee(22, "fgh", "fgh123@gmail.com", 75324357));
		hashmap.put(9, new Employee(43, "nbj", "nbj123@gmail.com", 9757667));
		hashmap.put(12, new Employee(89, "dafg", "dafg123@gmail.com", 2576867));
		hashmap.put(32, new Employee(34, "ghl", "ghl123@gmail.com", 8674367));
		for (Map.Entry m : hashmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("size : " + hashmap.size());
		System.out.println(hashmap.keySet());
		System.out.println(hashmap.values());
		System.out.println(hashmap.containsKey(2));



	}

}
