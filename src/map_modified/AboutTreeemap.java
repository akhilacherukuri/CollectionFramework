package list;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AboutTreeemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Java TreeMap contains values based on the key.
//		● It implements the NavigableMap interface and extends sortedMap.
//		● Java TreeMap contains only unique elements.
//		● Java TreeMap cannot have a null key but can have multiple null
//		values.
//		● Java TreeMap is non synchronized.
//		● Java TreeMap maintains ascending order.
		TreeMap<Integer, Employee> treemap = new TreeMap<Integer, Employee>();
		treemap.put(32, new Employee(1, "aaa", "aaa123@gmail.com", 234));
		treemap.put(24, new Employee(2, "bbb", "bbb123@gmail.com", 7247));
		treemap.put(98, new Employee(3, "ccc", "ccc123@gmail.com", 667));
		for (Map.Entry m : treemap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
//Returns a Set view of the keys contained in this map. 
		Set set = treemap.keySet();
		for (Object obj : set) {
			System.out.println("keys : " + obj);
		}
		// removing the keyValue of 2 in treemap
		// Removes the mapping for this key from this TreeMap if present.
		treemap.remove(2);

		// inserting the key value of 4
		treemap.put(98, new Employee(4, "dddd", "dddd123@gmail.com", 798));
//This method will return the value of the key that is specified

		// retriving the value of a particular key mentioned
		System.out.println(treemap.get(4));

		// Using keySet() to get the set view of keys
		System.out.println(treemap.keySet());
//		// Returns true if this map contains a mapping for the specified key.
		System.out.println(treemap.containsKey(4));
//returns the values contain in map

		// Using values() to get the set view of values
		System.out.println(treemap.values());

		// Displaying the size of the map
		System.out.println(treemap.size());

		// Using entrySet() to get the set view
		System.out.println(treemap.entrySet());

//				The higherKey() method of java. util. TreeMap class is used to 
//				return the least key strictly greater than the given key, or null if there is no such key
		System.out.println("higherkey:" + treemap.higherKey(24));

//				 The lowerKey(K key) method is used to return the greatest key strictly less than
//				 the given key, or null if there is no such key.
		System.out.println("lowerkey:" + treemap.lowerKey(32));

//				 The firstEntry() method is used to return a key-value 
//				 mapping associated with the least key in this map, or null if the map is empty.
		System.out.println("FirstEntry:" + treemap.firstEntry());

	}

}
