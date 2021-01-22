package list;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AboutLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> linkedhashmap = new LinkedHashMap<Integer, Employee>();
		linkedhashmap.put(1, new Employee(1, "aaa", "aaa123@gmail.com", 234));
		linkedhashmap.put(2, new Employee(2, "bbb", "bbb123@gmail.com", 7247));
		linkedhashmap.put(3, new Employee(3, "ccc", "ccc123@gmail.com", 667));
		linkedhashmap.put(4, new Employee(4, "ddd", "dddg123@gmail.com", 267));
		linkedhashmap.put(5, new Employee(5, "eee", "eee123@gmail.com", 767));
		for (Map.Entry m : linkedhashmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		Map<Integer, Employee> linkedhashmap1 = new LinkedHashMap<Integer, Employee>();
		linkedhashmap1.put(6, new Employee(6, "abc", "abc123@gmail.com", 234567));
		linkedhashmap1.put(7, new Employee(7, "fgh", "fgh123@gmail.com", 75324357));
		linkedhashmap1.put(8, new Employee(8, "nbj", "nbj123@gmail.com", 9757667));

		System.out.println("After invoking putAll() method ");
		linkedhashmap.putAll(linkedhashmap1);
		for (Map.Entry m : linkedhashmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		linkedhashmap.remove(2);

		Set set = linkedhashmap.keySet();
		for (Object obj : set) {
			System.out.println("keys : " + obj);
		}
		
		System.out.println("--------Treeset----------");


	}

}
